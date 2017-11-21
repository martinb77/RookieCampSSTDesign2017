package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Coffee;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

import java.util.List;

public class CoffeeResponse extends QAcoffeeResponse<List<Coffee>> {

    public CoffeeResponse(List<Coffee> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
