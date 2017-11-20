package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api;

import com.google.gson.Gson;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.DynamicDataDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorsDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.exception.ApiException;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.DynamicData;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.Error;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.UpateInformation;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.response.DynamicDataResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Size;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Api(description = "Uebung 1 - Loesung", tags = {"vehicle data"})
@Controller
public class DynamicApi {

    @ApiOperation(value = "Returns the dynamic data of an vehicle.", notes = "Position will be returned only, if vehicle " +
            "tracking is enabled. This method calls the CCG (Connected charging Gateway) and requests information " +
            "about the current vehicle state. formerly: ` /dynamicdata/v1/{vin}` ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = DynamicDataResponse.class),
            @ApiResponse(code = 403, message = "user is not allowed to access"),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 502, message = "An error occurred in backend v1, unable to process the request in a proper way.", response = Errors.class)})
    @RequestMapping(value = "/dynamic/{vin}", produces = "application/json", method = RequestMethod.GET)
    public ResponseEntity<?> dynamicVinGet(@Size(min = 17, max = 17)
                                           @ApiParam(value = "the vin[17 characters] for which the services will be returned", required = true,defaultValue = "V1234567891234567")
                                           @PathVariable("vin") String vin,
                                           @ApiParam(value = "offset in minutes from GMT, default is 0")
                                           @RequestParam(value = "offset", required = false) Integer offset) {

        // 1. transform parameters of v2 into v1
        // 2. call v1 API
        DynamicDataDO dynamicDataDO = null;
        try {
            dynamicDataDO = callDynamicDataAPIv1(vin);
        } catch (ApiException e) {
            return transformApiExceptionToResponseEntity(e);
        }

        // 3. transform v1 data into v2
        DynamicData dynamicData = transformV1toV2(dynamicDataDO);

        // 4. return it
        DynamicDataResponse dynamicDataResponse = new DynamicDataResponse();
        dynamicDataResponse.setData(dynamicData);
        return new ResponseEntity<>(dynamicDataResponse, HttpStatus.OK);
    }

    /**
     * Generic transformation of an ApiException to a response entity
     * @param e the
     * @return the response entity corresponding to the given Exception
     */
    private ResponseEntity<?> transformApiExceptionToResponseEntity(ApiException e) {
        Errors err = new Errors();
        Error er = new Error();
        er.setMessage(e.getMessage());
        er.setErrorCode(Error.ErrorCode.fromHttpStatusCode(e.getHttpCode()));
        err.addErrorsItem(er);
        DynamicDataResponse dynamicDataResponse = new DynamicDataResponse();
        // the appropriate mapping on http status codes is done in enum ErrorCode
        return new ResponseEntity<>(err, e.getHttpCode());
    }

    /**
     * transforms the v1 response into v2.
     *
     * @param dynamicDataDO v1 Data Object
     * @return the v2 Data Object
     */
    private DynamicData transformV1toV2(DynamicDataDO dynamicDataDO) {
        DynamicData dynamicData = new DynamicData();
        UpateInformation upateInformation = new UpateInformation();
        String unitOfLength = dynamicDataDO.getAttributesMap().get("unitOfLength");
        UpateInformation.UnitOfLengthEnum unitOfLengthEnum = UpateInformation.UnitOfLengthEnum.fromValue(unitOfLength);
        upateInformation.setUnitOfLength(unitOfLengthEnum);
        dynamicData.setUpdateInformation(upateInformation);
        return dynamicData;
    }

    /**
     * calls v1 with for the given vehicle
     * @param vin describing the vehicle for which to obtain the dynamic parameters
     * @return response object of v1 if service returned status code 200
     * @throws ApiException if response code is not 200. Describes the error from v1.
     */
    private DynamicDataDO callDynamicDataAPIv1(@Size(min = 17, max = 17) @ApiParam(value = "the vin[17 characters] for " +
            "which the services will be returned", required = true) @PathVariable("vin") String vin) throws ApiException {

        // open connection and send get request to v1
        String urlString = "http://localhost:8080/dynamic/" + vin;
        int responseCode;
        HttpURLConnection con;
        try {
            URL url = new URL(urlString);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            responseCode = con.getResponseCode();
        } catch (IOException e) {
            throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Error connecting v1");
        }


        switch (HttpStatus.valueOf(responseCode)) {
            // response codes without body
            case FORBIDDEN:
                throw new ApiException(FORBIDDEN, "user is not allowed to access");
            case NOT_FOUND:
                throw new ApiException(HttpStatus.NOT_FOUND, "vehicle and/or services not found");
            // response codes with body --> read content
            case OK:
                DynamicDataDO v1Response = new DynamicDataDO();
                v1Response = new Gson().fromJson(readBody(con), DynamicDataDO.class);
                return v1Response;
            // response codes with errors in body
            case INTERNAL_SERVER_ERROR:
            case SERVICE_UNAVAILABLE:
                // responseCode either 500 200: parse error from json
                ErrorsDO errorsDO = new Gson().fromJson(readBody(con), ErrorsDO.class);
                ErrorDO errorDO = errorsDO.getErrors().get(0);
                throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, errorDO.getMessage());
            default:
                // unexpected responseCode
                throw new ApiException(HttpStatus.INTERNAL_SERVER_ERROR, "Unexpected response code from v1");
        }

    }

    private String readBody(HttpURLConnection con) throws ApiException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuffer sb = new StringBuffer();
            String output;
            while ((output = bufferedReader.readLine()) != null) {
                sb.append(output);
            }

            bufferedReader.close();
            System.out.print(sb);
            String response = sb.toString();
            return response;
        } catch (IOException e) {
            throw new ApiException(INTERNAL_SERVER_ERROR, "could not parse content from v1");
        }

    }

}
