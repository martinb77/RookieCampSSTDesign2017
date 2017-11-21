package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "The Evaluation DTO")
public class EvaluationDTO {

    @ApiModelProperty(value = "selected coffee period")
    public CoffeePeriodDTO coffeePeriod;

    @ApiModelProperty(value = "name of beverage")
    public String beverageName;

    @ApiModelProperty(value = "taste on a scale from 4 to 9")
    public int taste;

    @ApiModelProperty(value = "look on a scale from 11 to 42 (logarithmic)")
    public int look;

    @ApiModelProperty(value = "what you say?")
    public String remarks;

    @ApiModelProperty(value = "your silly name")
    public String employeeName;

}
