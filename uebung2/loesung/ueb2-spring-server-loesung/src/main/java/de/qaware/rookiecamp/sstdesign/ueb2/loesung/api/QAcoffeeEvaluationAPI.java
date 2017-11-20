package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Evaluation;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response.BooleanResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Api(description = "The QAcoffee evaluation API - for evaluating beverages.", tags = {"evaluation"})
@RequestMapping(path = "/evaluation", produces = "application/json")
@Controller
public class QAcoffeeEvaluationAPI {

    @ApiOperation(value = "Place a new evaluation.", notes = "Returns TRUE if the evaluation was successful processed, FALSE if not + Errors.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 400, message = "Wrong parameters, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/evaluate", method = RequestMethod.POST)
    public ResponseEntity<BooleanResponse> evaluate(@ApiParam(value = "the evaluating employee", required = true) @RequestParam  Integer employeeId,
                                                    @ApiParam(value = "the evaluation itself", required = true) @RequestBody  Evaluation evaluation) {
        //some magic here...
        return ResponseEntity.ok().build();
    }

}
