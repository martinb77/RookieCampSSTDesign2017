package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import io.swagger.annotations.ApiModel;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a coffee .")
public class CoffeeResponse extends QAcoffeeResponse<Coffee> {
    public CoffeeResponse(Coffee payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
