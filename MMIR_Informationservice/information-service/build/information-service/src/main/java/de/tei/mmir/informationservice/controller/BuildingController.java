package de.tei.mmir.informationservice.controller;

import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.informationservice.handler.BuildingHandler;
import de.tei.mmir.informationservice.model.BuildingData;
import de.tei.mmir.informationservice.model.ExtendedBuildingData;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Tag(name = "Building Data", description = "Controller to retrieve data to buildings from GMAF.")
@RestController
@RequestMapping(path = "/building")
public class BuildingController {

    private final BuildingHandler buildingHandler;

    public BuildingController(BuildingHandler buildingHandler) {
        this.buildingHandler = buildingHandler;
    }

    @Operation(summary = "Get all building data", description = "Retrieves a list of all buildings")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved list of buildings"),
            @ApiResponse(responseCode = "404", description = "Buildings not found",
                    content = @Content(mediaType = "application/json",
                    examples = @ExampleObject(value = "{\"error\": \"Item not found\"}"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json",
                    examples = @ExampleObject(value = "{\"error\": \"Unexpected error occurred\"}")))
    })
    @GetMapping(path = "/")
    public ResponseEntity<List<BuildingData>> getAllBuildingData() throws ApiException {
        List<BuildingData> result = buildingHandler.getAllBuildingData();
        if (result == null || result.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }

    @Operation(summary = "Get building data by name", description = "Retrieves building data for a specific name")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved building data"),
            @ApiResponse(responseCode = "404", description = "Building not found",
                    content = @Content(mediaType = "application/json",
                            examples = @ExampleObject(value = "{\"error\": \"Item not found\"}"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json",
                            examples = @ExampleObject(value = "{\"error\": \"Unexpected error occurred\"}")))
    })
    @GetMapping(path = "/{name}")
    public ResponseEntity<ExtendedBuildingData> getBuildingDataByName(@PathVariable String name) throws ApiException {
        ExtendedBuildingData result = buildingHandler.getBuildingByName(name);
        if (result == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(result);
        }
    }
}
