package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Size;

@ApiModel("An evaluation returned by coffee addicts")
public class EvaluationDto {

    @JsonProperty
    @ApiModelProperty("Id of beverage")
    private int beverageId;

    @JsonProperty
    @ApiModelProperty("Id of coffee")
    private int coffeeId;

    @JsonProperty
    @ApiModelProperty("Taste defined by user, satisfaction in percent")
    @Size(min = 0, max = 100)
    private int taste;

    @JsonProperty
    @ApiModelProperty("Visual appearance defined by user, satisfaction in percent")
    @Size(min = 0, max = 100)
    private int looks;

    @JsonProperty
    @ApiModelProperty("Free text for commenting the evaluation")
    private String comment;

    public EvaluationDto() {
    }

    public EvaluationDto(int beverageId, int coffeeId, int taste, int looks, String comment) {
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

    public int getTaste() {
        return taste;
    }

    public int getLooks() {
        return looks;
    }

    public String getComment() {
        return comment;
    }
}
