package de.qaware.rookiecamp.sstdesign.ueb2.loesung.api;

import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Beverage;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response.BeverageResponse;
import de.qaware.rookiecamp.sstdesign.ueb2.loesung.api.response.BooleanResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Api(description = "Administrative functions for the QAcoffe application", tags = {"data"})
@RequestMapping(path = "/data", produces = "application/json")
@Controller
public class QAcoffeeAdminAPI {

    @ApiOperation(value = "Create a new beverage. Requires ADMIN role.", notes = "Return value is the stored data including its new beverageId.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageResponse.class),
            @ApiResponse(code = 400, message = "Wrong parameters, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/beverages", method = RequestMethod.POST)
    public ResponseEntity<BeverageResponse> createBeverage(@ApiParam(value = "The beverage which should be created, 'beverageId' must be not set.", required = true)
                                                   @RequestBody Beverage beverage) {
        //business actions here
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Update a given beverage. Requires ADMIN role.", notes = "The beverage must be already existent. Return value is the updated and stored data.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BeverageResponse.class),
            @ApiResponse(code = 400, message = "Wrong parameters, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/beverages", method = RequestMethod.PUT)
    public ResponseEntity<BeverageResponse> updateBeverage(@ApiParam(value = "The updated data of the beverage", required = true)
                                               @RequestBody Beverage beverage) {
        //business actions here
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "Delete a certain beverage. Requires ADMIN role.", notes = "Deletes the beverage in the database")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 400, message = "Wrong parameters, unable to process the request in a proper way.", response = Errors.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.",
                    response = Errors.class)})
    @RequestMapping(path = "/beverages/{beverage}", method = RequestMethod.DELETE)
    public ResponseEntity<BooleanResponse> deleteBeverage(@ApiParam(value = "the ID of the beverage", required = true)
                                               @PathVariable Integer beverage) {
        //business actions here
        return ResponseEntity.ok().build();
    }


}
