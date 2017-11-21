package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.sun.istack.internal.Nullable;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;

public class TimeCoffeePeriodsDO {

    @ApiModelProperty(required = true)
    private List<TimeCoffeePeriodDO> timeCoffeePeriods;

    public List<TimeCoffeePeriodDO> getTimeCoffeePeriods() {
        return timeCoffeePeriods;
    }

    public void setTimeCoffeePeriods(List<TimeCoffeePeriodDO> timeCoffeePeriods) {
        this.timeCoffeePeriods = timeCoffeePeriods;
    }
}
