package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ErrorDO
 */
public class ErrorDO {
    @JsonProperty
    private String errorCode = null;

    @JsonProperty
    private String message = null;

    public ErrorDO errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     **/
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorDO message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorDO errorDO = (ErrorDO) o;
        return Objects.equals(this.errorCode, errorDO.errorCode) &&
                Objects.equals(this.message, errorDO.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, message);
    }

    @Override
    public String toString() {

        return "class ErrorDO {\n" +
                "    errorCode: " + toIndentedString(errorCode) + "\n" +
                "    message: " + toIndentedString(message) + "\n" +
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

