package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import javax.validation.Valid;

/**
 * UpateInformation
 */
public class UpateInformation {
    @JsonProperty
    @Valid
    @ApiModelProperty("Timestamp when the update occured.")
    private DateTime updateTime;

    @JsonProperty
    @Valid
    @ApiModelProperty("Reason why the update occured.")
    private LastUpdateReasonEnum lastUpdateReason;

    @JsonProperty
    @Valid
    @ApiModelProperty("Timestamp when the last trip ended (the vehicle was shut-down).")
    private DateTime lastTripTimeEnd;

    @JsonProperty
    @ApiModelProperty("Length-Unit of the vehicle.")
    private UnitOfLengthEnum unitOfLength;

    @JsonProperty
    @ApiModelProperty("Combustion unit of the vehicle.")
    private UnitOfCombustionConsumptionEnum unitOfCombustionConsumption;


    /**
     * Gets or Sets unitOfCombustionConsumption
     */
    public enum UnitOfCombustionConsumptionEnum {
        L100KM("l100km"),

        MPG("MPG");

        private String value;

        UnitOfCombustionConsumptionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UnitOfCombustionConsumptionEnum fromValue(String text) {
            for (UnitOfCombustionConsumptionEnum b : UnitOfCombustionConsumptionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    public UpateInformation updateTime(DateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     **/
    public DateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(DateTime updateTime) {
        this.updateTime = updateTime;
    }

    public UpateInformation lastUpdateReason(LastUpdateReasonEnum lastUpdateReason) {
        this.lastUpdateReason = lastUpdateReason;
        return this;
    }

    /**
     * Get lastUpdateReason
     *
     * @return lastUpdateReason
     **/
    public LastUpdateReasonEnum getLastUpdateReason() {
        return lastUpdateReason;
    }

    public void setLastUpdateReason(LastUpdateReasonEnum lastUpdateReason) {
        this.lastUpdateReason = lastUpdateReason;
    }

    public UpateInformation lastTripTimeEnd(DateTime lastTripTimeEnd) {
        this.lastTripTimeEnd = lastTripTimeEnd;
        return this;
    }

    /**
     * Get lastTripTimeEnd
     *
     * @return lastTripTimeEnd
     **/
    public DateTime getLastTripTimeEnd() {
        return lastTripTimeEnd;
    }

    public void setLastTripTimeEnd(DateTime lastTripTimeEnd) {
        this.lastTripTimeEnd = lastTripTimeEnd;
    }

    public UpateInformation unitOfLength(UnitOfLengthEnum unitOfLength) {
        this.unitOfLength = unitOfLength;
        return this;
    }

    /**
     * Get unitOfLength
     *
     * @return unitOfLength
     **/
    public UnitOfLengthEnum getUnitOfLength() {
        return unitOfLength;
    }

    public void setUnitOfLength(UnitOfLengthEnum unitOfLength) {
        this.unitOfLength = unitOfLength;
    }

    public UpateInformation unitOfCombustionConsumption(UnitOfCombustionConsumptionEnum unitOfCombustionConsumption) {
        this.unitOfCombustionConsumption = unitOfCombustionConsumption;
        return this;
    }

    /**
     * Get unitOfCombustionConsumption
     *
     * @return unitOfCombustionConsumption
     **/
    public UnitOfCombustionConsumptionEnum getUnitOfCombustionConsumption() {
        return unitOfCombustionConsumption;
    }

    public void setUnitOfCombustionConsumption(UnitOfCombustionConsumptionEnum unitOfCombustionConsumption) {
        this.unitOfCombustionConsumption = unitOfCombustionConsumption;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpateInformation upateInformation = (UpateInformation) o;
        return Objects.equals(this.updateTime, upateInformation.updateTime) &&
                Objects.equals(this.lastUpdateReason, upateInformation.lastUpdateReason) &&
                Objects.equals(this.lastTripTimeEnd, upateInformation.lastTripTimeEnd) &&
                Objects.equals(this.unitOfLength, upateInformation.unitOfLength) &&
                Objects.equals(this.unitOfCombustionConsumption, upateInformation.unitOfCombustionConsumption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime, lastUpdateReason, lastTripTimeEnd, unitOfLength, unitOfCombustionConsumption);
    }

    @Override
    public String toString() {

        return "class UpateInformation {\n" +
                "    updateTime: " + toIndentedString(updateTime) + "\n" +
                "    lastUpdateReason: " + toIndentedString(lastUpdateReason) + "\n" +
                "    lastTripTimeEnd: " + toIndentedString(lastTripTimeEnd) + "\n" +
                "    unitOfLength: " + toIndentedString(unitOfLength) + "\n" +
                "    unitOfCombustionConsumption: " + toIndentedString(unitOfCombustionConsumption) + "\n" +
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
     * Gets or Sets lastUpdateReason
     */
    public enum LastUpdateReasonEnum {
        VEHCSHUTDOWN("VEHCSHUTDOWN"),

        ONDEMAND("ONDEMAND"),

        DOORSTATECHANGED("DOORSTATECHANGED"),

        INVALID("INVALID");

        private String value;

        LastUpdateReasonEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LastUpdateReasonEnum fromValue(String text) {
            for (LastUpdateReasonEnum b : LastUpdateReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    /**
     * unitOfLength
     */
    public enum UnitOfLengthEnum {
        KM("km"),

        MILES("miles");

        private String value;

        UnitOfLengthEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UnitOfLengthEnum fromValue(String text) {
            for (UnitOfLengthEnum b : UnitOfLengthEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

}

