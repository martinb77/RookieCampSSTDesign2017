package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QAcoffee Evaluation data.
 */
@ApiModel(description = "Evaluation data for QAcoffee")
public class Evaluation {
    @JsonProperty
    @ApiModelProperty(value = "The experienced taste.", required = true, allowableValues = "range[1, 100]")
    private Integer taste;

    @JsonProperty
    @ApiModelProperty(value = "The experienced look.", required = true, allowableValues = "range[1, 100]")
    private Integer look;

    @JsonProperty
    @ApiModelProperty(value = "Some further remarks, which are not related to look or taste.", required = true)
    private String remarks;

    @JsonProperty
    @ApiModelProperty(value = "The beverage, which this evaluation is given.", required = true)
    private Beverage beverage;

    public Evaluation(Integer taste, Integer look, String remarks, Beverage beverage) {
        this.taste = taste;
        this.look = look;
        this.remarks = remarks;
        this.beverage = beverage;
    }

    public Integer getTaste() {
        return taste;
    }

    public void setTaste(Integer taste) {
        this.taste = taste;
    }

    public Integer getLook() {
        return look;
    }

    public void setLook(Integer look) {
        this.look = look;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Evaluation that = (Evaluation) o;

        if (taste != null ? !taste.equals(that.taste) : that.taste != null) return false;
        if (look != null ? !look.equals(that.look) : that.look != null) return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;
        return beverage != null ? beverage.equals(that.beverage) : that.beverage == null;
    }

    @Override
    public int hashCode() {
        int result = taste != null ? taste.hashCode() : 0;
        result = 31 * result + (look != null ? look.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }
}

