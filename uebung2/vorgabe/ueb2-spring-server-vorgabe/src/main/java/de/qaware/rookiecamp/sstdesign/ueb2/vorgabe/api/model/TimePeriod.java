package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "time period")
public class TimePeriod {

    @JsonProperty
    @ApiModelProperty("The time period id")
    private int timePeriodId;
    @JsonProperty
    @ApiModelProperty("The start date")
    private Date start;
    @JsonProperty
    @ApiModelProperty("The end date")
    private Date end;

    public TimePeriod(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
