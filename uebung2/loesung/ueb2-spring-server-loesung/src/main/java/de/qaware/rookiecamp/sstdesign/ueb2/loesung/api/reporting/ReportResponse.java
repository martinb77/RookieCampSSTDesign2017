package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.reporting;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.evaluation.Evaluation;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata.QAcoffeeResponse;
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
