package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Coffee;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.error.QAcoffeeError;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a coffee list.")
public class CoffeeListResponse extends QAcoffeeResponse<List<Coffee>> {
    public CoffeeListResponse(List<Coffee> payload, List<QAcoffeeError> businessErrors) {
        super(payload, businessErrors);
    }
}
