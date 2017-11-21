package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel("An evaluation returned by coffee addicts")
public class EvaluationDto {

    @JsonProperty
    @ApiModelProperty("Id of beverage")
    @NotNull
    private Integer beverageId;

    @JsonProperty
    @ApiModelProperty("Id of coffee")
    @NotNull
    private Integer coffeeId;

    @JsonProperty
    @ApiModelProperty("Taste defined by user, satisfaction in percent")
    @Min(0)
    @Max(100)
    @NotNull
    private Double taste;

    @JsonProperty
    @ApiModelProperty("Visual appearance defined by user, satisfaction in percent")
    @Size(min = 0, max = 100)
    private Double looks;

    @JsonProperty
    @ApiModelProperty("Free text for commenting the evaluation")
    @NotNull
    private String comment;

    public EvaluationDto() {
    }

    public EvaluationDto(int beverageId, int coffeeId, double taste, double looks, String comment) {
        this.beverageId = beverageId;
        this.coffeeId = coffeeId;
        this.taste = taste;
        this.looks = looks;
        this.comment = comment;
    }

    public int getBeverageId() {
        return beverageId;
    }

    public int getCoffeeId() {
        return coffeeId;
    }

    public double getTaste() {
        return taste;
    }

    public double getLooks() {
        return looks;
    }

    public String getComment() {
        return comment;
    }
}
