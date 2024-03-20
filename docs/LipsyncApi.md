# LipsyncApi

All URIs are relative to *https://api.synclabs.so*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLipsync**](LipsyncApi.md#getLipsync) | **GET** /lipsync/{id} |  |
| [**lipSync**](LipsyncApi.md#lipSync) | **POST** /lipsync |  |
| [**lipsyncCost**](LipsyncApi.md#lipsyncCost) | **GET** /lipsync/cost |  |


<a name="getLipsync"></a>
# **getLipsync**
> LipSyncExtended getLipsync(id).execute();



Use the video ID from the POST request to check video status. Keep checking until status is &#39;completed&#39; and a download URL is provided.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LipsyncApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String id = "id_example";
    try {
      LipSyncExtended result = client
              .lipsync
              .getLipsync(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getOriginalVideoUrl());
      System.out.println(result.getOriginalAudioUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getSynergize());
      System.out.println(result.getCreditsDeducted());
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#getLipsync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LipSyncExtended> response = client
              .lipsync
              .getLipsync(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#getLipsync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**LipSyncExtended**](LipSyncExtended.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Returns video status and URL to download from. |  -  |

<a name="lipSync"></a>
# **lipSync**
> LipSyncInitial lipSync(lipsyncDto).execute();



Submit a set of urls to publically hosted audio and video files or to YouTube videos. Our synchronizer will sync the video&#39;s lip movements to match the audio and return the synced video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LipsyncApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String audioUrl = "audioUrl_example"; // A url to the audio file to be synchronized -- must be publicly accessible
    String videoUrl = "videoUrl_example"; // A url to the video file to be synchronized -- must be publicly accessible
    Boolean synergize = true; // A flag to enable / disable post-processing
    Double maxCredits = 3.4D; // Maximum number of credits to use for video generation. If job exceeds this value, the job will be aborted
    String webhookUrl = "webhookUrl_example"; // A url to send a notification to upon completion of video generation
    String model = "sync-1.5.0"; // The model to use for video generation
    try {
      LipSyncInitial result = client
              .lipsync
              .lipSync(audioUrl, videoUrl, synergize)
              .maxCredits(maxCredits)
              .webhookUrl(webhookUrl)
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUrl());
      System.out.println(result.getOriginalVideoUrl());
      System.out.println(result.getOriginalAudioUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getSynergize());
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#lipSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LipSyncInitial> response = client
              .lipsync
              .lipSync(audioUrl, videoUrl, synergize)
              .maxCredits(maxCredits)
              .webhookUrl(webhookUrl)
              .model(model)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#lipSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lipsyncDto** | [**LipsyncDto**](LipsyncDto.md)| The audio + video data to be synced. Set synergize &#x3D; false to skip our synergizer post-processor for a 10x speedup, but w/ a degredation in output quality. | |

### Return type

[**LipSyncInitial**](LipSyncInitial.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** |  |  -  |

<a name="lipsyncCost"></a>
# **lipsyncCost**
> lipsyncCost(audioUrl, videoUrl).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LipsyncApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String audioUrl = "audioUrl_example"; // A url to the audio file to be synchronized -- must be publicly accessible
    String videoUrl = "videoUrl_example"; // A url to the video file to be synchronized -- must be publicly accessible
    try {
      client
              .lipsync
              .lipsyncCost(audioUrl, videoUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#lipsyncCost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .lipsync
              .lipsyncCost(audioUrl, videoUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LipsyncApi#lipsyncCost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **audioUrl** | **String**| A url to the audio file to be synchronized -- must be publicly accessible | |
| **videoUrl** | **String**| A url to the video file to be synchronized -- must be publicly accessible | |

### Return type

null (empty response body)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

