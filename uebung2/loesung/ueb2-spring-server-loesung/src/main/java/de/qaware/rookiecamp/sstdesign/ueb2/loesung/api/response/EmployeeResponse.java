package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
import io.swagger.annotations.ApiModel;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response of an Employee.")
public class EmployeeResponse extends QAcoffeeResponse<EmployeeResponse> {

    public EmployeeResponse(EmployeeResponse payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
