package de.tei.mmir.informationservice.external.api;

import de.tei.mmir.gmaf.api.DefaultApi;
import de.tei.mmir.gmaf.invoker.ApiException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GMAFClientTest {

    private GMAFClient gmafClient;
    private DefaultApi mockDefaultApi;

    @BeforeEach
    void setUp() {
        mockDefaultApi = mock(DefaultApi.class);
        gmafClient = new GMAFClient();
        gmafClient.setApiInstance(mockDefaultApi);
    }

    @Test
    void refreshToken_Success() throws ApiException {
        // Setup
        String expectedToken = "testToken";
        when(mockDefaultApi.getAuthToken(anyString())).thenReturn(expectedToken);

        // Action
        String actualToken = gmafClient.refreshToken();

        // Assertion
        assertThat(actualToken).isNotNull().isEqualTo(expectedToken);
        verify(mockDefaultApi).getAuthToken(anyString());
    }

    @Test
    void refreshToken_ApiException() throws ApiException {
        // Setup
        when(mockDefaultApi.getAuthToken(anyString())).thenThrow(ApiException.class);

        // Action
        String actualToken = gmafClient.refreshToken();

        // Assertion
        assertThat(actualToken).isNull();
        verify(mockDefaultApi).getAuthToken(anyString());
    }
}
