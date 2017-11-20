package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import io.swagger.annotations.ApiModel;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response with a boolean result.")
public class BooleanResponse extends QAcoffeeResponse<Boolean> {
    public BooleanResponse(Boolean payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
