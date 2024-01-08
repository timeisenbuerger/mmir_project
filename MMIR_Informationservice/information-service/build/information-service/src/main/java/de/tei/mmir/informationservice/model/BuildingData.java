package de.tei.mmir.informationservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BuildingData {
    @Schema(description = "Name of the building", example = "Empire State Building")
    private String name;

    @Schema(description = "Base64 encoded image of the building", example = "iVBORw0KGgoAAAANSUhEU...")
    private String imageEncoded;
}
