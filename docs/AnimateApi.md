# AnimateApi

All URIs are relative to *https://api.synclabs.so*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**animate**](AnimateApi.md#animate) | **POST** /animate |  |
| [**animateCost**](AnimateApi.md#animateCost) | **GET** /animate/cost |  |
| [**getAnimation**](AnimateApi.md#getAnimation) | **GET** /animate/{id} |  |


<a name="animate"></a>
# **animate**
> AnimateInitial animate(animateDto).execute();



Generates audio given inputted text and voice and synchronizes with the given video.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnimateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String videoUrl = "videoUrl_example"; // A url to the video file to be synchronized -- must be publicly accessible
    String transcript = "transcript_example"; // A string of text to be spoken by the AI
    String voiceId = "voiceId_example"; // The voice to use for audio generation
    String model = "sync-1.5.0"; // The model to use for video generation
    Double maxCredits = 3.4D; // Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted
    String webhookUrl = "webhookUrl_example"; // A url to send a notification to upon completion of audio generation
    try {
      AnimateInitial result = client
              .animate
              .animate(videoUrl, transcript, voiceId)
              .model(model)
              .maxCredits(maxCredits)
              .webhookUrl(webhookUrl)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVideoUrl());
      System.out.println(result.getAudioUrl());
      System.out.println(result.getTranscriptUrl());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#animate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnimateInitial> response = client
              .animate
              .animate(videoUrl, transcript, voiceId)
              .model(model)
              .maxCredits(maxCredits)
              .webhookUrl(webhookUrl)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#animate");
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
| **animateDto** | [**AnimateDto**](AnimateDto.md)| Required data for animating video. Includes video URL, transcript, voice, and optional parameters for webhook integration and credit limits. | |

### Return type

[**AnimateInitial**](AnimateInitial.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="animateCost"></a>
# **animateCost**
> animateCost().transcript(transcript).transcriptUrl(transcriptUrl).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnimateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String transcript = "transcript_example"; // A string of text to be spoken by the AI
    String transcriptUrl = "transcriptUrl_example"; // A url pointing to a file of text to be spoken by the AI
    try {
      client
              .animate
              .animateCost()
              .transcript(transcript)
              .transcriptUrl(transcriptUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#animateCost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .animate
              .animateCost()
              .transcript(transcript)
              .transcriptUrl(transcriptUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#animateCost");
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
| **transcript** | **String**| A string of text to be spoken by the AI | [optional] |
| **transcriptUrl** | **String**| A url pointing to a file of text to be spoken by the AI | [optional] |

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

<a name="getAnimation"></a>
# **getAnimation**
> AnimateExtended getAnimation(id).execute();



Use the ID from the POST request to check status. Keep checking until status is &#39;completed&#39; and a download URL is provided.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AnimateApi;
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
      AnimateExtended result = client
              .animate
              .getAnimation(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVideoUrl());
      System.out.println(result.getAudioUrl());
      System.out.println(result.getTranscriptUrl());
      System.out.println(result.getStatus());
      System.out.println(result.getCreditsDeducted());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#getAnimation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AnimateExtended> response = client
              .animate
              .getAnimation(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AnimateApi#getAnimation");
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

[**AnimateExtended**](AnimateExtended.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Returns status and URL to download from. |  -  |

