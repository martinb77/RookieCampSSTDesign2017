package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.Errors;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.response.BooleanResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/api")
@Api(value = "theAPI", description = "some description about this API", tags = {"someTag"})
@Produces("application/json")
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns something.", notes = "some more description here")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successful operation, may contain business errors.", response = BooleanResponse.class),
            @ApiResponse(code = 500, message = "An internal error occurred, unable to process the request in a proper way.", response = Errors.class)})
    @GET
    @Path("/doSomething")
    public Response doSomething() {
        // do some magic!
        return Response.ok(new BooleanResponse(Boolean.FALSE, null)).build();
    }

}
