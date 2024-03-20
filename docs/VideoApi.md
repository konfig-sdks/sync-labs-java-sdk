# VideoApi

All URIs are relative to *https://api.synclabs.so*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cost**](VideoApi.md#cost) | **GET** /video/cost |  |
| [**getLipSyncJob**](VideoApi.md#getLipSyncJob) | **GET** /video/{id} |  |
| [**lipSync**](VideoApi.md#lipSync) | **POST** /video |  |


<a name="cost"></a>
# **cost**
> cost(audioUrl, videoUrl).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideoApi;
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
              .video
              .cost(audioUrl, videoUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideoApi#cost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .video
              .cost(audioUrl, videoUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling VideoApi#cost");
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

<a name="getLipSyncJob"></a>
# **getLipSyncJob**
> VideoExtended getLipSyncJob(id).execute();



[Deprecated] Use the video ID from the POST request to check video status. Keep checking until status is &#39;completed&#39; and a download URL is provided.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideoApi;
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
      VideoExtended result = client
              .video
              .getLipSyncJob(id)
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
      System.err.println("Exception when calling VideoApi#getLipSyncJob");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoExtended> response = client
              .video
              .getLipSyncJob(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling VideoApi#getLipSyncJob");
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

[**VideoExtended**](VideoExtended.md)

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
> VideoInitial lipSync(createVideoDto).execute();



[Deprecated] Submit a set of urls to publically hosted audio and video files or to YouTube videos. Our synchronizer will sync the video&#39;s lip movements to match the audio and return the synced video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.VideoApi;
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
      VideoInitial result = client
              .video
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
      System.err.println("Exception when calling VideoApi#lipSync");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<VideoInitial> response = client
              .video
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
      System.err.println("Exception when calling VideoApi#lipSync");
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
| **createVideoDto** | [**CreateVideoDto**](CreateVideoDto.md)| The audio + video data to be synced. Set synergize &#x3D; false to skip our synergizer post-processor for a 10x speedup, but w/ a degredation in output quality. | |

### Return type

[**VideoInitial**](VideoInitial.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** |  |  -  |

