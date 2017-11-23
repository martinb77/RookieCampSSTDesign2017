package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(value = "theAPI", description = "some description about this API", tags = {"someTag"})
@RequestMapping(path = "/api", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns something.", notes = "some description here")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/doSomething", method = RequestMethod.GET)
    public ResponseEntity<BooleanResponse> doSomething() {
        //TODO: do some magic!
        //this may be a
        //- small implementation
        //- delegate to business
        //-- via Java Interface injected
        //-- just a delegate implmentation
        return new ResponseEntity<>(new BooleanResponse(Boolean.TRUE, null), HttpStatus.OK);
    }

}
