package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.error.QAcoffeeError;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.List;

/**
 * Common response class for all QAcoffee services.
 * Contains basic implementation for all response types.
 * May be extended for special case.
 *
 * @param <T> The type of the business payload.
 */
public abstract class QAcoffeeResponse <T> {
    @JsonProperty
    @ApiModelProperty("the business data payload.")
    private T payload;

    @JsonProperty
    @ApiModelProperty("possible business errors.")
    @Valid
    private List<QAcoffeeError> businessErrors;

    public QAcoffeeResponse() {
    }

    public QAcoffeeResponse(T payload, List<QAcoffeeError> businessErrors) {
        this.payload = payload;
        this.businessErrors = businessErrors;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public List<QAcoffeeError> getBusinessErrors() {
        return businessErrors;
    }

    public void setBusinessErrors(List<QAcoffeeError> businessErrors) {
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
