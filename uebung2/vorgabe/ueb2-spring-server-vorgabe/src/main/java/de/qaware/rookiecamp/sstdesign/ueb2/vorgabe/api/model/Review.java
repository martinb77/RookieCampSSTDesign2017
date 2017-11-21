package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT)
public class Review {
    @ApiModelProperty
    @JsonProperty
    ConsumedBeverage consumedBeverage;
    @ApiModelProperty
    @JsonProperty
    float taste;
    @ApiModelProperty
    @JsonProperty
    float looks;
    @ApiModelProperty
    @JsonProperty
    String comment;
}
