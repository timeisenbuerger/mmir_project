package de.tei.mmir.informationservice.controller;

import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.informationservice.handler.BuildingHandler;
import de.tei.mmir.informationservice.model.BuildingData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/building")
public class BuildingController {

    private final BuildingHandler buildingHandler;

    public BuildingController(BuildingHandler buildingHandler) {
        this.buildingHandler = buildingHandler;
    }

    @GetMapping(path = "/")
    public ResponseEntity<List<BuildingData>> getAllBuildingData() throws ApiException {
        return ResponseEntity.ok(buildingHandler.getAllBuildingData());
    }

    @GetMapping(path = "/{name}")
    public ResponseEntity<BuildingData> getBuildingDataByName(@PathVariable String name) throws ApiException {
        return ResponseEntity.ok(buildingHandler.getBuildingByName(name));
    }
}
