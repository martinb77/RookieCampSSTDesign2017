package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api;

        import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.exception.ApiException;
        import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.DynamicDataDO;
        import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorDO;
        import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model.ErrorsDO;
        import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.mock.DynamicDataMock;
        import io.swagger.annotations.*;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RequestParam;

/**
 * Uebung 1 in Rookie Camp Schnittstellendesign
 *
 * This is the Mock-Implementation for the given backendservice returning the dynamic data of a vehicle.
 */
@Api(description = "the dynamic API", tags = {"vehicle data"})
@RequestMapping(path = "/dynamic", produces = "application/json")
@Controller
public class DynamicApi {

    @ApiOperation(value = "This method returns the dynamic data of an vehicle.",
            notes = "Position will be returned only, if vehicle tracking is enabled. This method calls the " +
                    "CCG (Connected charging Gateway) and requests information about the following attributes: " +
                    "beConditionBasedSer-vices, beMaxRangeFuel, beMaxRangeElectric, beRemainingRangeFuel, " +
                    "beRemainingRangeElectric, unitOfLength, unitOfEnergy, unitOfElectricConsumption, " +
                    "unitOfCombustionConsumption, isAmPm, updateTime, Segment_LastTrip_time_segment_end. " +
                    "BevService.getVehicleInformation(); formerly: /dynamicdata/v1/{vin} ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful operation", response = DynamicDataDO.class),
            @ApiResponse(code = 403, message = "user is not allowed to access"),
            @ApiResponse(code = 404, message = "vehicle and/or services not found"),
            @ApiResponse(code = 500, message = "An internal error occurred", response = ErrorsDO.class),
            @ApiResponse(code = 503, message = "A business exception occurred", response = ErrorsDO.class)})

    @RequestMapping(path = "/{vin}", method = RequestMethod.GET)
    public ResponseEntity<?> dynamicVinGet(@ApiParam(value = "the vin[17 characters] for which the services will be returned", required = true,defaultValue = "V1234567891234567")
                                           @PathVariable String vin,
                                           @ApiParam(value = "offset in minutes from GMT, default is 0")
                                           @RequestParam(value = "offset", required = false) Integer offset) {

        DynamicDataDO dynamicDataDO = null;
        try {
            dynamicDataDO = new DynamicDataMock().obtainDynamicDataDO(vin);
        } catch (ApiException e) {
            if (e.getCode() == HttpStatus.SERVICE_UNAVAILABLE) {
                return createErrorResponse(e);
            }
            if (e.getCode() == HttpStatus.NOT_FOUND){
                // no body , just response code
                return new ResponseEntity<>( HttpStatus.NOT_FOUND);
            }
        }
        if (dynamicDataDO != null) {
            return new ResponseEntity<>(dynamicDataDO, HttpStatus.OK);
        }
        return createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "internal error occured");
    }

    private ResponseEntity<?> createErrorResponse(HttpStatus status, String message) {
        ErrorsDO err = new ErrorsDO();
        ErrorDO e = new ErrorDO();
        e.setMessage(message);
        e.setErrorCode(String.valueOf(status.value()));
        err.addErrorsItem(e);

        return new ResponseEntity<>(err, status);
    }

    private ResponseEntity<?> createErrorResponse(ApiException ex) {
        return createErrorResponse(ex.getCode(), ex.getMessage());
    }

}
