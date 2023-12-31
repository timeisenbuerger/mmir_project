/*
 * GMAF
 * GMAF REST
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.tei.mmir.gmaf.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import de.tei.mmir.gmaf.invoker.JSON;

/**
 * Timerange
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T18:14:15.712829700+01:00[Europe/Berlin]")
public class Timerange {
  public static final String SERIALIZED_NAME_BEGIN = "begin";
  @SerializedName(SERIALIZED_NAME_BEGIN)
  private OffsetDateTime begin;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_UNIVERSAL_TIME = "universalTime";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_TIME)
  private Boolean universalTime;

  public static final String SERIALIZED_NAME_RELATIVE_TIME = "relativeTime";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TIME)
  private Boolean relativeTime;

  public Timerange() {
  }

  public Timerange begin(OffsetDateTime begin) {
    
    this.begin = begin;
    return this;
  }

   /**
   * Get begin
   * @return begin
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getBegin() {
    return begin;
  }


  public void setBegin(OffsetDateTime begin) {
    this.begin = begin;
  }


  public Timerange end(OffsetDateTime end) {
    
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public Timerange universalTime(Boolean universalTime) {
    
    this.universalTime = universalTime;
    return this;
  }

   /**
   * Get universalTime
   * @return universalTime
  **/
  @javax.annotation.Nullable
  public Boolean getUniversalTime() {
    return universalTime;
  }


  public void setUniversalTime(Boolean universalTime) {
    this.universalTime = universalTime;
  }


  public Timerange relativeTime(Boolean relativeTime) {
    
    this.relativeTime = relativeTime;
    return this;
  }

   /**
   * Get relativeTime
   * @return relativeTime
  **/
  @javax.annotation.Nullable
  public Boolean getRelativeTime() {
    return relativeTime;
  }


  public void setRelativeTime(Boolean relativeTime) {
    this.relativeTime = relativeTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timerange timerange = (Timerange) o;
    return Objects.equals(this.begin, timerange.begin) &&
        Objects.equals(this.end, timerange.end) &&
        Objects.equals(this.universalTime, timerange.universalTime) &&
        Objects.equals(this.relativeTime, timerange.relativeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(begin, end, universalTime, relativeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Timerange {\n");
    sb.append("    begin: ").append(toIndentedString(begin)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    universalTime: ").append(toIndentedString(universalTime)).append("\n");
    sb.append("    relativeTime: ").append(toIndentedString(relativeTime)).append("\n");
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
    openapiFields.add("begin");
    openapiFields.add("end");
    openapiFields.add("universalTime");
    openapiFields.add("relativeTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Timerange
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Timerange.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Timerange is not found in the empty JSON string", Timerange.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Timerange.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Timerange` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Timerange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Timerange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Timerange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Timerange.class));

       return (TypeAdapter<T>) new TypeAdapter<Timerange>() {
           @Override
           public void write(JsonWriter out, Timerange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Timerange read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Timerange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Timerange
  * @throws IOException if the JSON string is invalid with respect to Timerange
  */
  public static Timerange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Timerange.class);
  }

 /**
  * Convert an instance of Timerange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

