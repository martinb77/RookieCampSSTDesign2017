package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.Instant;
import java.util.List;

@ApiModel("List of coffees")
public class CoffeesDto {
    @JsonProperty
    @ApiModelProperty("List of coffees")
    private List<CoffeeDto> coffees;

    @ApiModel("A coffee brand offered for some time")
    private class CoffeeDto {
        @JsonProperty
        @ApiModelProperty("Unique id of coffee")
        private int id;

        @JsonProperty
        @ApiModelProperty("Start of coffee offering")
        private Instant start;

        @JsonProperty
        @ApiModelProperty("End of coffee offering")
        private Instant end;

        @JsonProperty
        @ApiModelProperty("Display name of coffee, usually the brand")
        private String displayName;

        public CoffeeDto() {

        }

        public CoffeeDto(int id, Instant start, Instant end, String displayName) {
            this.id = id;
            this.start = start;
            this.end = end;
            this.displayName = displayName;
        }

        public int getId() {
            return id;
        }

        public Instant getStart() {
            return start;
        }

        public Instant getEnd() {
            return end;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public CoffeesDto() {
    }

    public CoffeesDto(List<CoffeeDto> coffees) {
        this.coffees = coffees;
    }

    public List<CoffeeDto> getCoffees() {

        return coffees;
    }
}
