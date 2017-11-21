package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto.EvaluationChoicesDTO;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto.EvaluationDTO;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.EvaluationChoicesResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.EvaluationResponse;
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


@Api(value = "theAPI", description = "some description about this API", tags = {"someTag"})
@RequestMapping(path = "/api", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns choices.", notes = "Indeed, it returns the choices")
    @RequestMapping(path = "/choices", method = RequestMethod.GET)
    public ResponseEntity<EvaluationChoicesResponse> getEvaluationChoices() {
        return new ResponseEntity<EvaluationChoicesResponse>(
                new EvaluationChoicesResponse(
                        new EvaluationChoicesDTO(), null
                ), HttpStatus.OK);
    }

    @ApiOperation(value = "Submit single Evaluation", notes = "Returns Evaluation ID of newly created Evaluation")
    @RequestMapping(path = "/evaluation", method = RequestMethod.POST)
    public ResponseEntity<EvaluationResponse> submitOrCreateEvaluation(@RequestBody EvaluationDTO evaluation) {
        return new ResponseEntity<EvaluationResponse>(
                new EvaluationResponse(42, null), HttpStatus.CREATED);
    }

}
