package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "beverage")
public class Beverage {

    @JsonProperty
    @ApiModelProperty("The beverage ID")
    private int beveradeId;
    @JsonProperty
    @ApiModelProperty("The name")
    private String name;

    public Beverage(int beveradeId, String name) {
        this.beveradeId = beveradeId;
        this.name = name;
    }
}
