package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * QAcoffee Beverage data.
 */
@ApiModel(description = "Beverage for QAcoffee. A Beverage is some drink made of @Coffee which is available at a " +
        "certain time to be consumed.")
public class Beverage {
    @JsonProperty
    @ApiModelProperty(value = "The unique ID of the beverage. Set by the server, never by the client.", required = true)
    private Integer beverageId;

    @JsonProperty
    @ApiModelProperty(value = "Some descriptive name for the beverage.", required = true,
            example = "Espresso")
    private String name;

    @JsonProperty
    @ApiModelProperty(value = "The coffee type which this beverage is made of.", required = true)
    private Coffee coffee;

    @JsonProperty
    @ApiModelProperty(value = "TimePeriods, where this beverage was/is available for drinking.", required = true)
    private List<TimePeriod> timePeriods;

    public Beverage(Integer beverageId) {
        this(beverageId, null, null);
    }

    public Beverage(Integer beverageId, String name, Coffee coffee) {
        this (beverageId, name, coffee, null);
    }

    public Beverage(Integer beverageId, String name, Coffee coffee, List<TimePeriod> timePeriods) {
        this.beverageId = beverageId;
        this.name = name;
        this.coffee = coffee;
        this.timePeriods = timePeriods;
    }

    /**
     * Get the ID of the beverage.
     *
     * @return beverageId
     **/
    public Integer getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(Integer beverageId) {
        this.beverageId = beverageId;
    }

    /**
     * Get the Name of the beverage.
     *
     * @return beverageId
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public List<TimePeriod> getTimePeriods() {
        return timePeriods;
    }

    public void setTimePeriods(List<TimePeriod> timePeriods) {
        this.timePeriods = timePeriods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Beverage beverage = (Beverage) o;

        return beverageId.equals(beverage.beverageId);
    }

    @Override
    public int hashCode() {
        return beverageId.hashCode();
    }
}

