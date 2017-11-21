package de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api;

import com.google.common.collect.ImmutableList;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.BeveragesDto;
import de.qaware.rookiecamp.sstdesign.ueb2.vorgabe.api.model.CoffeesDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.Instant;
import java.util.Collections;


@Api(value = "QAcoffeeAPI", description = "The API to the QAcoffeeAPI")
@RequestMapping(path = "/api/v1/coffee", produces = "application/json")
@Controller
public class QAcoffeeAPI {

    @ApiOperation(value = "Returns the available coffees", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of coffees", response = CoffeesDto.class)
    })
    @RequestMapping(path = "/availableCoffees", method = RequestMethod.GET)
    public ResponseEntity<CoffeesDto> getAvailableCoffees() {
        return new ResponseEntity<CoffeesDto>(new CoffeesDto(Collections.singletonList(
                new CoffeesDto.CoffeeDto(42, Instant.now().minusSeconds(36000), Instant.now(), "Super geiler Kaffee"))), HttpStatus.OK);
    }


    @ApiOperation(value = "Returns the available beverages", notes = "")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of beverages", response = BeveragesDto.class)
    })
    @RequestMapping(path = "/availableBeverages", method = RequestMethod.GET)
    public ResponseEntity<BeveragesDto> getAvailableBeverages() {
        return new ResponseEntity<BeveragesDto>(new BeveragesDto(ImmutableList.of(
                new BeveragesDto.BeverageDto(1, "Cappucino"),
                new BeveragesDto.BeverageDto(2, "Espresso"))), HttpStatus.OK);
    }
}
