package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.sun.istack.internal.Nullable;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class TimeCoffeePeriodDO {

    @ApiModelProperty(required = true)
    private int id;

    @NotNull
    @ApiModelProperty(required = true)
    private Instant start;

    @NotNull
    @ApiModelProperty(required = true)
    private Instant end;

    @NotNull
    @ApiModelProperty(required = true)
    private String brand;

    @Nullable
    private String pictureUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Instant getStart() {
        return start;
    }

    public void setStart(Instant start) {
        this.start = start;
    }

    public Instant getEnd() {
        return end;
    }

    public void setEnd(Instant end) {
        this.end = end;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}
