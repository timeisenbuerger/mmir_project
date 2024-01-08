package de.tei.mmir.informationservice.controller;

import de.tei.mmir.informationservice.handler.BuildingHandler;
import de.tei.mmir.informationservice.model.BuildingData;
import de.tei.mmir.informationservice.model.ExtendedBuildingData;
import de.tei.mmir.informationservice.model.Position3D;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BuildingController.class)
public class BuildingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BuildingHandler buildingHandler;

    @Test
    public void getAllBuildingData_ShouldReturnData() throws Exception {
        BuildingData buildingData = new BuildingData("TestBuilding", "imageEncodedData");
        List<BuildingData> allBuildings = Collections.singletonList(buildingData);

        given(buildingHandler.getAllBuildingData()).willReturn(allBuildings);

        mockMvc.perform(get("/building/"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name").value("TestBuilding"))
            .andExpect(jsonPath("$[0].imageEncoded").value("imageEncodedData"));
    }

    @Test
    public void getAllBuildingData_ShouldReturnNotFound() throws Exception {
        given(buildingHandler.getAllBuildingData()).willReturn(Collections.emptyList());

        mockMvc.perform(get("/building/"))
            .andExpect(status().isNotFound());
    }

    @Test
    public void getBuildingDataByName_ShouldReturnData() throws Exception {
        ExtendedBuildingData extendedBuildingData = new ExtendedBuildingData("TestBuilding", "imageEncodedData", "TestDescription", null);
        
        given(buildingHandler.getBuildingByName("TestBuilding")).willReturn(extendedBuildingData);

        mockMvc.perform(get("/building/TestBuilding"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name").value("TestBuilding"))
            .andExpect(jsonPath("$.description").value("TestDescription"))
            .andExpect(jsonPath("$.imageEncoded").value("imageEncodedData"));
    }

    @Test
    public void getBuildingDataByName_ShouldReturnNotFound() throws Exception {
        given(buildingHandler.getBuildingByName("NonExistingBuilding")).willReturn(null);

        mockMvc.perform(get("/building/NonExistingBuilding"))
            .andExpect(status().isNotFound());
    }
}
