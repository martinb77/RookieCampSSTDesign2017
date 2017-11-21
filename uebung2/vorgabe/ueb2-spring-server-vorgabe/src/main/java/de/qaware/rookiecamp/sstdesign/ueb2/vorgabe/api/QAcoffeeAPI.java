package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.*;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

import static java.util.Collections.emptyList;


@Api(value = "Our super duper QAcoffee evaluation API", description = "Best API in the world!", tags = {"qacoffee"})
@RequestMapping(path = "/api", produces = "application/qacoffee.v1+json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns the list of time coffee periods")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, returns the list of time coffee periods or an empty list"),
            @ApiResponse(code = 403, message = "Not authenticated")
    })
    @RequestMapping(path = "/time-coffee-periods", method = RequestMethod.GET)
    public ResponseEntity<TimeCoffeePeriodsDO> getTimeCoffeePeriods() {
        // TODO fill
        // Is authenticated?
        return ResponseEntity.ok(new TimeCoffeePeriodsDO());
    }

    @ApiOperation(value = "Returns the list of beverages")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, returns the list of beverages or an empty list"),
            @ApiResponse(code = 403, message = "Not authenticated"),
    })
    @RequestMapping(path = "/beverages", method = RequestMethod.GET)
    public ResponseEntity<BeveragesDO> getBeverages() {
        // Is authenticated?
        return ResponseEntity.ok(new BeveragesDO());
    }

    @ApiOperation(value = "Store evaluation")
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "Successful operation, evaluation was stored"),
            @ApiResponse(code = 403, message = "Not authenticated"),
            @ApiResponse(code = 400, message = "Invalid data"),
            @ApiResponse(code = 409, message = "Conflict"),

    })
    @RequestMapping(path = "/evaluate", method = RequestMethod.POST, consumes = "application/qacoffee.v1+json")
    public ResponseEntity<Errors> evaluate(@RequestBody EvaluationDO evaluation) {
        // Is authenticated?

        if (/* INVALID DATA */ false) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new Errors());
        }

        try {
            Integer userId = /* session.get("userId"); */ null;

            /** SAVE **/
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new Errors());
        }
    }
}
