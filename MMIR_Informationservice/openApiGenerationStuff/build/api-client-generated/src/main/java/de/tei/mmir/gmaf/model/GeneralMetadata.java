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
import java.io.File;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

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
import de.tei.mmir.gmaf.util.UnixTimestampAdapter;

/**
 * GeneralMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:33:47.860262400+01:00[Europe/Berlin]")
public class GeneralMetadata {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Long longitude;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Long latitude;

  public static final String SERIALIZED_NAME_CAMERA_MODEL = "cameraModel";
  @SerializedName(SERIALIZED_NAME_CAMERA_MODEL)
  private String cameraModel;

  public static final String SERIALIZED_NAME_LENS_MODEL = "lensModel";
  @SerializedName(SERIALIZED_NAME_LENS_MODEL)
  private String lensModel;

  public static final String SERIALIZED_NAME_APERTURE = "aperture";
  @SerializedName(SERIALIZED_NAME_APERTURE)
  private Float aperture;

  public static final String SERIALIZED_NAME_EXPOSURE = "exposure";
  @SerializedName(SERIALIZED_NAME_EXPOSURE)
  private Float exposure;

  public static final String SERIALIZED_NAME_CITY_NEAR_BY = "cityNearBy";
  @SerializedName(SERIALIZED_NAME_CITY_NEAR_BY)
  private String cityNearBy;

  public static final String SERIALIZED_NAME_FOCAL_LENGTH = "focalLength";
  @SerializedName(SERIALIZED_NAME_FOCAL_LENGTH)
  private Long focalLength;

  public static final String SERIALIZED_NAME_RESOLUTION = "resolution";
  @SerializedName(SERIALIZED_NAME_RESOLUTION)
  private Integer resolution;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Integer height;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  @JsonAdapter(UnixTimestampAdapter.class)
  private OffsetDateTime date;

  public static final String SERIALIZED_NAME_FILE_SIZE = "fileSize";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Long fileSize;

  public static final String SERIALIZED_NAME_ISO = "iso";
  @SerializedName(SERIALIZED_NAME_ISO)
  private Integer iso;

  public static final String SERIALIZED_NAME_SHUTTER_SPEED = "shutterSpeed";
  @SerializedName(SERIALIZED_NAME_SHUTTER_SPEED)
  private Long shutterSpeed;

  public static final String SERIALIZED_NAME_FILE_NAME = "fileName";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName;

  public static final String SERIALIZED_NAME_FILE_REFERENCE = "fileReference";
  @SerializedName(SERIALIZED_NAME_FILE_REFERENCE)
  private String fileReference;

  public static final String SERIALIZED_NAME_PREVIEW_URL = "previewUrl";
  @SerializedName(SERIALIZED_NAME_PREVIEW_URL)
  private String previewUrl;

  public static final String SERIALIZED_NAME_SOURCE_SYSTEM = "sourceSystem";
  @SerializedName(SERIALIZED_NAME_SOURCE_SYSTEM)
  private UUID sourceSystem;

  public GeneralMetadata() {
  }

  public GeneralMetadata id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public GeneralMetadata longitude(Long longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @javax.annotation.Nullable
  public Long getLongitude() {
    return longitude;
  }


  public void setLongitude(Long longitude) {
    this.longitude = longitude;
  }


  public GeneralMetadata latitude(Long latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @javax.annotation.Nullable
  public Long getLatitude() {
    return latitude;
  }


  public void setLatitude(Long latitude) {
    this.latitude = latitude;
  }


  public GeneralMetadata cameraModel(String cameraModel) {
    
    this.cameraModel = cameraModel;
    return this;
  }

   /**
   * Get cameraModel
   * @return cameraModel
  **/
  @javax.annotation.Nullable
  public String getCameraModel() {
    return cameraModel;
  }


  public void setCameraModel(String cameraModel) {
    this.cameraModel = cameraModel;
  }


  public GeneralMetadata lensModel(String lensModel) {
    
    this.lensModel = lensModel;
    return this;
  }

   /**
   * Get lensModel
   * @return lensModel
  **/
  @javax.annotation.Nullable
  public String getLensModel() {
    return lensModel;
  }


  public void setLensModel(String lensModel) {
    this.lensModel = lensModel;
  }


  public GeneralMetadata aperture(Float aperture) {
    
    this.aperture = aperture;
    return this;
  }

   /**
   * Get aperture
   * @return aperture
  **/
  @javax.annotation.Nullable
  public Float getAperture() {
    return aperture;
  }


  public void setAperture(Float aperture) {
    this.aperture = aperture;
  }


  public GeneralMetadata exposure(Float exposure) {
    
    this.exposure = exposure;
    return this;
  }

   /**
   * Get exposure
   * @return exposure
  **/
  @javax.annotation.Nullable
  public Float getExposure() {
    return exposure;
  }


  public void setExposure(Float exposure) {
    this.exposure = exposure;
  }


  public GeneralMetadata cityNearBy(String cityNearBy) {
    
    this.cityNearBy = cityNearBy;
    return this;
  }

   /**
   * Get cityNearBy
   * @return cityNearBy
  **/
  @javax.annotation.Nullable
  public String getCityNearBy() {
    return cityNearBy;
  }


  public void setCityNearBy(String cityNearBy) {
    this.cityNearBy = cityNearBy;
  }


  public GeneralMetadata focalLength(Long focalLength) {
    
    this.focalLength = focalLength;
    return this;
  }

   /**
   * Get focalLength
   * @return focalLength
  **/
  @javax.annotation.Nullable
  public Long getFocalLength() {
    return focalLength;
  }


  public void setFocalLength(Long focalLength) {
    this.focalLength = focalLength;
  }


  public GeneralMetadata resolution(Integer resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @javax.annotation.Nullable
  public Integer getResolution() {
    return resolution;
  }


  public void setResolution(Integer resolution) {
    this.resolution = resolution;
  }


  public GeneralMetadata width(Integer width) {
    
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


  public GeneralMetadata height(Integer height) {
    
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


  public GeneralMetadata date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public GeneralMetadata fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * Get fileSize
   * @return fileSize
  **/
  @javax.annotation.Nullable
  public Long getFileSize() {
    return fileSize;
  }


  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public GeneralMetadata iso(Integer iso) {
    
    this.iso = iso;
    return this;
  }

   /**
   * Get iso
   * @return iso
  **/
  @javax.annotation.Nullable
  public Integer getIso() {
    return iso;
  }


  public void setIso(Integer iso) {
    this.iso = iso;
  }


  public GeneralMetadata shutterSpeed(Long shutterSpeed) {
    
    this.shutterSpeed = shutterSpeed;
    return this;
  }

   /**
   * Get shutterSpeed
   * @return shutterSpeed
  **/
  @javax.annotation.Nullable
  public Long getShutterSpeed() {
    return shutterSpeed;
  }


  public void setShutterSpeed(Long shutterSpeed) {
    this.shutterSpeed = shutterSpeed;
  }


  public GeneralMetadata fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public GeneralMetadata fileReference(String fileReference) {
    
    this.fileReference = fileReference;
    return this;
  }

   /**
   * Get fileReference
   * @return fileReference
  **/
  @javax.annotation.Nullable
  public String getFileReference() {
    return fileReference;
  }


  public void setFileReference(String fileReference) {
    this.fileReference = fileReference;
  }


  public GeneralMetadata previewUrl(String previewUrl) {
    
    this.previewUrl = previewUrl;
    return this;
  }

   /**
   * Get previewUrl
   * @return previewUrl
  **/
  @javax.annotation.Nullable
  public String getPreviewUrl() {
    return previewUrl;
  }


  public void setPreviewUrl(String previewUrl) {
    this.previewUrl = previewUrl;
  }


  public GeneralMetadata sourceSystem(UUID sourceSystem) {
    
    this.sourceSystem = sourceSystem;
    return this;
  }

   /**
   * Get sourceSystem
   * @return sourceSystem
  **/
  @javax.annotation.Nullable
  public UUID getSourceSystem() {
    return sourceSystem;
  }


  public void setSourceSystem(UUID sourceSystem) {
    this.sourceSystem = sourceSystem;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMetadata generalMetadata = (GeneralMetadata) o;
    return Objects.equals(this.id, generalMetadata.id) &&
        Objects.equals(this.longitude, generalMetadata.longitude) &&
        Objects.equals(this.latitude, generalMetadata.latitude) &&
        Objects.equals(this.cameraModel, generalMetadata.cameraModel) &&
        Objects.equals(this.lensModel, generalMetadata.lensModel) &&
        Objects.equals(this.aperture, generalMetadata.aperture) &&
        Objects.equals(this.exposure, generalMetadata.exposure) &&
        Objects.equals(this.cityNearBy, generalMetadata.cityNearBy) &&
        Objects.equals(this.focalLength, generalMetadata.focalLength) &&
        Objects.equals(this.resolution, generalMetadata.resolution) &&
        Objects.equals(this.width, generalMetadata.width) &&
        Objects.equals(this.height, generalMetadata.height) &&
        Objects.equals(this.date, generalMetadata.date) &&
        Objects.equals(this.fileSize, generalMetadata.fileSize) &&
        Objects.equals(this.iso, generalMetadata.iso) &&
        Objects.equals(this.shutterSpeed, generalMetadata.shutterSpeed) &&
        Objects.equals(this.fileName, generalMetadata.fileName) &&
        Objects.equals(this.fileReference, generalMetadata.fileReference) &&
        Objects.equals(this.previewUrl, generalMetadata.previewUrl) &&
        Objects.equals(this.sourceSystem, generalMetadata.sourceSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, longitude, latitude, cameraModel, lensModel, aperture, exposure, cityNearBy, focalLength, resolution, width, height, date, fileSize, iso, shutterSpeed, fileName, fileReference, previewUrl, sourceSystem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    cameraModel: ").append(toIndentedString(cameraModel)).append("\n");
    sb.append("    lensModel: ").append(toIndentedString(lensModel)).append("\n");
    sb.append("    aperture: ").append(toIndentedString(aperture)).append("\n");
    sb.append("    exposure: ").append(toIndentedString(exposure)).append("\n");
    sb.append("    cityNearBy: ").append(toIndentedString(cityNearBy)).append("\n");
    sb.append("    focalLength: ").append(toIndentedString(focalLength)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    iso: ").append(toIndentedString(iso)).append("\n");
    sb.append("    shutterSpeed: ").append(toIndentedString(shutterSpeed)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileReference: ").append(toIndentedString(fileReference)).append("\n");
    sb.append("    previewUrl: ").append(toIndentedString(previewUrl)).append("\n");
    sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
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
    openapiFields.add("longitude");
    openapiFields.add("latitude");
    openapiFields.add("cameraModel");
    openapiFields.add("lensModel");
    openapiFields.add("aperture");
    openapiFields.add("exposure");
    openapiFields.add("cityNearBy");
    openapiFields.add("focalLength");
    openapiFields.add("resolution");
    openapiFields.add("width");
    openapiFields.add("height");
    openapiFields.add("date");
    openapiFields.add("fileSize");
    openapiFields.add("iso");
    openapiFields.add("shutterSpeed");
    openapiFields.add("fileName");
    openapiFields.add("fileReference");
    openapiFields.add("previewUrl");
    openapiFields.add("sourceSystem");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GeneralMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GeneralMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GeneralMetadata is not found in the empty JSON string", GeneralMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GeneralMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GeneralMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("cameraModel") != null && !jsonObj.get("cameraModel").isJsonNull()) && !jsonObj.get("cameraModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cameraModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cameraModel").toString()));
      }
      if ((jsonObj.get("lensModel") != null && !jsonObj.get("lensModel").isJsonNull()) && !jsonObj.get("lensModel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lensModel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lensModel").toString()));
      }
      if ((jsonObj.get("cityNearBy") != null && !jsonObj.get("cityNearBy").isJsonNull()) && !jsonObj.get("cityNearBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cityNearBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cityNearBy").toString()));
      }
      if ((jsonObj.get("fileName") != null && !jsonObj.get("fileName").isJsonNull()) && !jsonObj.get("fileName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileName").toString()));
      }
      if ((jsonObj.get("previewUrl") != null && !jsonObj.get("previewUrl").isJsonNull()) && !jsonObj.get("previewUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previewUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previewUrl").toString()));
      }
      if ((jsonObj.get("sourceSystem") != null && !jsonObj.get("sourceSystem").isJsonNull()) && !jsonObj.get("sourceSystem").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceSystem` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceSystem").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GeneralMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GeneralMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GeneralMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GeneralMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<GeneralMetadata>() {
           @Override
           public void write(JsonWriter out, GeneralMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GeneralMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GeneralMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GeneralMetadata
  * @throws IOException if the JSON string is invalid with respect to GeneralMetadata
  */
  public static GeneralMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GeneralMetadata.class);
  }

 /**
  * Convert an instance of GeneralMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
