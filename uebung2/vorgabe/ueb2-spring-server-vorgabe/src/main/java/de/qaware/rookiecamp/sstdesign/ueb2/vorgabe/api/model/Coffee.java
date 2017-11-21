package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT)
public class Coffee {
    @ApiModelProperty
    @JsonProperty
    int coffeeID = 0;
    @ApiModelProperty
    @JsonProperty
    String brand = "Fausto Giasing";
    @ApiModelProperty
    @JsonProperty
    String picture = "/img";
    @ApiModelProperty
    @JsonProperty
    Date startDate;
    @ApiModelProperty
    @JsonProperty
    Date endDate;
}
