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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * VideoInitial
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VideoInitial {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ORIGINAL_VIDEO_URL = "original_video_url";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_VIDEO_URL)
  private String originalVideoUrl;

  public static final String SERIALIZED_NAME_ORIGINAL_AUDIO_URL = "original_audio_url";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_AUDIO_URL)
  private String originalAudioUrl;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SYNERGIZE = "synergize";
  @SerializedName(SERIALIZED_NAME_SYNERGIZE)
  private Boolean synergize;

  public VideoInitial() {
  }

  public VideoInitial id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the video.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A unique identifier for the video.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public VideoInitial url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * A URL which can be used to download the video.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URL which can be used to download the video.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public VideoInitial originalVideoUrl(String originalVideoUrl) {
    
    
    
    
    this.originalVideoUrl = originalVideoUrl;
    return this;
  }

   /**
   * The original URL of the video that was submitted.
   * @return originalVideoUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The original URL of the video that was submitted.")

  public String getOriginalVideoUrl() {
    return originalVideoUrl;
  }


  public void setOriginalVideoUrl(String originalVideoUrl) {
    
    
    
    this.originalVideoUrl = originalVideoUrl;
  }


  public VideoInitial originalAudioUrl(String originalAudioUrl) {
    
    
    
    
    this.originalAudioUrl = originalAudioUrl;
    return this;
  }

   /**
   * The original URL of the audio that was submitted.
   * @return originalAudioUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The original URL of the audio that was submitted.")

  public String getOriginalAudioUrl() {
    return originalAudioUrl;
  }


  public void setOriginalAudioUrl(String originalAudioUrl) {
    
    
    
    this.originalAudioUrl = originalAudioUrl;
  }


  public VideoInitial status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the video.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status of the video.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public VideoInitial synergize(Boolean synergize) {
    
    
    
    
    this.synergize = synergize;
    return this;
  }

   /**
   * A flag to enable / disable post-processing
   * @return synergize
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A flag to enable / disable post-processing")

  public Boolean getSynergize() {
    return synergize;
  }


  public void setSynergize(Boolean synergize) {
    
    
    
    this.synergize = synergize;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the VideoInitial instance itself
   */
  public VideoInitial putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoInitial videoInitial = (VideoInitial) o;
    return Objects.equals(this.id, videoInitial.id) &&
        Objects.equals(this.url, videoInitial.url) &&
        Objects.equals(this.originalVideoUrl, videoInitial.originalVideoUrl) &&
        Objects.equals(this.originalAudioUrl, videoInitial.originalAudioUrl) &&
        Objects.equals(this.status, videoInitial.status) &&
        Objects.equals(this.synergize, videoInitial.synergize)&&
        Objects.equals(this.additionalProperties, videoInitial.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, originalVideoUrl, originalAudioUrl, status, synergize, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoInitial {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    originalVideoUrl: ").append(toIndentedString(originalVideoUrl)).append("\n");
    sb.append("    originalAudioUrl: ").append(toIndentedString(originalAudioUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    synergize: ").append(toIndentedString(synergize)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("url");
    openapiFields.add("original_video_url");
    openapiFields.add("original_audio_url");
    openapiFields.add("status");
    openapiFields.add("synergize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("original_video_url");
    openapiRequiredFields.add("original_audio_url");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("synergize");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VideoInitial
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VideoInitial.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VideoInitial is not found in the empty JSON string", VideoInitial.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VideoInitial.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if (!jsonObj.get("original_video_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_video_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_video_url").toString()));
      }
      if (!jsonObj.get("original_audio_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_audio_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_audio_url").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VideoInitial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VideoInitial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VideoInitial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VideoInitial.class));

       return (TypeAdapter<T>) new TypeAdapter<VideoInitial>() {
           @Override
           public void write(JsonWriter out, VideoInitial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public VideoInitial read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VideoInitial instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VideoInitial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VideoInitial
  * @throws IOException if the JSON string is invalid with respect to VideoInitial
  */
  public static VideoInitial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VideoInitial.class);
  }

 /**
  * Convert an instance of VideoInitial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

