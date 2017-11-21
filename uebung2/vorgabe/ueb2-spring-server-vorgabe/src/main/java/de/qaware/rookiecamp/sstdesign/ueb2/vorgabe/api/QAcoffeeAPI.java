package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.CoffeesDto;
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


@Api(value = "QAcoffeeAPI", description = "The API to the QAcoffeeAPI")
@RequestMapping(path = "/api/v1/coffee", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns the available beverages", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/availableCoffees", method = RequestMethod.GET)
    public ResponseEntity<CoffeesDto> doSomething() {
        //TODO: do some magic!
        //this may be a
        //- small implementation
        //- delegate to business
        //-- via Java Interface injected
        //-- just a delegate implmentation
        return new ResponseEntity<>(new BooleanResponse(Boolean.TRUE, null), HttpStatus.OK);
    }

}
