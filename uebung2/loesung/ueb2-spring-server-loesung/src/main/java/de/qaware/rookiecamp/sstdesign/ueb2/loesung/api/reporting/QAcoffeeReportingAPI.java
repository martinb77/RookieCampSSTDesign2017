package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.reporting;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(description = "QAcoffee reporting api", tags = {"reporting"})
@RequestMapping(path = "/reporting", produces = "application/json")
@Controller
public class QAcoffeeReportingAPI {

    @ApiOperation(value = "Create a new report upon all stored evaluations.", notes = "Created report is a calculated " +
            "average for the numerical values and a summary (all comibined) for the remarks.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = ReportResponse.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public ResponseEntity<ReportResponse> createReport() {
        //some magic here...
        return ResponseEntity.ok().build();
    }

}
