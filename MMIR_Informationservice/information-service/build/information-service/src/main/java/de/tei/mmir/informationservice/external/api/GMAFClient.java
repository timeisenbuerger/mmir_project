package de.tei.mmir.informationservice.external.api;

import de.tei.mmir.gmaf.api.DefaultApi;
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class GMAFClient {

    private final Logger logger = LoggerFactory.getLogger(GMAFClient.class);
    private final String serverUrl = "http://85.215.58.111:8242/gmaf/gmafApi";
    private final String API_KEY = "fp2023";

    @Getter
    private DefaultApi apiInstance;
    @Getter
    private String token;

    public GMAFClient() {
        initApiClient();
    }

    private void initApiClient() {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath(serverUrl);

        apiInstance = new DefaultApi(defaultApiClient);
        try {
            token = apiInstance.getAuthToken(API_KEY);
            logger.info(token);
        } catch (ApiException e) {
            String errorMessage = "Exception when calling DefaultApi#getAuthToken";
            errorMessage += "Status code: " + e.getCode();
            errorMessage += "Reason: " + e.getResponseBody();
            errorMessage += "Response headers: " + e.getResponseHeaders();
            logger.error(errorMessage);
        }
    }
}
