package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public class BeveragesDO {

    @ApiModelProperty(required = true)
    private List<BeveragesDO> beverages;

    public List<BeveragesDO> getBeverages() {
        return beverages;
    }

    public void setBeverages(List<BeveragesDO> beverages) {
        this.beverages = beverages;
    }
}
