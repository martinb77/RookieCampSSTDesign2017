package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Evaluation;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Typisation of the generic QAcoffeeResponse class.
 */
@ApiModel(description = "Response for Reports")
public class ReportResponse extends QAcoffeeResponse<List<Evaluation>> {
    public ReportResponse(List<Evaluation> payload, Errors businessErrors) {
        super(payload, businessErrors);
    }
}
