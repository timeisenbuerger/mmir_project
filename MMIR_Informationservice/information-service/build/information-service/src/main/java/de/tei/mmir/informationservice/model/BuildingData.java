package de.tei.mmir.informationservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Represents the basic data of a building.
 * This class is used as a data transfer object to convey building information.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuildingData {

    /**
     * The name of the building.
     */
    @Schema(description = "Name of the building", example = "Empire State Building")
    private String name;

    /**
     * The base64 encoded image data of the building.
     */
    @Schema(description = "Base64 encoded image of the building", example = "iVBORw0KGgoAAAANSUhEU...")
    private String imageEncoded;
}