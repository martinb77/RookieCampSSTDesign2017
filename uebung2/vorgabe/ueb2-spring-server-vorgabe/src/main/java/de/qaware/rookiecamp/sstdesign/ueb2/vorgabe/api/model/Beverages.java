package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "beverages")
public class Beverages {

    @JsonProperty
    @ApiModelProperty("All beverages")
    private List<Beverage> beverages;

    public Beverages(List<Beverage> beverages) {
        this.beverages = beverages;
    }
}
