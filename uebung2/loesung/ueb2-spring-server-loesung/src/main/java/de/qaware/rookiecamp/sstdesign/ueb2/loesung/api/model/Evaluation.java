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
    @ApiModelProperty(value = "The ID of the coffee, which this evaluation is given.", required = true)
    private long coffeeId;

    @JsonProperty
    @ApiModelProperty(value = "The ID of the beverage, which this evaluation is given.", required = true)
    private long beverageId;

    public Evaluation(Integer taste, Integer look, String remarks, long coffeeId, long beverageId) {
        this.taste = taste;
        this.look = look;
        this.remarks = remarks;
        this.coffeeId = coffeeId;
        this.beverageId = beverageId;
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

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public long getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(long beverageId) {
        this.beverageId = beverageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Evaluation that = (Evaluation) o;

        if (coffeeId != that.coffeeId) return false;
        if (beverageId != that.beverageId) return false;
        if (!taste.equals(that.taste)) return false;
        if (!look.equals(that.look)) return false;
        return remarks != null ? remarks.equals(that.remarks) : that.remarks == null;
    }

    @Override
    public int hashCode() {
        int result = taste.hashCode();
        result = 31 * result + look.hashCode();
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        result = 31 * result + (int) (coffeeId ^ (coffeeId >>> 32));
        result = 31 * result + (int) (beverageId ^ (beverageId >>> 32));
        return result;
    }
}

