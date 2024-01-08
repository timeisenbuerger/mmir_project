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
public class Position3D {
    @Schema(description = "Position on the X-axis", example = "28,28")
    private float x;
    @Schema(description = "Position on the Y-axis", example = "69,68")
    private float y;
    @Schema(description = "Position on the Z-axis", example = "1337,404")
    private float z;
}
