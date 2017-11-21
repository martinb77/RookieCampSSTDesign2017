package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;


import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto.EvaluationChoicesDTO;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

public class EvaluationChoicesResponse extends QAcoffeeResponse<EvaluationChoicesDTO> {
    public EvaluationChoicesResponse(
            EvaluationChoicesDTO payload, Errors businessErrors) {
        super(payload, businessErrors);
    }

}
