package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api;

import com.google.gson.Gson;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.DynamicDataDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorsDO;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.exception.ApiException;

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

import static org.springframework.http.HttpStatus.*;

@Api(description = "Uebung 1 - Vorgabe", tags = {"vehicle data"})
@Controller
public class DynamicApi {

    @ApiOperation(value = "Returns the dynamic data of an vehicle.", notes = "Position will be returned only, if vehicle " +
            "tracking is enabled. This method calls the CCG (Connected charging Gateway) and requests information " +
            "about the current vehicle state. formerly: ` /dynamicdata/v1/{vin}` ")
    @ApiResponses(value = {
    // TODO: add possible api responses with corresponding http status codes
    // example: @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = xxx.class)
    })
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
        // TODO: transform v1 data structure in the new v2 data structure

        // 4. return it
        // TODO: return the new datastructure
        return new ResponseEntity<>(OK);
    }

    private ResponseEntity<?> transformApiExceptionToResponseEntity(ApiException e) {
        // TODO: Handle error in response of v1
        return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
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
            throw new ApiException(INTERNAL_SERVER_ERROR, "Error connecting v1");
        }


        switch (HttpStatus.valueOf(responseCode)) {
            // response codes without body
            case FORBIDDEN:
                throw new ApiException(FORBIDDEN, "user is not allowed to access");
            case NOT_FOUND:
                throw new ApiException(NOT_FOUND, "vehicle and/or services not found");
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
                throw new ApiException(INTERNAL_SERVER_ERROR, errorDO.getMessage());
            default:
                // unexpected responseCode
                throw new ApiException(INTERNAL_SERVER_ERROR, "Unexpected response code from v1");
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

            String response = sb.toString();
            return response;
        } catch (IOException e) {
            throw new ApiException(INTERNAL_SERVER_ERROR, "could not parse content from v1");
        }

    }

}
