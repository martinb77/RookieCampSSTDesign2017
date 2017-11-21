package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(description = "Choices for evaluation selection")
public class EvaluationChoicesDTO {

    @ApiModelProperty(value = "list of available coffee periods")
    public List<CoffeePeriodDTO> coffeePeriods;

    @ApiModelProperty(value = "known types of beverages")
    public List<String> beverages;

}
