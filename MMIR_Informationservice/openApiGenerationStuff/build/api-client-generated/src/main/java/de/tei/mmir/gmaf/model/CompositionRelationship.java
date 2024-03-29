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
import de.tei.mmir.gmaf.model.Node;
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
 * CompositionRelationship
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:33:47.860262400+01:00[Europe/Berlin]")
public class CompositionRelationship {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_RELATED_OBJECT = "relatedObject";
  @SerializedName(SERIALIZED_NAME_RELATED_OBJECT)
  private Node relatedObject;

  public CompositionRelationship() {
  }

  public CompositionRelationship type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public CompositionRelationship relatedObject(Node relatedObject) {
    
    this.relatedObject = relatedObject;
    return this;
  }

   /**
   * Get relatedObject
   * @return relatedObject
  **/
  @javax.annotation.Nullable
  public Node getRelatedObject() {
    return relatedObject;
  }


  public void setRelatedObject(Node relatedObject) {
    this.relatedObject = relatedObject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompositionRelationship compositionRelationship = (CompositionRelationship) o;
    return Objects.equals(this.type, compositionRelationship.type) &&
        Objects.equals(this.relatedObject, compositionRelationship.relatedObject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, relatedObject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompositionRelationship {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relatedObject: ").append(toIndentedString(relatedObject)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("relatedObject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompositionRelationship
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CompositionRelationship.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompositionRelationship is not found in the empty JSON string", CompositionRelationship.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CompositionRelationship.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompositionRelationship` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `relatedObject`
      if (jsonObj.get("relatedObject") != null && !jsonObj.get("relatedObject").isJsonNull()) {
        Node.validateJsonObject(jsonObj.getAsJsonObject("relatedObject"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompositionRelationship.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompositionRelationship' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompositionRelationship> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompositionRelationship.class));

       return (TypeAdapter<T>) new TypeAdapter<CompositionRelationship>() {
           @Override
           public void write(JsonWriter out, CompositionRelationship value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompositionRelationship read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompositionRelationship given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompositionRelationship
  * @throws IOException if the JSON string is invalid with respect to CompositionRelationship
  */
  public static CompositionRelationship fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompositionRelationship.class);
  }

 /**
  * Convert an instance of CompositionRelationship to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

