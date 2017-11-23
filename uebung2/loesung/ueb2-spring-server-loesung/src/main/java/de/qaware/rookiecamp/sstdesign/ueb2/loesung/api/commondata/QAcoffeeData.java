package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.commondata;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.error.Errors;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(description = "QAcoffee base data api - only for getting data.", tags = {"data"})
@RequestMapping(path = "/data", produces = "application/json")
@Controller
public class QAcoffeeData {

    @ApiOperation(value = "Returns all beverages of QAcoffee.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.",
                    response = BeverageListResponse.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/beverages", method = RequestMethod.GET)
    public ResponseEntity<BeverageListResponse> getBeverages() {
        //some magic here...
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Returns all coffees of QAcoffee.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.",
                    response = CoffeeListResponse.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/coffees", method = RequestMethod.GET)
    public ResponseEntity<CoffeeListResponse> getCoffees() {
        //some magic here...
        return ResponseEntity.ok().build();
    }

}
