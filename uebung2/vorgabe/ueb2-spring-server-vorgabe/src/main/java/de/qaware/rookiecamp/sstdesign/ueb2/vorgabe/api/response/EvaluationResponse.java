package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;


import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto.EvaluationChoicesDTO;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto.EvaluationDTO;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

public class EvaluationResponse extends QAcoffeeResponse<Integer> {
    public EvaluationResponse(
            Integer payload, Errors businessErrors) {
        super(payload, businessErrors);
    }

}
