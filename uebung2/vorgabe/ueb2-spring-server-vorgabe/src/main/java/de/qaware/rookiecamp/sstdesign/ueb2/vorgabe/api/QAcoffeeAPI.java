package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Evaluation;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.TimePeriod;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.QAcoffeeResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Api(value = "coffee evalauation API", description = "Backend for QACoffe UI to revrieve all relevant infromation", tags = {"coffee"})
@RequestMapping(path = "/api/v1", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "returns available beverages.", notes = "beverage types like espresso.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 400, message = "Error in request parameters.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)
    })
    @RequestMapping(path = "/beverages", method = RequestMethod.GET)
    public ResponseEntity<QAcoffeeResponse<List<Beverage>>> getAvailabeBeverages() {
        List<Beverage> beverageList=new ArrayList<>();
        //todo implement mock or fetch form database
        return new ResponseEntity<QAcoffeeResponse<List<Beverage>>>(QAcoffeeResponse.of(beverageList), HttpStatus.OK);
    }

    @ApiOperation(value = "time periods and the associated coffee that was available in this period", notes = "if there are no periods(yet) available an empty list is returned")
    @RequestMapping(path = "/timePeriods", method = RequestMethod.GET)
    public ResponseEntity<QAcoffeeResponse<List<TimePeriod>>> getTimePeriods() {
        List<TimePeriod> timePeriods=new ArrayList<>();
        //todo implement mock or fetch form database
        return new ResponseEntity<QAcoffeeResponse<List<TimePeriod>>>(QAcoffeeResponse.of(timePeriods), HttpStatus.OK);
    }



    @ApiOperation(value = "send a new evaluation result", notes = "if there are no periods(yet) available an empty list is returned")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful operation, may contain business errors.", response = QAcoffeeResponse.class),
            @ApiResponse(code = 403, message = "user is not allowed to access"),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 502, message = "An error occurred in backend v1, unable to process the request in a proper way.", response = Errors.class)})
    @RequestMapping(path = "/evaluation", method = RequestMethod.POST)
    public ResponseEntity<?> postEvaluation(Evaluation evaluation) {
        List<TimePeriod> timePeriods=new ArrayList<>();
        //todo implement mock or fetch form database
        return new ResponseEntity<>(QAcoffeeResponse.of(null), HttpStatus.CREATED);
    }

}
