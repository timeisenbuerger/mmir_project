package de.tei.mmir.informationservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExtendedBuildingData extends BuildingData {
    private String description;
    private Position3D position;
}
