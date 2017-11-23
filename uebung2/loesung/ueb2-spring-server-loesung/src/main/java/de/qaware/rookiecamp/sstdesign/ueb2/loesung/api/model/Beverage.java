package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

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

    public Beverage(Integer beverageId, String name) {
        this.beverageId = beverageId;
        this.name = name;
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

