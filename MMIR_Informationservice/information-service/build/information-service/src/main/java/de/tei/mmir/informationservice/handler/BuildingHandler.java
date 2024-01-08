package de.tei.mmir.informationservice.handler;

import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.model.GeneralMetadata;
import de.tei.mmir.gmaf.model.MMFG;
import de.tei.mmir.informationservice.external.api.GMAFClient;
import de.tei.mmir.informationservice.model.BuildingData;
import de.tei.mmir.informationservice.model.ExtendedBuildingData;
import de.tei.mmir.informationservice.model.Position3D;
import de.tei.mmir.informationservice.util.ReflectionUtil;
import de.tei.mmir.informationservice.util.StringSimilarityUtil;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;

@Component
public class BuildingHandler {

    private final String QUERY_KEYWORD = "Building";
    private final GMAFClient gmafClient;

    public BuildingHandler(GMAFClient gmafClient) {
        this.gmafClient = gmafClient;
    }

    public List<BuildingData> getAllBuildingData() throws ApiException {
        List<BuildingData> result = new ArrayList<>();
        List<String> ids = gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), QUERY_KEYWORD);
        for (String id : ids) {
            MMFG mmfg = gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), id);

            if (mmfg.getGeneralMetadata() != null) {

                String fileName = mmfg.getGeneralMetadata().getFileName();
                if (fileName == null || !fileName.contains(QUERY_KEYWORD)) continue;

                BuildingData buildingData = new BuildingData();
                buildingData.setName(fileName);

                if (mmfg.getId() != null) {
                    String imageId = Objects.requireNonNull(mmfg.getId()).toString();
                    byte[] imageAsBytes = gmafClient.getApiInstance().getImage(gmafClient.getToken(), imageId);
                    buildingData.setImageEncoded(Base64.getEncoder().encodeToString(imageAsBytes));
                }

                if (ReflectionUtil.isAtLeastOneFieldNonNull(buildingData)) {
                    result.add(buildingData);
                }
            }
        }

        return result;
    }

    public ExtendedBuildingData getBuildingByName(String name) throws ApiException {
        ExtendedBuildingData result = null;
        List<String> ids = gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), name);
        for (String id : ids) {
            MMFG mmfg = gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), id);

            GeneralMetadata generalMetadata = mmfg.getGeneralMetadata();
            if (generalMetadata != null) {
                String fileName = generalMetadata.getFileName();
                //Wenn die Strings zu 80% oder mehr ähneln, dann wird das wohl das Gebäude sein, was wir suchen
                if (fileName != null && StringSimilarityUtil.calculateSimilarity(name, fileName) >= 0.8) {
                    result = new ExtendedBuildingData();

                    result.setName(generalMetadata.getFileName());
                    String cameraModel = generalMetadata.getCameraModel();
                    if (cameraModel != null) {
                        result.setDescription(formatDescription(cameraModel));
                    }

                    Long longitude = generalMetadata.getLongitude();
                    Long latitude = generalMetadata.getLatitude();
                    if (longitude != null && latitude != null) {
                        Position3D position = new Position3D((float) latitude / 1000, 0, (float) longitude / 1000);
                        result.setPosition(position);
                    }

                    if (mmfg.getId() != null) {
                        String imageId = Objects.requireNonNull(mmfg.getId()).toString();
                        byte[] imageAsBytes = gmafClient.getApiInstance().getImage(gmafClient.getToken(), imageId);
                        result.setImageEncoded(Base64.getEncoder().encodeToString(imageAsBytes));
                    }
                    break;
                }
            }
        }
        return result;
    }

    private String formatDescription(String value) {
        return value.replaceAll("\\n", " ").replaceAll(" {13}", " ");
    }
}
