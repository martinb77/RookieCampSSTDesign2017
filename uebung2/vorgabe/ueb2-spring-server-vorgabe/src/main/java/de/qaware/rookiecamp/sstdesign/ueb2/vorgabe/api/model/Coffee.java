package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

public class Coffee {


    @JsonProperty
    @ApiModelProperty("The coffee ID")
    private int coffeeId;
    @JsonProperty
    @ApiModelProperty("The coffee brand")
    private String brand;
    @JsonProperty
    @ApiModelProperty("The url to load the picture from")
    private String pictureUrl;

    public Coffee(int coffeeId, String brand, String pictureUrl) {
        this.coffeeId = coffeeId;
        this.brand = brand;
        this.pictureUrl = pictureUrl;
    }
}
