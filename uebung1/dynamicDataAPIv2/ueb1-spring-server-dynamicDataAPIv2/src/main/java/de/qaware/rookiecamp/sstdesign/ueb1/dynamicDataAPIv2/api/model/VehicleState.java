package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * VehicleState
 */
public class VehicleState {
    @JsonProperty
    @ApiModelProperty("General state for the Condition Based Services.")
    private String conditionBasedServices;

    @JsonProperty
    @ApiModelProperty("State of the vehicle's connector.")
    private ConnectorStatusEnum connectorStatus;

    @JsonProperty
    @ApiModelProperty("Current (by this update) mileage of the vehicle.")
    private Integer mileage;

    @JsonProperty
    @ApiModelProperty("Position tracking enabled or disabled.")
    private Boolean vehicleTracking;

    @JsonProperty
    @ApiModelProperty("Heading of the current (by this update) vehicle position.")
    private Integer heading;

    @JsonProperty
    @Valid
    @ApiModelProperty("Latitude of the current (by this update) vehicle position.")
    private BigDecimal gpsLat;

    @JsonProperty
    @Valid
    @ApiModelProperty("Longitude of the current (by this update) vehicle position.")
    private BigDecimal gpsLon;

    @JsonProperty
    @Valid
    @ApiModelProperty("Remaining fuel of the vehicle. May not be available if not supported by the vehicle.")
    private BigDecimal remainingFuel;

    @JsonProperty
    @Valid
    @ApiModelProperty("Estimated remaining range of the vehicle. May not be available if not supported by the vehicle.")
    private BigDecimal remainingRangeFuel;

    @JsonProperty
    @ApiModelProperty("State of the parking lights.")
    private LightsParkingEnum lightsParking;

    public VehicleState conditionBasedServices(String conditionBasedServices) {
        this.conditionBasedServices = conditionBasedServices;
        return this;
    }

    /**
     * Get conditionBasedServices
     *
     * @return conditionBasedServices
     **/
    public String getConditionBasedServices() {
        return conditionBasedServices;
    }

    public void setConditionBasedServices(String conditionBasedServices) {
        this.conditionBasedServices = conditionBasedServices;
    }

    public VehicleState connectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
        return this;
    }

    /**
     * Get connectorStatus
     *
     * @return connectorStatus
     **/
    public ConnectorStatusEnum getConnectorStatus() {
        return connectorStatus;
    }

    public void setConnectorStatus(ConnectorStatusEnum connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    public VehicleState mileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    /**
     * Get mileage
     *
     * @return mileage
     **/
    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public VehicleState vehicleTracking(Boolean vehicleTracking) {
        this.vehicleTracking = vehicleTracking;
        return this;
    }

    /**
     * Get vehicleTracking
     *
     * @return vehicleTracking
     **/
    public Boolean getVehicleTracking() {
        return vehicleTracking;
    }

    public void setVehicleTracking(Boolean vehicleTracking) {
        this.vehicleTracking = vehicleTracking;
    }

    public VehicleState heading(Integer heading) {
        this.heading = heading;
        return this;
    }

    /**
     * Get heading
     *
     * @return heading
     **/
    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public VehicleState gpsLat(BigDecimal gpsLat) {
        this.gpsLat = gpsLat;
        return this;
    }

    /**
     * Get gpsLat
     *
     * @return gpsLat
     **/
    public BigDecimal getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(BigDecimal gpsLat) {
        this.gpsLat = gpsLat;
    }

    public VehicleState gpsLon(BigDecimal gpsLon) {
        this.gpsLon = gpsLon;
        return this;
    }

    /**
     * Get gpsLon
     *
     * @return gpsLon
     **/
    public BigDecimal getGpsLon() {
        return gpsLon;
    }

    public void setGpsLon(BigDecimal gpsLon) {
        this.gpsLon = gpsLon;
    }

    public VehicleState remainingFuel(BigDecimal remainingFuel) {
        this.remainingFuel = remainingFuel;
        return this;
    }

    /**
     * Get remainingFuel
     *
     * @return remainingFuel
     **/
    public BigDecimal getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(BigDecimal remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public VehicleState remainingRangeFuel(BigDecimal remainingRangeFuel) {
        this.remainingRangeFuel = remainingRangeFuel;
        return this;
    }

    /**
     * Get remainingRangeFuel
     *
     * @return remainingRangeFuel
     **/
    public BigDecimal getRemainingRangeFuel() {
        return remainingRangeFuel;
    }

    public void setRemainingRangeFuel(BigDecimal remainingRangeFuel) {
        this.remainingRangeFuel = remainingRangeFuel;
    }

    public VehicleState lightsParking(LightsParkingEnum lightsParking) {
        this.lightsParking = lightsParking;
        return this;
    }

    /**
     * Get lightsParking
     *
     * @return lightsParking
     **/
    public LightsParkingEnum getLightsParking() {
        return lightsParking;
    }

    public void setLightsParking(LightsParkingEnum lightsParking) {
        this.lightsParking = lightsParking;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleState vehicleState = (VehicleState) o;
        return Objects.equals(this.conditionBasedServices, vehicleState.conditionBasedServices) &&
                Objects.equals(this.connectorStatus, vehicleState.connectorStatus) &&
                Objects.equals(this.mileage, vehicleState.mileage) &&
                Objects.equals(this.vehicleTracking, vehicleState.vehicleTracking) &&
                Objects.equals(this.heading, vehicleState.heading) &&
                Objects.equals(this.gpsLat, vehicleState.gpsLat) &&
                Objects.equals(this.gpsLon, vehicleState.gpsLon) &&
                Objects.equals(this.remainingFuel, vehicleState.remainingFuel) &&
                Objects.equals(this.remainingRangeFuel, vehicleState.remainingRangeFuel) &&
                Objects.equals(this.lightsParking, vehicleState.lightsParking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionBasedServices, connectorStatus, mileage, vehicleTracking, heading, gpsLat, gpsLon, remainingFuel, remainingRangeFuel, lightsParking);
    }

    @Override
    public String toString() {

        return "class VehicleState {\n" +
                "    conditionBasedServices: " + toIndentedString(conditionBasedServices) + "\n" +
                "    connectorStatus: " + toIndentedString(connectorStatus) + "\n" +
                "    mileage: " + toIndentedString(mileage) + "\n" +
                "    vehicleTracking: " + toIndentedString(vehicleTracking) + "\n" +
                "    heading: " + toIndentedString(heading) + "\n" +
                "    gpsLat: " + toIndentedString(gpsLat) + "\n" +
                "    gpsLon: " + toIndentedString(gpsLon) + "\n" +
                "    remainingFuel: " + toIndentedString(remainingFuel) + "\n" +
                "    remainingRangeFuel: " + toIndentedString(remainingRangeFuel) + "\n" +
                "    lightsParking: " + toIndentedString(lightsParking) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Gets or Sets connectorStatus
     */
    public enum ConnectorStatusEnum {
        CONNECTED("CONNECTED"),

        DISCONNECTED("DISCONNECTED");

        private String value;

        ConnectorStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConnectorStatusEnum fromValue(String text) {
            for (ConnectorStatusEnum b : ConnectorStatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }


    /**
     * Gets or Sets lightsParking
     */
    public enum LightsParkingEnum {
        OFF("OFF"),

        RIGHT("RIGHT"),

        LEFT("LEFT");

        private String value;

        LightsParkingEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LightsParkingEnum fromValue(String text) {
            for (LightsParkingEnum b : LightsParkingEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

}

