package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT)
public class ConsumedBeverage {
    @ApiModelProperty
    @JsonProperty
    int coffeeId;
    @ApiModelProperty
    @JsonProperty
    int beverageId;
    @ApiModelProperty
    @JsonProperty
    Date start;
    @ApiModelProperty
    @JsonProperty
    Date end;
}
