package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * VehicleMessage
 */
public class VehicleMessage {
    @JsonProperty
    @ApiModelProperty("Long text/description for the given message.")
    private String description;

    @JsonProperty
    @ApiModelProperty("Short text for the given message.")
    private String text;

    @JsonProperty
    @ApiModelProperty("Unique ID for the given message.")
    private Integer id;

    @JsonProperty
    @ApiModelProperty("Status for the given message.")
    private StatusEnum status;

    @JsonProperty
    @ApiModelProperty("Type for the given message.")
    private MessageTypeEnum messageType;

    @JsonProperty
    @ApiModelProperty("Daten when the reason for the message occured.")
    private String date;

    @JsonProperty
    @ApiModelProperty("Remaining distance/time.")
    private String unitOfLengthRemaining;

    public VehicleMessage description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VehicleMessage text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public VehicleMessage id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VehicleMessage status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VehicleMessage messageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
        return this;
    }

    /**
     * Get messageType
     *
     * @return messageType
     **/
    public MessageTypeEnum getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageTypeEnum messageType) {
        this.messageType = messageType;
    }

    public VehicleMessage date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     *
     * @return date
     **/
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VehicleMessage unitOfLengthRemaining(String unitOfLengthRemaining) {
        this.unitOfLengthRemaining = unitOfLengthRemaining;
        return this;
    }

    /**
     * Get unitOfLengthRemaining
     *
     * @return unitOfLengthRemaining
     **/
    public String getUnitOfLengthRemaining() {
        return unitOfLengthRemaining;
    }

    public void setUnitOfLengthRemaining(String unitOfLengthRemaining) {
        this.unitOfLengthRemaining = unitOfLengthRemaining;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VehicleMessage vehicleMessage = (VehicleMessage) o;
        return Objects.equals(this.description, vehicleMessage.description) &&
                Objects.equals(this.text, vehicleMessage.text) &&
                Objects.equals(this.id, vehicleMessage.id) &&
                Objects.equals(this.status, vehicleMessage.status) &&
                Objects.equals(this.messageType, vehicleMessage.messageType) &&
                Objects.equals(this.date, vehicleMessage.date) &&
                Objects.equals(this.unitOfLengthRemaining, vehicleMessage.unitOfLengthRemaining);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, text, id, status, messageType, date, unitOfLengthRemaining);
    }

    @Override
    public String toString() {

        return "class VehicleMessage {\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    text: " + toIndentedString(text) + "\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    messageType: " + toIndentedString(messageType) + "\n" +
                "    date: " + toIndentedString(date) + "\n" +
                "    unitOfLengthRemaining: " + toIndentedString(unitOfLengthRemaining) + "\n" +
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
     * Gets or Sets status
     */
    public enum StatusEnum {
        OK("OK"),

        PENDING("PENDING"),

        OVERDUE("OVERDUE"),

        INVALID("INVALID");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    /**
     * Gets or Sets messageType
     */
    public enum MessageTypeEnum {
        CCM("CCM"),

        CBS("CBS");

        private String value;

        MessageTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MessageTypeEnum fromValue(String text) {
            for (MessageTypeEnum b : MessageTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }


}

