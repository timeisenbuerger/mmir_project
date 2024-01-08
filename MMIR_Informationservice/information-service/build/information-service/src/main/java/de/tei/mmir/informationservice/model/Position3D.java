package de.tei.mmir.informationservice.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * Represents a 3D coordinate with X, Y, and Z axes.
 * This class is used to model the position of objects in a three-dimensional space.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Position3D {

    /**
     * The position on the X-axis.
     */
    @Schema(description = "Position on the X-axis", example = "28.28")
    private float x;

    /**
     * The position on the Y-axis.
     */
    @Schema(description = "Position on the Y-axis", example = "69.69")
    private float y;

    /**
     * The position on the Z-axis.
     */
    @Schema(description = "Position on the Z-axis", example = "1337.404")
    private float z;
}
