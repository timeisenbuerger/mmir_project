package de.tei.mmir.informationservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Extended version of BuildingData, includes additional details about a building.
 * This class extends the basic building data with additional fields such as description and position.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExtendedBuildingData extends BuildingData {

    /**
     * A descriptive text about the building.
     */
    @Schema(description = "Description of the building", example = "A 102-story Art Deco skyscraper in Midtown Manhattan, New York City")
    private String description;

    /**
     * The 3D position of the building, represented as a Position3D object.
     */
    @Schema(description = "3D position of the building")
    private Position3D position;

    /**
     * Constructs an instance of ExtendedBuildingData with specified name, encoded image, description, and position.
     *
     * @param name         The name of the building.
     * @param imageEncoded The base64 encoded image of the building.
     * @param description  A description of the building.
     * @param position     The 3D position of the building.
     */
    public ExtendedBuildingData(String name, String imageEncoded, String description, Position3D position) {
        super(name, imageEncoded);
        this.description = description;
        this.position = position;
    }
}
