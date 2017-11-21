package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "coffeeOffer")
public class CoffeeOffer {

    @JsonProperty
    @ApiModelProperty("The coffee")
    private Coffee coffee;
    @JsonProperty
    @ApiModelProperty("The time period during which the coffee was available")
    private TimePeriod timePeriod;
}
