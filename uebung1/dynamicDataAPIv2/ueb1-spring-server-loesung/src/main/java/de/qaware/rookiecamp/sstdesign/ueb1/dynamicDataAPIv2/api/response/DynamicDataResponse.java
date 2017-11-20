package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.DynamicData;
import de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv2.api.model.Errors;
import io.swagger.annotations.ApiModel;

import javax.validation.Valid;
import java.util.Objects;

/**
 * DynamicDataResponse
 */
@ApiModel(description = "vehicle dynamic data")
public class DynamicDataResponse {
    @JsonProperty
    @Valid
    private DynamicData data;

    @JsonProperty
    @Valid
    private Errors error;

    public DynamicDataResponse data(DynamicData data) {
        this.data = data;
        return this;
    }

    public DynamicData getData() {
        return data;
    }

    public void setData(DynamicData data) {
        this.data = data;
    }

    public DynamicDataResponse error(Errors error) {
        this.error = error;
        return this;
    }

    public Errors getError() {
        return error;
    }

    public void setError(Errors error) {
        this.error = error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DynamicDataResponse dynamicDataResponse = (DynamicDataResponse) o;
        return Objects.equals(this.data, dynamicDataResponse.data) &&
                Objects.equals(this.error, dynamicDataResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, error);
    }

    @Override
    public String toString() {

        return "class DynamicDataResponse {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    error: " + toIndentedString(error) + "\n" +
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

