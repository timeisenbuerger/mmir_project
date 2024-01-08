package de.tei.mmir.informationservice.external.api;

import de.tei.mmir.gmaf.api.DefaultApi;
import de.tei.mmir.gmaf.invoker.ApiClient;
import de.tei.mmir.gmaf.invoker.ApiException;
import de.tei.mmir.gmaf.invoker.Configuration;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Client for interacting with the GMAF API.
 * This client manages the connection and authentication to the GMAF API,
 * providing a simplified interface for other components of the application.
 */
@Component
public class GMAFClient {

    private final Logger logger = LoggerFactory.getLogger(GMAFClient.class);
    private final String serverUrl = "http://85.215.58.111:8242/gmaf/gmafApi";
    private final String API_KEY = "fp2023";

    @Getter
    private DefaultApi apiInstance;

    @Getter
    private String token;

    /**
     * Constructs a GMAFClient, initializing the API client and refreshing the authentication token for the first time.
     */
    public GMAFClient() {
        initApiClient();
        token = refreshToken();
    }

    /**
     * Initializes the API client with default configuration and server URL.
     */
    private void initApiClient() {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath(serverUrl);

        apiInstance = new DefaultApi(defaultApiClient);
    }

    /**
     * Refreshes the authentication token for the GMAF API.
     *
     * @return The new authentication token, or null if the token could not be retrieved.
     */
    public String refreshToken() {
        String tokenResult = null;
        try {
            tokenResult = apiInstance.getAuthToken(API_KEY);
            logger.info(tokenResult);
        } catch (ApiException e) {
            String errorMessage = "Exception when calling DefaultApi#getAuthToken";
            errorMessage += " Status code: " + e.getCode();
            errorMessage += ", Reason: " + e.getResponseBody();
            errorMessage += ", Response headers: " + e.getResponseHeaders();
            logger.error(errorMessage);
        }
        return tokenResult;
    }
}
