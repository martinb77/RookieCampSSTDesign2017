package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.*;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BeverageResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.CoffeeResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;


@Api(value = "theAPI", description = "some description about this API", tags = {"beverages"})
@RequestMapping(path = "/api", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns available beverages", notes = "some more description here")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/beverages", method = RequestMethod.GET)
    public ResponseEntity<BeverageResponse> getBeverages() {
        return new ResponseEntity<>(new BeverageResponse(Arrays.asList(new Beverage(1, "Gobileo"), new Beverage(2, "Giesing")), new Errors()), OK);
    }

    @ApiOperation(value = "Returns available beverages", notes = "some more description here")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = CoffeeResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/coffee", method = RequestMethod.GET)
    public ResponseEntity<CoffeeResponse> getCoffees() {
        return new ResponseEntity<>(new CoffeeResponse(demoCoffees(), new Errors()), OK);
    }


    @ApiOperation(value = "Send a review", notes = "some more description here")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/review", method = RequestMethod.PUT)
    public ResponseEntity<BooleanResponse> sendReview(CoffeeReview review) {
        System.out.println(review);
        return new ResponseEntity<>(new BooleanResponse(true, new Errors()), OK);
    }

    private List<Coffee> demoCoffees() {
        return Arrays.asList(
                new Coffee(1,"Fausto", "images/fausto.png", new TimePeriod(new Date(0), new Date(1))),
                new Coffee(2,"Dinzler", "images/dinzler.png", new TimePeriod(new Date(2), new Date(3))));
    }


}
