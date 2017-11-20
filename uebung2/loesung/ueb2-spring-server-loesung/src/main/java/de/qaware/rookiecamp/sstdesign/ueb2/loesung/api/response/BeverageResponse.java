package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
import io.swagger.annotations.ApiModel;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a Beverage.")
public class BeverageResponse extends QAcoffeeResponse<Beverage> {
    public BeverageResponse(Beverage payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
