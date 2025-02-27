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
 * AnimateDto
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AnimateDto {
  public static final String SERIALIZED_NAME_VIDEO_URL = "videoUrl";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  public static final String SERIALIZED_NAME_TRANSCRIPT = "transcript";
  @SerializedName(SERIALIZED_NAME_TRANSCRIPT)
  private String transcript;

  public static final String SERIALIZED_NAME_VOICE_ID = "voiceId";
  @SerializedName(SERIALIZED_NAME_VOICE_ID)
  private String voiceId;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model = "sync-1.5.0";

  public static final String SERIALIZED_NAME_MAX_CREDITS = "maxCredits";
  @SerializedName(SERIALIZED_NAME_MAX_CREDITS)
  private Double maxCredits;

  public static final String SERIALIZED_NAME_WEBHOOK_URL = "webhookUrl";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_URL)
  private String webhookUrl;

  public AnimateDto() {
  }

  public AnimateDto videoUrl(String videoUrl) {
    
    
    
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * A url to the video file to be synchronized -- must be publicly accessible
   * @return videoUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A url to the video file to be synchronized -- must be publicly accessible")

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    
    
    
    this.videoUrl = videoUrl;
  }


  public AnimateDto transcript(String transcript) {
    
    
    
    
    this.transcript = transcript;
    return this;
  }

   /**
   * A string of text to be spoken by the AI
   * @return transcript
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A string of text to be spoken by the AI")

  public String getTranscript() {
    return transcript;
  }


  public void setTranscript(String transcript) {
    
    
    
    this.transcript = transcript;
  }


  public AnimateDto voiceId(String voiceId) {
    
    
    
    
    this.voiceId = voiceId;
    return this;
  }

   /**
   * The voice to use for audio generation
   * @return voiceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The voice to use for audio generation")

  public String getVoiceId() {
    return voiceId;
  }


  public void setVoiceId(String voiceId) {
    
    
    
    this.voiceId = voiceId;
  }


  public AnimateDto model(String model) {
    
    
    
    
    this.model = model;
    return this;
  }

   /**
   * The model to use for video generation
   * @return model
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sync-1.5.0", value = "The model to use for video generation")

  public String getModel() {
    return model;
  }


  public void setModel(String model) {
    
    
    
    this.model = model;
  }


  public AnimateDto maxCredits(Double maxCredits) {
    
    
    
    
    this.maxCredits = maxCredits;
    return this;
  }

  public AnimateDto maxCredits(Integer maxCredits) {
    
    
    
    
    this.maxCredits = maxCredits.doubleValue();
    return this;
  }

   /**
   * Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted
   * @return maxCredits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of credits to use for audio generation. If job exceeds this value, the job will be aborted")

  public Double getMaxCredits() {
    return maxCredits;
  }


  public void setMaxCredits(Double maxCredits) {
    
    
    
    this.maxCredits = maxCredits;
  }


  public AnimateDto webhookUrl(String webhookUrl) {
    
    
    
    
    this.webhookUrl = webhookUrl;
    return this;
  }

   /**
   * A url to send a notification to upon completion of audio generation
   * @return webhookUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A url to send a notification to upon completion of audio generation")

  public String getWebhookUrl() {
    return webhookUrl;
  }


  public void setWebhookUrl(String webhookUrl) {
    
    
    
    this.webhookUrl = webhookUrl;
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
   * @return the AnimateDto instance itself
   */
  public AnimateDto putAdditionalProperty(String key, Object value) {
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
    AnimateDto animateDto = (AnimateDto) o;
    return Objects.equals(this.videoUrl, animateDto.videoUrl) &&
        Objects.equals(this.transcript, animateDto.transcript) &&
        Objects.equals(this.voiceId, animateDto.voiceId) &&
        Objects.equals(this.model, animateDto.model) &&
        Objects.equals(this.maxCredits, animateDto.maxCredits) &&
        Objects.equals(this.webhookUrl, animateDto.webhookUrl)&&
        Objects.equals(this.additionalProperties, animateDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoUrl, transcript, voiceId, model, maxCredits, webhookUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnimateDto {\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
    sb.append("    voiceId: ").append(toIndentedString(voiceId)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    maxCredits: ").append(toIndentedString(maxCredits)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
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
    openapiFields.add("videoUrl");
    openapiFields.add("transcript");
    openapiFields.add("voiceId");
    openapiFields.add("model");
    openapiFields.add("maxCredits");
    openapiFields.add("webhookUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("videoUrl");
    openapiRequiredFields.add("transcript");
    openapiRequiredFields.add("voiceId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnimateDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AnimateDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnimateDto is not found in the empty JSON string", AnimateDto.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AnimateDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("videoUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `videoUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("videoUrl").toString()));
      }
      if (!jsonObj.get("transcript").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transcript` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transcript").toString()));
      }
      if (!jsonObj.get("voiceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voiceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voiceId").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if ((jsonObj.get("webhookUrl") != null && !jsonObj.get("webhookUrl").isJsonNull()) && !jsonObj.get("webhookUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnimateDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnimateDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnimateDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnimateDto.class));

       return (TypeAdapter<T>) new TypeAdapter<AnimateDto>() {
           @Override
           public void write(JsonWriter out, AnimateDto value) throws IOException {
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
           public AnimateDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AnimateDto instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AnimateDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnimateDto
  * @throws IOException if the JSON string is invalid with respect to AnimateDto
  */
  public static AnimateDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnimateDto.class);
  }

 /**
  * Convert an instance of AnimateDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

