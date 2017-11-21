package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Beverages;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

public class QAcoffeeBeveragesResponse extends QAcoffeeResponse<Beverages> {

    public QAcoffeeBeveragesResponse(Beverages payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
