package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("List of beverages")
public class BeveragesDto {
    @JsonProperty
    @ApiModelProperty("List of beverages")
    private List<BeverageDto> beverages;

    @ApiModel("A beverage made out of coffee usually")
    public static class BeverageDto {
        @JsonProperty
        @ApiModelProperty("Unique id of beverage")
        private int id;

        @JsonProperty
        @ApiModelProperty("Display name of beverage")
        private String displayName;

        public BeverageDto() {

        }

        public BeverageDto(int id, String displayName) {
            this.id = id;
            this.displayName = displayName;
        }

        public int getId() {
            return id;
        }

        public String getDisplayName() {
            return displayName;
        }
    }

    public BeveragesDto() {
    }

    public BeveragesDto(List<BeverageDto> beverages) {
        this.beverages = beverages;
    }

    public List<BeverageDto> getBeverages() {

        return beverages;
    }
}
