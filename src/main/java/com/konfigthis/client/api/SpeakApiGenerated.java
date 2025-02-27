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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.SpeakDto;
import com.konfigthis.client.model.SpeakExtended;
import com.konfigthis.client.model.SpeakInitial;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SpeakApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SpeakApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public SpeakApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        if (apiClient.getApiKey() == null) {
            throw new IllegalArgumentException("\"x-api-key\" is required but no API key was provided. Please set \"x-api-key\" with ApiClient#setApiKey(String).");
        }
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getSpeechCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/speak/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSpeechValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSpeech(Async)");
        }

        return getSpeechCall(id, _callback);

    }


    private ApiResponse<SpeakExtended> getSpeechWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getSpeechValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<SpeakExtended>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSpeechAsync(String id, final ApiCallback<SpeakExtended> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSpeechValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<SpeakExtended>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSpeechRequestBuilder {
        private final String id;

        private GetSpeechRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Build call for getSpeech
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns video status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSpeechCall(id, _callback);
        }


        /**
         * Execute getSpeech request
         * @return SpeakExtended
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns video status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public SpeakExtended execute() throws ApiException {
            ApiResponse<SpeakExtended> localVarResp = getSpeechWithHttpInfo(id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSpeech request with HTTP info returned
         * @return ApiResponse&lt;SpeakExtended&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns video status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SpeakExtended> executeWithHttpInfo() throws ApiException {
            return getSpeechWithHttpInfo(id);
        }

        /**
         * Execute getSpeech request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns video status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SpeakExtended> _callback) throws ApiException {
            return getSpeechAsync(id, _callback);
        }
    }

    /**
     * 
     * Use the video ID from the POST request to check video status. Keep checking until status is &#39;completed&#39; and a download URL is provided.
     * @param id  (required)
     * @return GetSpeechRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Returns video status and URL to download from. </td><td>  -  </td></tr>
     </table>
     */
    public GetSpeechRequestBuilder getSpeech(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetSpeechRequestBuilder(id);
    }
    private okhttp3.Call speakCall(SpeakDto speakDto, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = speakDto;

        // create path and map variables
        String localVarPath = "/speak";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call speakValidateBeforeCall(SpeakDto speakDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'speakDto' is set
        if (speakDto == null) {
            throw new ApiException("Missing the required parameter 'speakDto' when calling speak(Async)");
        }

        return speakCall(speakDto, _callback);

    }


    private ApiResponse<SpeakInitial> speakWithHttpInfo(SpeakDto speakDto) throws ApiException {
        okhttp3.Call localVarCall = speakValidateBeforeCall(speakDto, null);
        Type localVarReturnType = new TypeToken<SpeakInitial>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call speakAsync(SpeakDto speakDto, final ApiCallback<SpeakInitial> _callback) throws ApiException {

        okhttp3.Call localVarCall = speakValidateBeforeCall(speakDto, _callback);
        Type localVarReturnType = new TypeToken<SpeakInitial>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SpeakRequestBuilder {
        private final String transcript;
        private final String voiceId;
        private Double maxCredits;
        private String webhookUrl;

        private SpeakRequestBuilder(String transcript, String voiceId) {
            this.transcript = transcript;
            this.voiceId = voiceId;
        }

        /**
         * Set maxCredits
         * @param maxCredits Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted (optional)
         * @return SpeakRequestBuilder
         */
        public SpeakRequestBuilder maxCredits(Double maxCredits) {
            this.maxCredits = maxCredits;
            return this;
        }
        
        /**
         * Set webhookUrl
         * @param webhookUrl A url to send a notification to upon completion of audio generation (optional)
         * @return SpeakRequestBuilder
         */
        public SpeakRequestBuilder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        
        /**
         * Build call for speak
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            SpeakDto speakDto = buildBodyParams();
            return speakCall(speakDto, _callback);
        }

        private SpeakDto buildBodyParams() {
            SpeakDto speakDto = new SpeakDto();
            speakDto.transcript(this.transcript);
            speakDto.voiceId(this.voiceId);
            speakDto.maxCredits(this.maxCredits);
            speakDto.webhookUrl(this.webhookUrl);
            return speakDto;
        }

        /**
         * Execute speak request
         * @return SpeakInitial
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public SpeakInitial execute() throws ApiException {
            SpeakDto speakDto = buildBodyParams();
            ApiResponse<SpeakInitial> localVarResp = speakWithHttpInfo(speakDto);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute speak request with HTTP info returned
         * @return ApiResponse&lt;SpeakInitial&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<SpeakInitial> executeWithHttpInfo() throws ApiException {
            SpeakDto speakDto = buildBodyParams();
            return speakWithHttpInfo(speakDto);
        }

        /**
         * Execute speak request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<SpeakInitial> _callback) throws ApiException {
            SpeakDto speakDto = buildBodyParams();
            return speakAsync(speakDto, _callback);
        }
    }

    /**
     * 
     * 
     * @param speakDto  (required)
     * @return SpeakRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SpeakRequestBuilder speak(String transcript, String voiceId) throws IllegalArgumentException {
        if (transcript == null) throw new IllegalArgumentException("\"transcript\" is required but got null");
            

        if (voiceId == null) throw new IllegalArgumentException("\"voiceId\" is required but got null");
            

        return new SpeakRequestBuilder(transcript, voiceId);
    }
    private okhttp3.Call speakCostCall(String transcript, String transcriptUrl, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/speak/cost";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (transcript != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transcript", transcript));
        }

        if (transcriptUrl != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transcriptUrl", transcriptUrl));
        }

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call speakCostValidateBeforeCall(String transcript, String transcriptUrl, final ApiCallback _callback) throws ApiException {
        return speakCostCall(transcript, transcriptUrl, _callback);

    }


    private ApiResponse<Void> speakCostWithHttpInfo(String transcript, String transcriptUrl) throws ApiException {
        okhttp3.Call localVarCall = speakCostValidateBeforeCall(transcript, transcriptUrl, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call speakCostAsync(String transcript, String transcriptUrl, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = speakCostValidateBeforeCall(transcript, transcriptUrl, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class SpeakCostRequestBuilder {
        private String transcript;
        private String transcriptUrl;

        private SpeakCostRequestBuilder() {
        }

        /**
         * Set transcript
         * @param transcript A string of text to be spoken by the AI (optional)
         * @return SpeakCostRequestBuilder
         */
        public SpeakCostRequestBuilder transcript(String transcript) {
            this.transcript = transcript;
            return this;
        }
        
        /**
         * Set transcriptUrl
         * @param transcriptUrl A url pointing to a file of text to be spoken by the AI (optional)
         * @return SpeakCostRequestBuilder
         */
        public SpeakCostRequestBuilder transcriptUrl(String transcriptUrl) {
            this.transcriptUrl = transcriptUrl;
            return this;
        }
        
        /**
         * Build call for speakCost
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return speakCostCall(transcript, transcriptUrl, _callback);
        }


        /**
         * Execute speakCost request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            speakCostWithHttpInfo(transcript, transcriptUrl);
        }

        /**
         * Execute speakCost request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return speakCostWithHttpInfo(transcript, transcriptUrl);
        }

        /**
         * Execute speakCost request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return speakCostAsync(transcript, transcriptUrl, _callback);
        }
    }

    /**
     * 
     * 
     * @return SpeakCostRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public SpeakCostRequestBuilder speakCost() throws IllegalArgumentException {
        return new SpeakCostRequestBuilder();
    }
}
