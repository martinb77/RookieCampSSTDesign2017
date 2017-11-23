package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.error.QAcoffeeError;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of a Beverage.")
public class BeverageResponse extends QAcoffeeResponse<Beverage> {
    public BeverageResponse(Beverage payload, List<QAcoffeeError> businessErrors) {
        super(payload, businessErrors);
    }
}
