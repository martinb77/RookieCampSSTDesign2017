package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a Beverage list.")
public class BeverageListResponse extends QAcoffeeResponse<List<Beverage>> {
    public BeverageListResponse(List<Beverage> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
