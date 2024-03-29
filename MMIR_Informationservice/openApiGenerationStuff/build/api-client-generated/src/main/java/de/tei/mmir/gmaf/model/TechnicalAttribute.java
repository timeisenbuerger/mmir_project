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
import de.tei.mmir.gmaf.model.TechnicalAttributeDominantColorsInner;
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
 * TechnicalAttribute
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:33:47.860262400+01:00[Europe/Berlin]")
public class TechnicalAttribute {
  public static final String SERIALIZED_NAME_RELATIVE_X = "relative_x";
  @SerializedName(SERIALIZED_NAME_RELATIVE_X)
  private Integer relativeX;

  public static final String SERIALIZED_NAME_RELATIVE_Y = "relative_y";
  @SerializedName(SERIALIZED_NAME_RELATIVE_Y)
  private Integer relativeY;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_SHARPNESS = "sharpness";
  @SerializedName(SERIALIZED_NAME_SHARPNESS)
  private Float sharpness;

  public static final String SERIALIZED_NAME_BLURRYNESS = "blurryness";
  @SerializedName(SERIALIZED_NAME_BLURRYNESS)
  private Float blurryness;

  public static final String SERIALIZED_NAME_DOMINANT_COLORS = "dominantColors";
  @SerializedName(SERIALIZED_NAME_DOMINANT_COLORS)
  private List<TechnicalAttributeDominantColorsInner> dominantColors;

  public TechnicalAttribute() {
  }

  public TechnicalAttribute relativeX(Integer relativeX) {
    
    this.relativeX = relativeX;
    return this;
  }

   /**
   * Get relativeX
   * @return relativeX
  **/
  @javax.annotation.Nullable
  public Integer getRelativeX() {
    return relativeX;
  }


  public void setRelativeX(Integer relativeX) {
    this.relativeX = relativeX;
  }


  public TechnicalAttribute relativeY(Integer relativeY) {
    
    this.relativeY = relativeY;
    return this;
  }

   /**
   * Get relativeY
   * @return relativeY
  **/
  @javax.annotation.Nullable
  public Integer getRelativeY() {
    return relativeY;
  }


  public void setRelativeY(Integer relativeY) {
    this.relativeY = relativeY;
  }


  public TechnicalAttribute width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  public Integer getWidth() {
    return width;
  }


  public void setWidth(Integer width) {
    this.width = width;
  }


  public TechnicalAttribute height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  public Integer getHeight() {
    return height;
  }


  public void setHeight(Integer height) {
    this.height = height;
  }


  public TechnicalAttribute sharpness(Float sharpness) {
    
    this.sharpness = sharpness;
    return this;
  }

   /**
   * Get sharpness
   * @return sharpness
  **/
  @javax.annotation.Nullable
  public Float getSharpness() {
    return sharpness;
  }


  public void setSharpness(Float sharpness) {
    this.sharpness = sharpness;
  }


  public TechnicalAttribute blurryness(Float blurryness) {
    
    this.blurryness = blurryness;
    return this;
  }

   /**
   * Get blurryness
   * @return blurryness
  **/
  @javax.annotation.Nullable
  public Float getBlurryness() {
    return blurryness;
  }


  public void setBlurryness(Float blurryness) {
    this.blurryness = blurryness;
  }


  public TechnicalAttribute dominantColors(List<TechnicalAttributeDominantColorsInner> dominantColors) {
    
    this.dominantColors = dominantColors;
    return this;
  }

  public TechnicalAttribute addDominantColorsItem(TechnicalAttributeDominantColorsInner dominantColorsItem) {
    if (this.dominantColors == null) {
      this.dominantColors = new ArrayList<>();
    }
    this.dominantColors.add(dominantColorsItem);
    return this;
  }

   /**
   * Get dominantColors
   * @return dominantColors
  **/
  @javax.annotation.Nullable
  public List<TechnicalAttributeDominantColorsInner> getDominantColors() {
    return dominantColors;
  }


  public void setDominantColors(List<TechnicalAttributeDominantColorsInner> dominantColors) {
    this.dominantColors = dominantColors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TechnicalAttribute technicalAttribute = (TechnicalAttribute) o;
    return Objects.equals(this.relativeX, technicalAttribute.relativeX) &&
        Objects.equals(this.relativeY, technicalAttribute.relativeY) &&
        Objects.equals(this.width, technicalAttribute.width) &&
        Objects.equals(this.height, technicalAttribute.height) &&
        Objects.equals(this.sharpness, technicalAttribute.sharpness) &&
        Objects.equals(this.blurryness, technicalAttribute.blurryness) &&
        Objects.equals(this.dominantColors, technicalAttribute.dominantColors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relativeX, relativeY, width, height, sharpness, blurryness, dominantColors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalAttribute {\n");
    sb.append("    relativeX: ").append(toIndentedString(relativeX)).append("\n");
    sb.append("    relativeY: ").append(toIndentedString(relativeY)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    sharpness: ").append(toIndentedString(sharpness)).append("\n");
    sb.append("    blurryness: ").append(toIndentedString(blurryness)).append("\n");
    sb.append("    dominantColors: ").append(toIndentedString(dominantColors)).append("\n");
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
    openapiFields.add("relative_x");
    openapiFields.add("relative_y");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("sharpness");
    openapiFields.add("blurryness");
    openapiFields.add("dominantColors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TechnicalAttribute
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TechnicalAttribute.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TechnicalAttribute is not found in the empty JSON string", TechnicalAttribute.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TechnicalAttribute.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TechnicalAttribute` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("dominantColors") != null && !jsonObj.get("dominantColors").isJsonNull()) {
        JsonArray jsonArraydominantColors = jsonObj.getAsJsonArray("dominantColors");
        if (jsonArraydominantColors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dominantColors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dominantColors` to be an array in the JSON string but got `%s`", jsonObj.get("dominantColors").toString()));
          }

          // validate the optional field `dominantColors` (array)
          for (int i = 0; i < jsonArraydominantColors.size(); i++) {
            TechnicalAttributeDominantColorsInner.validateJsonObject(jsonArraydominantColors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TechnicalAttribute.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TechnicalAttribute' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TechnicalAttribute> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TechnicalAttribute.class));

       return (TypeAdapter<T>) new TypeAdapter<TechnicalAttribute>() {
           @Override
           public void write(JsonWriter out, TechnicalAttribute value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TechnicalAttribute read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TechnicalAttribute given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TechnicalAttribute
  * @throws IOException if the JSON string is invalid with respect to TechnicalAttribute
  */
  public static TechnicalAttribute fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TechnicalAttribute.class);
  }

 /**
  * Convert an instance of TechnicalAttribute to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

