package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QAcoffee Employee data.
 */
@ApiModel(description = "Employee for QAcoffee. An Employee of the company.")
public class Employee {
    @JsonProperty
    @ApiModelProperty(value= "Unique ID of the employee, may not be set by the client but by the server.", required = true)
    private Integer employeeId;

    @JsonProperty
    @ApiModelProperty(value = "Name of the employee.", required = true, example = "Max Mustermann")
    private String name;

    public Employee(Integer employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

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

        Employee beverage = (Employee) o;

        return employeeId.equals(beverage.employeeId);
    }

    @Override
    public int hashCode() {
        return employeeId.hashCode();
    }
}

