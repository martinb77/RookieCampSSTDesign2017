package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
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
