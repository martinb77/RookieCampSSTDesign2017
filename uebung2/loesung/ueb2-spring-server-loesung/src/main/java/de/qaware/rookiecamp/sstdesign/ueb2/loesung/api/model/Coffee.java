package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Coffee data.
 */
@ApiModel(description = "Coffee data for QAcoffee. A coffee is nothing more ore less than a coffee bean type and brand.")
public class Coffee {

    @JsonProperty
    @ApiModelProperty(value = "The unique ID of this coffee. May not be set by the client, but only by the server.", required = true)
    private long coffeeId;

    @JsonProperty
    @ApiModelProperty(value = "The descriptive brand/type of the coffee beans to be identified by human beings.", required = true,
            example = "Fausto Napoli - 100% Arabica")
    private String brand;

    @JsonProperty
    @ApiModelProperty
    private byte[] image;

    public Coffee(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public Coffee(long coffeeId, String brand, byte[] image) {
        this.coffeeId = coffeeId;
        this.brand = brand;
        this.image = image;
    }

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coffee coffee = (Coffee) o;

        return coffeeId == coffee.coffeeId;
    }

    @Override
    public int hashCode() {
        return (int) (coffeeId ^ (coffeeId >>> 32));
    }
}
