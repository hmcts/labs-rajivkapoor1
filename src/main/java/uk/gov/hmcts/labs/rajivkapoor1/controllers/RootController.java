package uk.gov.hmcts.labs.rajivkapoor1.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

/**
 * Default endpoints per application.
 */
@RestController
public class RootController {

        @Operation(summary = "Get welcome api",
        description = "This is a welcome endpoint"
        )

        @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "A welcome message"),
            @ApiResponse(responseCode = "404", description = "No welcome could be found")

    @RequestMapping("/", method = GET, produces = TEXT_PLAIN_VALUE))
    public ResponseEntity<String> welcome() {
        return ok("Welcome to labs-rajivkapoor1 application");
    }
}
