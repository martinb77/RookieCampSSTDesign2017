package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * QAcoffee TimePeriod data of a {@link Beverage}.
 */
@ApiModel(description = "TimePeriod data for a certain beverage of QAcoffee")
public class TimePeriod {
    @JsonProperty
    @ApiModelProperty(required = true)
    private Date start;

    @JsonProperty
    @ApiModelProperty
    private Date end;

    public TimePeriod(Date start) {
        this.start = start;
    }

    public TimePeriod(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TimePeriod that = (TimePeriod) o;

        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        return end != null ? end.equals(that.end) : that.end == null;
    }

    @Override
    public int hashCode() {
        int result = start != null ? start.hashCode() : 0;
        result = 31 * result + (end != null ? end.hashCode() : 0);
        return result;
    }
}

