package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * VehicleMessageDO
 */
public class VehicleMessageDO {
    @JsonProperty
    private String description = null;

    @JsonProperty
    private String text = null;

    @JsonProperty
    private Integer id = null;

    @JsonProperty
    private StatusEnum status = null;

    @JsonProperty
    private MessageTypeEnum messageType = null;

    @JsonProperty
    private String date = null;

    @JsonProperty
    private String unitOfLengthRemaining = null;


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

    public VehicleMessageDO description(String description) {
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

    public VehicleMessageDO text(String text) {
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

    public VehicleMessageDO id(Integer id) {
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

    public VehicleMessageDO status(StatusEnum status) {
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

    public VehicleMessageDO messageType(MessageTypeEnum messageType) {
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

    public VehicleMessageDO date(String date) {
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

    public VehicleMessageDO unitOfLengthRemaining(String unitOfLengthRemaining) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleMessageDO that = (VehicleMessageDO) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {

        return "class VehicleMessageDO {\n" +
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
}

