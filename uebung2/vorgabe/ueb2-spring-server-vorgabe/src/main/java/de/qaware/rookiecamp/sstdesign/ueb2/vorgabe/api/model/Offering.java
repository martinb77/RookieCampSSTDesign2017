package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Collections;
import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT)
public class Offering {
    @ApiModelProperty
    @JsonProperty
    List<Coffee> coffeeList = Collections.singletonList(new Coffee());
    @JsonProperty
    @ApiModelProperty
    List<Beverage> beverageList = Collections.singletonList(new Beverage());
}
