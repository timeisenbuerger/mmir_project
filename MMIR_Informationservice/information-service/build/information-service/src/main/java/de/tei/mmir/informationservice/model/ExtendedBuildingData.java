package de.tei.mmir.informationservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExtendedBuildingData extends BuildingData {
    @Schema(description = "Description of the building", example = "A 102-story Art Deco skyscraper in Midtown Manhattan, New York City")
    private String description;

    @Schema(description = "3D position of the building")
    private Position3D position;

    public ExtendedBuildingData(String name, String imageEncoded, String description, Position3D position) {
        super(name, imageEncoded);
        this.description = description;
        this.position = position;
    }
}
