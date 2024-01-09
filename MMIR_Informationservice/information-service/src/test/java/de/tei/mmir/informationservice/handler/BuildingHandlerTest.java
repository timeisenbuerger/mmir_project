package de.tei.mmir.informationservice.handler;

import de.tei.mmir.gmaf.api.DefaultApi;
import de.tei.mmir.informationservice.external.api.GMAFClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.model.GeneralMetadata;
import de.tei.mmir.gmaf.model.MMFG;
import de.tei.mmir.informationservice.model.BuildingData;
import de.tei.mmir.informationservice.model.ExtendedBuildingData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class BuildingHandlerTest {

    @Mock
    private GMAFClient gmafClient;

    @Mock
    private DefaultApi defaultApi;

    @InjectMocks
    private BuildingHandler buildingHandler;

    @BeforeEach
    void setUp() {
        given(gmafClient.getApiInstance()).willReturn(defaultApi);
    }

    @Test
    public void getAllBuildingData_WhenDataExists_ShouldReturnList() throws ApiException {
        MMFG mmfg = createMockMMFG("Building1", "Description1", 100L, 200L);
        given(gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), "Building")).willReturn(List.of("id1"));
        given(gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), "id1")).willReturn(mmfg);

        List<BuildingData> result = buildingHandler.getAllBuildingData();

        assertThat(result).isNotNull().hasSize(1);
        assertThat(result.get(0).getName()).isEqualTo("Building1");
    }

    @Test
    public void getAllBuildingData_WhenNoDataExists_ShouldReturnEmptyList() throws ApiException {
        given(gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), "Building")).willReturn(Collections.emptyList());

        List<BuildingData> result = buildingHandler.getAllBuildingData();

        assertThat(result).isEmpty();
    }

    @Test
    public void getBuildingByName_WhenBuildingExists_ShouldReturnData() throws ApiException {
        MMFG mmfg = createMockMMFG("SpecificBuilding", "Description1", 100L, 200L);
        given(gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), "SpecificBuilding")).willReturn(List.of("id1"));
        given(gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), "id1")).willReturn(mmfg);

        ExtendedBuildingData result = buildingHandler.getBuildingByName("SpecificBuilding");

        assertThat(result).isNotNull();
        assertThat(result.getName()).isEqualTo("SpecificBuilding");
        assertThat(result.getDescription()).isEqualTo("Description1");
        assertThat(result.getPosition().getX()).isEqualTo(0.2f);
        assertThat(result.getPosition().getY()).isEqualTo(0.0f);
        assertThat(result.getPosition().getZ()).isEqualTo(0.1f);
    }

    @Test
    public void getBuildingByName_WhenBuildingDoesNotExist_ShouldReturnNull() throws ApiException {
        given(gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), "NonExisting")).willReturn(Collections.emptyList());

        ExtendedBuildingData result = buildingHandler.getBuildingByName("NonExisting");

        assertThat(result).isNull();
    }

    private MMFG createMockMMFG(String name, String cameraModel, Long longitude, Long latitude) {
        MMFG mmfg = new MMFG();
        GeneralMetadata generalMetadata = new GeneralMetadata();
        generalMetadata.setFileName(name);
        generalMetadata.setCameraModel(cameraModel);
        generalMetadata.setLongitude(longitude);
        generalMetadata.setLatitude(latitude);
        mmfg.setGeneralMetadata(generalMetadata);
        return mmfg;
    }
}
