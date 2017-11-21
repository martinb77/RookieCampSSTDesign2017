package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.CoffeeOffers;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;

public class QAcoffeeCoffeeOffersResponse extends QAcoffeeResponse<CoffeeOffers> {


    public QAcoffeeCoffeeOffersResponse(CoffeeOffers payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
