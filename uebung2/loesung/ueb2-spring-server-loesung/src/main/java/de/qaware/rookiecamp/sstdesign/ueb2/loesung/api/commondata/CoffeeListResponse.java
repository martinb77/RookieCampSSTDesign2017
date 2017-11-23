package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a coffee list.")
public class CoffeeListResponse extends QAcoffeeResponse<List<Coffee>> {
    public CoffeeListResponse(List<Coffee> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
