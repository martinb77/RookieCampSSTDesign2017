package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class BeverageDO {

    @ApiModelProperty(required = true)
    private int beverageId;

    @NotNull
    @ApiModelProperty(required = true)
    private String name;

    public int getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(int beverageId) {
        this.beverageId = beverageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
