# TranslateApi

All URIs are relative to *https://api.synclabs.so*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTranslation**](TranslateApi.md#getTranslation) | **GET** /translate/{id} |  |
| [**translate**](TranslateApi.md#translate) | **POST** /translate |  |
| [**translationCost**](TranslateApi.md#translationCost) | **GET** /translate/cost |  |


<a name="getTranslation"></a>
# **getTranslation**
> TranslationJobExtended getTranslation(id).execute();



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
import com.konfigthis.client.api.TranslateApi;
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
      TranslationJobExtended result = client
              .translate
              .getTranslation(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVideoUrl());
      System.out.println(result.getAudioUrl());
      System.out.println(result.getTranscriptUrl());
      System.out.println(result.getOriginalVideoUrl());
      System.out.println(result.getSourceLanguage());
      System.out.println(result.getTargetLanguage());
      System.out.println(result.getStatus());
      System.out.println(result.getStep());
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#getTranslation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TranslationJobExtended> response = client
              .translate
              .getTranslation(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#getTranslation");
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

[**TranslationJobExtended**](TranslationJobExtended.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Returns video status and URL to download from. |  -  |

<a name="translate"></a>
# **translate**
> TranslationJobInitial translate(translateDto).execute();



Translates and synchronizes the given video to the specified target language.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TranslateApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.synclabs.so";
    
    configuration.apiKey  = "YOUR API KEY";
    SyncLabs client = new SyncLabs(configuration);
    String videoUrl = "videoUrl_example"; // A url to the video file to be translated and synchronized -- must be publicly accessible
    String targetLanguage = "targetLanguage_example"; // Target language to translate the video to
    Double maxCredits = 3.4D; // Maximum number of credits to use for video generation. If job exceeds this value, the job will be aborted
    String webhookUrl = "webhookUrl_example"; // A url to send a notification to upon completion of video generation
    String model = "sync-1.5.0"; // The model to use for video generation.
    try {
      TranslationJobInitial result = client
              .translate
              .translate(videoUrl, targetLanguage)
              .maxCredits(maxCredits)
              .webhookUrl(webhookUrl)
              .model(model)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getVideoUrl());
      System.out.println(result.getOriginalVideoUrl());
      System.out.println(result.getTargetLanguage());
      System.out.println(result.getStatus());
      System.out.println(result.getStep());
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#translate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TranslationJobInitial> response = client
              .translate
              .translate(videoUrl, targetLanguage)
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
      System.err.println("Exception when calling TranslateApi#translate");
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
| **translateDto** | [**TranslateDto**](TranslateDto.md)| Required data for translating and synchronizing video. Includes video URL, target language, and optional parameters for model selection, webhook integration, and credit limits. | |

### Return type

[**TranslationJobInitial**](TranslationJobInitial.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The translation job has been successfully created. |  -  |

<a name="translationCost"></a>
# **translationCost**
> translationCost(videoUrl).execute();



### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.SyncLabs;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TranslateApi;
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
    try {
      client
              .translate
              .translationCost(videoUrl)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#translationCost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .translate
              .translationCost(videoUrl)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling TranslateApi#translationCost");
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

