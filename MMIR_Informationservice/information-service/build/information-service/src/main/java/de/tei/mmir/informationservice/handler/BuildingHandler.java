package de.tei.mmir.informationservice.handler;

import de.tei.mmir.gmaf.invoker.ApiException;
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

    private final String QUERY_KEYWORD = "cat";
    private final GMAFClient gmafClient;

    public BuildingHandler(GMAFClient gmafClient) {
        this.gmafClient = gmafClient;
    }

    public List<BuildingData> getAllBuildingData() throws ApiException {
        List<BuildingData> result = new ArrayList<>();
        List<String> ids = gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), QUERY_KEYWORD);
        for (int i = 0; i < 4; i++) {
            String id = ids.get(i);
            MMFG mmfg = gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), id);

            BuildingData buildingData = new BuildingData();
            if (mmfg.getGeneralMetadata() != null) {
                buildingData.setName(mmfg.getGeneralMetadata().getFileName());
            }

            if (mmfg.getId() != null) {
                String imageId = Objects.requireNonNull(mmfg.getId()).toString();
                byte[] imageAsBytes = gmafClient.getApiInstance().getImage(gmafClient.getToken(), imageId);
                buildingData.setImageEncoded(Base64.getEncoder().encodeToString(imageAsBytes));
            }

            if (ReflectionUtil.isAtLeastOneFieldNonNull(buildingData)) {
                result.add(buildingData);
            }
        }

        return result;
    }

    public BuildingData getBuildingByName(String name) throws ApiException {
        ExtendedBuildingData result = null;
        List<String> ids = gmafClient.getApiInstance().queryByKeyword(gmafClient.getToken(), name);
        for (int i = 0; i < 4; i++) {
            String id = ids.get(i);
            MMFG mmfg = gmafClient.getApiInstance().getMMFGForId(gmafClient.getToken(), id);

            if (mmfg.getGeneralMetadata() != null) {

                String fileName = mmfg.getGeneralMetadata().getFileName();
                //Wenn die Strings zu 80% oder mehr ähneln, dann wird das wohl das Gebäude sein, was wir suchen
                if (fileName != null && StringSimilarityUtil.calculateSimilarity(name, fileName) >= 0.8) {
                    result = new ExtendedBuildingData();
                    result.setName(mmfg.getGeneralMetadata().getFileName());

                    if (mmfg.getId() != null) {
                        String imageId = Objects.requireNonNull(mmfg.getId()).toString();
                        byte[] imageAsBytes = gmafClient.getApiInstance().getImage(gmafClient.getToken(), imageId);
                        result.setImageEncoded(Base64.getEncoder().encodeToString(imageAsBytes));
                    }

                    //TODO Hier muss noch geschaut werden, woher man diese Daten bekommt
                    result.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Curabitur pretium tincidunt lacus. Nulla gravida orci a odio. Nullam varius, turpis et commodo pharetra, est eros bibendum elit, nec luctus magna felis sollicitudin mauris. Integer in mauris eu nibh euismod gravida. Duis ac tellus et risus vulputate vehicula. Donec lobortis risus a elit. Etiam tempor. Ut ullamcorper, ligula eu tempor congue, eros est euismod turpis, id tincidunt sapien risus a quam. Maecenas fermentum consequat mi. Donec fermentum. Pellentesque malesuada nulla a mi. Duis sapien sem, aliquet nec, commodo eget, consequat quis, neque. Aliquam faucibus, elit ut dictum aliquet, felis nisl adipiscing sapien, sed malesuada diam lacus eget erat. Cras mollis scelerisque nunc. Nullam arcu. Aliquam consequat. Curabitur augue lorem, dapibus quis, laoreet et, pretium ac, nisi. Aenean magna nisl, mollis quis, molestie eu, feugiat in, orci. In hac habitasse platea dictumst.");
                    result.setPosition(new Position3D(28, 28, 28));
                    break;
                }
            }
        }
        return result;
    }
}
