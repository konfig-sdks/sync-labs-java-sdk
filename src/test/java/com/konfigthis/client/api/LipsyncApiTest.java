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
import com.konfigthis.client.model.LipSyncExtended;
import com.konfigthis.client.model.LipSyncInitial;
import com.konfigthis.client.model.LipsyncDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LipsyncApi
 */
@Disabled
public class LipsyncApiTest {

    private static LipsyncApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LipsyncApi(apiClient);
    }

    /**
     * 
     *
     * Use the video ID from the POST request to check video status. Keep checking until status is &#39;completed&#39; and a download URL is provided.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLipsyncTest() throws ApiException {
        String id = null;
        LipSyncExtended response = api.getLipsync(id)
                .execute();
        // TODO: test validations
    }

    /**
     * 
     *
     * Submit a set of urls to publically hosted audio and video files or to YouTube videos. Our synchronizer will sync the video&#39;s lip movements to match the audio and return the synced video.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lipSyncTest() throws ApiException {
        String audioUrl = null;
        String videoUrl = null;
        Boolean synergize = null;
        Double maxCredits = null;
        String webhookUrl = null;
        String model = null;
        LipSyncInitial response = api.lipSync(audioUrl, videoUrl, synergize)
                .maxCredits(maxCredits)
                .webhookUrl(webhookUrl)
                .model(model)
                .execute();
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void lipsyncCostTest() throws ApiException {
        String audioUrl = null;
        String videoUrl = null;
        api.lipsyncCost(audioUrl, videoUrl)
                .execute();
        // TODO: test validations
    }

}
