package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

import java.util.List;

public class BeverageResponse extends QAcoffeeResponse<List<Beverage>> {

    public BeverageResponse(List<Beverage> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
