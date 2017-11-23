package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * business errors
 */
@ApiModel(description = "business errors")
public class QAcoffeeError {
    @JsonProperty
    @ApiModelProperty("The type of the error.")
    private ErrorCode errorCode;

    @JsonProperty
    @ApiModelProperty("Some descriptive message which describes the error.")
    private String message;

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public QAcoffeeError message(String message) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QAcoffeeError QAcoffeeError = (QAcoffeeError) o;
        return Objects.equals(this.errorCode, QAcoffeeError.errorCode) &&
                Objects.equals(this.message, QAcoffeeError.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public enum ErrorCode {
        INCOMPLETE,
        NOT_FOUND,
        UNKNOWN_ERROR,

    }
}

