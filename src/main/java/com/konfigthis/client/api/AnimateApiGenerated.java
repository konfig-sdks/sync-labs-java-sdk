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


import com.konfigthis.client.model.AnimateDto;
import com.konfigthis.client.model.AnimateExtended;
import com.konfigthis.client.model.AnimateInitial;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AnimateApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AnimateApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AnimateApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call animateCall(AnimateDto animateDto, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = animateDto;

        // create path and map variables
        String localVarPath = "/animate";

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
    private okhttp3.Call animateValidateBeforeCall(AnimateDto animateDto, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'animateDto' is set
        if (animateDto == null) {
            throw new ApiException("Missing the required parameter 'animateDto' when calling animate(Async)");
        }

        return animateCall(animateDto, _callback);

    }


    private ApiResponse<AnimateInitial> animateWithHttpInfo(AnimateDto animateDto) throws ApiException {
        okhttp3.Call localVarCall = animateValidateBeforeCall(animateDto, null);
        Type localVarReturnType = new TypeToken<AnimateInitial>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call animateAsync(AnimateDto animateDto, final ApiCallback<AnimateInitial> _callback) throws ApiException {

        okhttp3.Call localVarCall = animateValidateBeforeCall(animateDto, _callback);
        Type localVarReturnType = new TypeToken<AnimateInitial>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AnimateRequestBuilder {
        private final String videoUrl;
        private final String transcript;
        private final String voiceId;
        private String model;
        private Double maxCredits;
        private String webhookUrl;

        private AnimateRequestBuilder(String videoUrl, String transcript, String voiceId) {
            this.videoUrl = videoUrl;
            this.transcript = transcript;
            this.voiceId = voiceId;
        }

        /**
         * Set model
         * @param model The model to use for video generation (optional, default to sync-1.5.0)
         * @return AnimateRequestBuilder
         */
        public AnimateRequestBuilder model(String model) {
            this.model = model;
            return this;
        }
        
        /**
         * Set maxCredits
         * @param maxCredits Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted (optional)
         * @return AnimateRequestBuilder
         */
        public AnimateRequestBuilder maxCredits(Double maxCredits) {
            this.maxCredits = maxCredits;
            return this;
        }
        
        /**
         * Set webhookUrl
         * @param webhookUrl A url to send a notification to upon completion of audio generation (optional)
         * @return AnimateRequestBuilder
         */
        public AnimateRequestBuilder webhookUrl(String webhookUrl) {
            this.webhookUrl = webhookUrl;
            return this;
        }
        
        /**
         * Build call for animate
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
            AnimateDto animateDto = buildBodyParams();
            return animateCall(animateDto, _callback);
        }

        private AnimateDto buildBodyParams() {
            AnimateDto animateDto = new AnimateDto();
            animateDto.videoUrl(this.videoUrl);
            animateDto.transcript(this.transcript);
            animateDto.voiceId(this.voiceId);
            animateDto.model(this.model);
            animateDto.maxCredits(this.maxCredits);
            animateDto.webhookUrl(this.webhookUrl);
            return animateDto;
        }

        /**
         * Execute animate request
         * @return AnimateInitial
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public AnimateInitial execute() throws ApiException {
            AnimateDto animateDto = buildBodyParams();
            ApiResponse<AnimateInitial> localVarResp = animateWithHttpInfo(animateDto);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute animate request with HTTP info returned
         * @return ApiResponse&lt;AnimateInitial&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AnimateInitial> executeWithHttpInfo() throws ApiException {
            AnimateDto animateDto = buildBodyParams();
            return animateWithHttpInfo(animateDto);
        }

        /**
         * Execute animate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AnimateInitial> _callback) throws ApiException {
            AnimateDto animateDto = buildBodyParams();
            return animateAsync(animateDto, _callback);
        }
    }

    /**
     * 
     * Generates audio given inputted text and voice and synchronizes with the given video.
     * @param animateDto Required data for animating video. Includes video URL, transcript, voice, and optional parameters for webhook integration and credit limits. (required)
     * @return AnimateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public AnimateRequestBuilder animate(String videoUrl, String transcript, String voiceId) throws IllegalArgumentException {
        if (videoUrl == null) throw new IllegalArgumentException("\"videoUrl\" is required but got null");
            

        if (transcript == null) throw new IllegalArgumentException("\"transcript\" is required but got null");
            

        if (voiceId == null) throw new IllegalArgumentException("\"voiceId\" is required but got null");
            

        return new AnimateRequestBuilder(videoUrl, transcript, voiceId);
    }
    private okhttp3.Call animateCostCall(String transcript, String transcriptUrl, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/animate/cost";

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
    private okhttp3.Call animateCostValidateBeforeCall(String transcript, String transcriptUrl, final ApiCallback _callback) throws ApiException {
        return animateCostCall(transcript, transcriptUrl, _callback);

    }


    private ApiResponse<Void> animateCostWithHttpInfo(String transcript, String transcriptUrl) throws ApiException {
        okhttp3.Call localVarCall = animateCostValidateBeforeCall(transcript, transcriptUrl, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call animateCostAsync(String transcript, String transcriptUrl, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = animateCostValidateBeforeCall(transcript, transcriptUrl, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AnimateCostRequestBuilder {
        private String transcript;
        private String transcriptUrl;

        private AnimateCostRequestBuilder() {
        }

        /**
         * Set transcript
         * @param transcript A string of text to be spoken by the AI (optional)
         * @return AnimateCostRequestBuilder
         */
        public AnimateCostRequestBuilder transcript(String transcript) {
            this.transcript = transcript;
            return this;
        }
        
        /**
         * Set transcriptUrl
         * @param transcriptUrl A url pointing to a file of text to be spoken by the AI (optional)
         * @return AnimateCostRequestBuilder
         */
        public AnimateCostRequestBuilder transcriptUrl(String transcriptUrl) {
            this.transcriptUrl = transcriptUrl;
            return this;
        }
        
        /**
         * Build call for animateCost
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
            return animateCostCall(transcript, transcriptUrl, _callback);
        }


        /**
         * Execute animateCost request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            animateCostWithHttpInfo(transcript, transcriptUrl);
        }

        /**
         * Execute animateCost request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return animateCostWithHttpInfo(transcript, transcriptUrl);
        }

        /**
         * Execute animateCost request (asynchronously)
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
            return animateCostAsync(transcript, transcriptUrl, _callback);
        }
    }

    /**
     * 
     * 
     * @return AnimateCostRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public AnimateCostRequestBuilder animateCost() throws IllegalArgumentException {
        return new AnimateCostRequestBuilder();
    }
    private okhttp3.Call getAnimationCall(String id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/animate/{id}"
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
    private okhttp3.Call getAnimationValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getAnimation(Async)");
        }

        return getAnimationCall(id, _callback);

    }


    private ApiResponse<AnimateExtended> getAnimationWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getAnimationValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<AnimateExtended>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAnimationAsync(String id, final ApiCallback<AnimateExtended> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAnimationValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<AnimateExtended>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAnimationRequestBuilder {
        private final String id;

        private GetAnimationRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Build call for getAnimation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAnimationCall(id, _callback);
        }


        /**
         * Execute getAnimation request
         * @return AnimateExtended
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public AnimateExtended execute() throws ApiException {
            ApiResponse<AnimateExtended> localVarResp = getAnimationWithHttpInfo(id);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAnimation request with HTTP info returned
         * @return ApiResponse&lt;AnimateExtended&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AnimateExtended> executeWithHttpInfo() throws ApiException {
            return getAnimationWithHttpInfo(id);
        }

        /**
         * Execute getAnimation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 0 </td><td> Returns status and URL to download from. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AnimateExtended> _callback) throws ApiException {
            return getAnimationAsync(id, _callback);
        }
    }

    /**
     * 
     * Use the ID from the POST request to check status. Keep checking until status is &#39;completed&#39; and a download URL is provided.
     * @param id  (required)
     * @return GetAnimationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 0 </td><td> Returns status and URL to download from. </td><td>  -  </td></tr>
     </table>
     */
    public GetAnimationRequestBuilder getAnimation(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetAnimationRequestBuilder(id);
    }
}
