package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import io.swagger.annotations.ApiModelProperty;

/**
 * Common response class for all QAcoffee services.
 * Contains basic implementation for all response types.
 * May be extended for special case.
 *
 * @param <T> The type of the business payload.
 */
public abstract class QAcoffeeResponse<T> {
    @JsonProperty
    @ApiModelProperty("the business data payload.")
    private T payload;

    @JsonProperty
    @ApiModelProperty("possible business errors.")
    private Errors businessErrors;

    public QAcoffeeResponse() {
    }

    public QAcoffeeResponse(T payload, Errors businessErrors) {
        this.payload = payload;
        this.businessErrors = businessErrors;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public Errors getBusinessErrors() {
        return businessErrors;
    }

    public void setBusinessErrors(Errors businessErrors) {
        this.businessErrors = businessErrors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QAcoffeeResponse<?> that = (QAcoffeeResponse<?>) o;

        if (payload != null ? !payload.equals(that.payload) : that.payload != null) return false;
        return businessErrors != null ? businessErrors.equals(that.businessErrors) : that.businessErrors == null;
    }

    @Override
    public int hashCode() {
        int result = payload != null ? payload.hashCode() : 0;
        result = 31 * result + (businessErrors != null ? businessErrors.hashCode() : 0);
        return result;
    }
}
