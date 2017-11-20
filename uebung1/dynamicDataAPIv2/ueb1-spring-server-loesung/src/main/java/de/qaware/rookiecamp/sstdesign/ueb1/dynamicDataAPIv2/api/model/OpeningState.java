package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * OpeningState
 */
@ApiModel(description = "opening state of doors, windows, ...")
public class OpeningState {

    @JsonProperty
    @Valid
    @ApiModelProperty("The lock state of all doors of the vehicle.")
    private DoorLockStateEnum doorLockState;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the passenger front door.")
    private DoorOpeningStateEnum doorPassengerFront;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the driver rear door. Not available on 2-door models.")
    private DoorOpeningStateEnum doorDriverRear;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the passenger rear door. Not available on 2-door models.")
    private DoorOpeningStateEnum doorPassengerRear;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the drivers front door.")
    private DoorOpeningStateEnum doorDriverFront;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the hood of the vehicle.")
    private DoorOpeningStateEnum hoodState;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the driver window of the vehicle.")
    private WindowOpeningStateEnum windowPassengerFront;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the passenger  rear window of the vehicle. May be not available if no openable rear window.")
    private WindowOpeningStateEnum windowPassengerRear;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the driver window of the vehicle.")
    private WindowOpeningStateEnum windowDriverFront;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the driver rear window of the vehicle. May be not available if no openable rear window.")
    private WindowOpeningStateEnum windowDriverRear;

    @JsonProperty
    @ApiModelProperty("The opening position of the sunroof of the vehicle. May be not available (if no sunroof present in the vehicle).")
    private Integer sunroofPosition;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the sunroof of the vehicle. May be not available (if no sunroof present in the vehicle).")
    private WindowOpeningStateEnum sunroofState;

    @JsonProperty
    @Valid
    @ApiModelProperty("The opening state of the trunk of the vehicle.")
    private DoorOpeningStateEnum trunkState;


    public OpeningState doorLockState(DoorLockStateEnum doorLockState) {
        this.doorLockState = doorLockState;
        return this;
    }

    /**
     * Get doorLockState
     *
     * @return doorLockState
     **/
    public DoorLockStateEnum getDoorLockState() {
        return doorLockState;
    }

    public void setDoorLockState(DoorLockStateEnum doorLockState) {
        this.doorLockState = doorLockState;
    }

    public OpeningState doorPassengerFront(DoorOpeningStateEnum doorPassengerFront) {
        this.doorPassengerFront = doorPassengerFront;
        return this;
    }

    /**
     * Get doorPassengerFront
     *
     * @return doorPassengerFront
     **/
    public DoorOpeningStateEnum getDoorPassengerFront() {
        return doorPassengerFront;
    }

    public void setDoorPassengerFront(DoorOpeningStateEnum doorPassengerFront) {
        this.doorPassengerFront = doorPassengerFront;
    }

    public OpeningState doorDriverRear(DoorOpeningStateEnum doorDriverRear) {
        this.doorDriverRear = doorDriverRear;
        return this;
    }

    /**
     * Get doorDriverRear
     *
     * @return doorDriverRear
     **/
    public DoorOpeningStateEnum getDoorDriverRear() {
        return doorDriverRear;
    }

    public void setDoorDriverRear(DoorOpeningStateEnum doorDriverRear) {
        this.doorDriverRear = doorDriverRear;
    }

    public OpeningState doorPassengerRear(DoorOpeningStateEnum doorPassengerRear) {
        this.doorPassengerRear = doorPassengerRear;
        return this;
    }

    /**
     * Get doorPassengerRear
     *
     * @return doorPassengerRear
     **/
    public DoorOpeningStateEnum getDoorPassengerRear() {
        return doorPassengerRear;
    }

    public void setDoorPassengerRear(DoorOpeningStateEnum doorPassengerRear) {
        this.doorPassengerRear = doorPassengerRear;
    }

    public OpeningState doorDriverFront(DoorOpeningStateEnum doorDriverFront) {
        this.doorDriverFront = doorDriverFront;
        return this;
    }

    /**
     * Get doorDriverFront
     *
     * @return doorDriverFront
     **/
    public DoorOpeningStateEnum getDoorDriverFront() {
        return doorDriverFront;
    }

    public void setDoorDriverFront(DoorOpeningStateEnum doorDriverFront) {
        this.doorDriverFront = doorDriverFront;
    }

    public OpeningState hoodState(DoorOpeningStateEnum hoodState) {
        this.hoodState = hoodState;
        return this;
    }

    /**
     * Get hoodState
     *
     * @return hoodState
     **/
    public DoorOpeningStateEnum getHoodState() {
        return hoodState;
    }

    public void setHoodState(DoorOpeningStateEnum hoodState) {
        this.hoodState = hoodState;
    }

    public OpeningState windowPassengerFront(WindowOpeningStateEnum windowPassengerFront) {
        this.windowPassengerFront = windowPassengerFront;
        return this;
    }

    /**
     * Get windowPassengerFront
     *
     * @return windowPassengerFront
     **/
    public WindowOpeningStateEnum getWindowPassengerFront() {
        return windowPassengerFront;
    }

    public void setWindowPassengerFront(WindowOpeningStateEnum windowPassengerFront) {
        this.windowPassengerFront = windowPassengerFront;
    }

    public OpeningState windowPassengerRear(WindowOpeningStateEnum windowPassengerRear) {
        this.windowPassengerRear = windowPassengerRear;
        return this;
    }

