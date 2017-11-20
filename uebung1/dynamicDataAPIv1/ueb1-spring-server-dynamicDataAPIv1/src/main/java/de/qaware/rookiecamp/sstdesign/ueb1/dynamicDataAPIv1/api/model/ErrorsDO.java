package de.qaware.rookiecamp.sstdesign.ueb1.dynamicDataAPIv1.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ErrorsDO
 */
@ApiModel(description = "Possible business errors which have occurred during the execution.")
public class ErrorsDO {
    @JsonProperty
    @Valid
    @ApiModelProperty("list of business errors")
    private List<ErrorDO> errors = null;

    public ErrorsDO errors(List<ErrorDO> errors) {
        this.errors = errors;
        return this;
    }

    public ErrorsDO addErrorsItem(ErrorDO errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    public List<ErrorDO> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorDO> errors) {
        this.errors = errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorsDO errorsDO = (ErrorsDO) o;
        return Objects.equals(this.errors, errorsDO.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors);
    }

    @Override
    public String toString() {

        return "class ErrorsDO {\n" +
                "    errors: " + toIndentedString(errors) + "\n" +
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

