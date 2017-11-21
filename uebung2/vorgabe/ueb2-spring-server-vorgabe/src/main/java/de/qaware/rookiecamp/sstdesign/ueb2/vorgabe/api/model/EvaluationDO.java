package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class EvaluationDO {

    @Min(1)
    @Max(10)
    @ApiModelProperty(required = true)
    private int taste;

    @Min(1)
    @Max(10)
    @ApiModelProperty(required = true)
    private int look;

    @Length(min = 0, max = 280)
    private String remarks;

    @ApiModelProperty(required = true)
    private int beverageId;

    @ApiModelProperty(required = true)
    private int timeperiodId;


    public int getTaste() {
        return taste;
    }

    public void setTaste(int taste) {
        this.taste = taste;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(int beverageId) {
        this.beverageId = beverageId;
    }

    public int getTimeperiodId() {
        return timeperiodId;
    }

    public void setTimeperiodId(int timeperiodId) {
        this.timeperiodId = timeperiodId;
    }

}
