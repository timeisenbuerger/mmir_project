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
import java.util.ArrayList;
import java.util.List;

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
 * GMAF
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T18:14:15.712829700+01:00[Europe/Berlin]")
public class GMAF {
  public static final String SERIALIZED_NAME_PROCESSING_PLUGINS = "processingPlugins";
  @SerializedName(SERIALIZED_NAME_PROCESSING_PLUGINS)
  private List<String> processingPlugins;

  public static final String SERIALIZED_NAME_PLUGINS = "plugins";
  @SerializedName(SERIALIZED_NAME_PLUGINS)
  private List<String> plugins;

  public GMAF() {
  }

  public GMAF processingPlugins(List<String> processingPlugins) {
    
    this.processingPlugins = processingPlugins;
    return this;
  }

  public GMAF addProcessingPluginsItem(String processingPluginsItem) {
    if (this.processingPlugins == null) {
      this.processingPlugins = new ArrayList<>();
    }
    this.processingPlugins.add(processingPluginsItem);
    return this;
  }

   /**
   * Get processingPlugins
   * @return processingPlugins
  **/
  @javax.annotation.Nullable
  public List<String> getProcessingPlugins() {
    return processingPlugins;
  }


  public void setProcessingPlugins(List<String> processingPlugins) {
    this.processingPlugins = processingPlugins;
  }


  public GMAF plugins(List<String> plugins) {
    
    this.plugins = plugins;
    return this;
  }

  public GMAF addPluginsItem(String pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  @javax.annotation.Nullable
  public List<String> getPlugins() {
    return plugins;
  }


  public void setPlugins(List<String> plugins) {
    this.plugins = plugins;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GMAF GMAF = (GMAF) o;
    return Objects.equals(this.processingPlugins, GMAF.processingPlugins) &&
        Objects.equals(this.plugins, GMAF.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processingPlugins, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GMAF {\n");
    sb.append("    processingPlugins: ").append(toIndentedString(processingPlugins)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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
    openapiFields.add("processingPlugins");
    openapiFields.add("plugins");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GMAF
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GMAF.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GMAF is not found in the empty JSON string", GMAF.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GMAF.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GMAF` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("processingPlugins") != null && !jsonObj.get("processingPlugins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `processingPlugins` to be an array in the JSON string but got `%s`", jsonObj.get("processingPlugins").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("plugins") != null && !jsonObj.get("plugins").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugins` to be an array in the JSON string but got `%s`", jsonObj.get("plugins").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GMAF.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GMAF' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GMAF> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GMAF.class));

       return (TypeAdapter<T>) new TypeAdapter<GMAF>() {
           @Override
           public void write(JsonWriter out, GMAF value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GMAF read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GMAF given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GMAF
  * @throws IOException if the JSON string is invalid with respect to GMAF
  */
  public static GMAF fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GMAF.class);
  }

 /**
  * Convert an instance of GMAF to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