    /**
     * Get windowPassengerRear
     *
     * @return windowPassengerRear
     **/
    public WindowOpeningStateEnum getWindowPassengerRear() {
        return windowPassengerRear;
    }

    public void setWindowPassengerRear(WindowOpeningStateEnum windowPassengerRear) {
        this.windowPassengerRear = windowPassengerRear;
    }

    public OpeningState windowDriverFront(WindowOpeningStateEnum windowDriverFront) {
        this.windowDriverFront = windowDriverFront;
        return this;
    }

    /**
     * Get windowDriverFront
     *
     * @return windowDriverFront
     **/
    public WindowOpeningStateEnum getWindowDriverFront() {
        return windowDriverFront;
    }

    public void setWindowDriverFront(WindowOpeningStateEnum windowDriverFront) {
        this.windowDriverFront = windowDriverFront;
    }

    public OpeningState windowDriverRear(WindowOpeningStateEnum windowDriverRear) {
        this.windowDriverRear = windowDriverRear;
        return this;
    }

    /**
     * Get windowDriverRear
     *
     * @return windowDriverRear
     **/
    public WindowOpeningStateEnum getWindowDriverRear() {
        return windowDriverRear;
    }

    public void setWindowDriverRear(WindowOpeningStateEnum windowDriverRear) {
        this.windowDriverRear = windowDriverRear;
    }

    public OpeningState sunroofPosition(Integer sunroofPosition) {
        this.sunroofPosition = sunroofPosition;
        return this;
    }

    /**
     * Get sunroofPosition
     *
     * @return sunroofPosition
     **/
    public Integer getSunroofPosition() {
        return sunroofPosition;
    }

    public void setSunroofPosition(Integer sunroofPosition) {
        this.sunroofPosition = sunroofPosition;
    }

    public OpeningState sunroofState(WindowOpeningStateEnum sunroofState) {
        this.sunroofState = sunroofState;
        return this;
    }

    /**
     * Get sunroofState
     *
     * @return sunroofState
     **/
    public WindowOpeningStateEnum getSunroofState() {
        return sunroofState;
    }

    public void setSunroofState(WindowOpeningStateEnum sunroofState) {
        this.sunroofState = sunroofState;
    }

    public OpeningState trunkState(DoorOpeningStateEnum trunkState) {
        this.trunkState = trunkState;
        return this;
    }

    /**
     * Get trunkState
     *
     * @return trunkState
     **/
    public DoorOpeningStateEnum getTrunkState() {
        return trunkState;
    }

    public void setTrunkState(DoorOpeningStateEnum trunkState) {
        this.trunkState = trunkState;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpeningState openingState = (OpeningState) o;
        return Objects.equals(this.doorLockState, openingState.doorLockState) &&
                Objects.equals(this.doorPassengerFront, openingState.doorPassengerFront) &&
                Objects.equals(this.doorDriverRear, openingState.doorDriverRear) &&
                Objects.equals(this.doorPassengerRear, openingState.doorPassengerRear) &&
                Objects.equals(this.doorDriverFront, openingState.doorDriverFront) &&
                Objects.equals(this.hoodState, openingState.hoodState) &&
                Objects.equals(this.windowPassengerFront, openingState.windowPassengerFront) &&
                Objects.equals(this.windowPassengerRear, openingState.windowPassengerRear) &&
                Objects.equals(this.windowDriverFront, openingState.windowDriverFront) &&
                Objects.equals(this.windowDriverRear, openingState.windowDriverRear) &&
                Objects.equals(this.sunroofPosition, openingState.sunroofPosition) &&
                Objects.equals(this.sunroofState, openingState.sunroofState) &&
                Objects.equals(this.trunkState, openingState.trunkState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doorLockState, doorPassengerFront, doorDriverRear, doorPassengerRear, doorDriverFront, hoodState, windowPassengerFront, windowPassengerRear, windowDriverFront, windowDriverRear, sunroofPosition, sunroofState, trunkState);
    }

    @Override
    public String toString() {

        return "class OpeningState {\n" +
                "    doorLockState: " + toIndentedString(doorLockState) + "\n" +
                "    doorPassengerFront: " + toIndentedString(doorPassengerFront) + "\n" +
                "    doorDriverRear: " + toIndentedString(doorDriverRear) + "\n" +
                "    doorPassengerRear: " + toIndentedString(doorPassengerRear) + "\n" +
                "    doorDriverFront: " + toIndentedString(doorDriverFront) + "\n" +
                "    hoodState: " + toIndentedString(hoodState) + "\n" +
                "    windowPassengerFront: " + toIndentedString(windowPassengerFront) + "\n" +
                "    windowPassengerRear: " + toIndentedString(windowPassengerRear) + "\n" +
                "    windowDriverFront: " + toIndentedString(windowDriverFront) + "\n" +
                "    windowDriverRear: " + toIndentedString(windowDriverRear) + "\n" +
                "    sunroofPosition: " + toIndentedString(sunroofPosition) + "\n" +
                "    sunroofState: " + toIndentedString(sunroofState) + "\n" +
                "    trunkState: " + toIndentedString(trunkState) + "\n" +
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
     * Gets or Sets doorLockState
     */
    public enum DoorLockStateEnum {
        SECURED("SECURED"),

        LOCKED("LOCKED"),

        UNLOCKED("UNLOCKED"),

        INVALID("INVALID"),

        SELECTIVELOCKED("SELECTIVELOCKED");

        private String value;

        DoorLockStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DoorLockStateEnum fromValue(String text) {
            for (DoorLockStateEnum b : DoorLockStateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

}

