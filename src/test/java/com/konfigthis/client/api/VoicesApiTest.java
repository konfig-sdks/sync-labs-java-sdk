/*
 * Synchronize API
 * Synchronize API allows you to lipsync a video to any audio in any language.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VoicesApi
 */
@Disabled
public class VoicesApiTest {

    private static VoicesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new VoicesApi(apiClient);
    }

    /**
     * 
     *
     * Get all voices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void voicesTest() throws ApiException {
        api.voices()
                .execute();
        // TODO: test validations
    }

}
