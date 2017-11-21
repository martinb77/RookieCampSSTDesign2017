package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

public class CoffeeOffers {

    @JsonProperty
    @ApiModelProperty(value = "All coffees")
    @Valid
    private List<CoffeeOffer> coffees;

    public CoffeeOffers(List<CoffeeOffer> coffees) {
        this.coffees = coffees;
    }
}
