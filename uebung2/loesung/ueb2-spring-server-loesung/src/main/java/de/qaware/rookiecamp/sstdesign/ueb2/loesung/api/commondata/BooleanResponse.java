package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.error.QAcoffeeError;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response with a boolean result.")
public class BooleanResponse extends QAcoffeeResponse<Boolean> {
    public BooleanResponse(Boolean payload, List<QAcoffeeError> businessErrors) {
        super(payload, businessErrors);
    }
}
