package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.Date;

@ApiModel(description = "UI representation for coffee and period")
public class CoffeePeriodDTO {

    @ApiModelProperty(value = "period start")
    public Date start;

    @ApiModelProperty(value = "period end")
    public Date end;

    @ApiModelProperty(value = "name of the coffee brand")
    public String brandName;

    @ApiModelProperty(value = "image url of brand")
    public String imageUrl;

}
