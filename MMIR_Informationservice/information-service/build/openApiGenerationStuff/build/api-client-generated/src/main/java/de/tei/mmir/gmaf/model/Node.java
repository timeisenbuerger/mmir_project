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
import de.tei.mmir.gmaf.model.AssetLink;
import de.tei.mmir.gmaf.model.CompositionRelationship;
import de.tei.mmir.gmaf.model.MMFG;
import de.tei.mmir.gmaf.model.SemanticRelationship;
import de.tei.mmir.gmaf.model.TechnicalAttribute;
import de.tei.mmir.gmaf.model.Timerange;
import de.tei.mmir.gmaf.model.Weight;
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
 * Node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-12-16T22:33:47.860262400+01:00[Europe/Berlin]")
public class Node {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CHILD_NODES = "childNodes";
  @SerializedName(SERIALIZED_NAME_CHILD_NODES)
  private List<Node> childNodes;

  public static final String SERIALIZED_NAME_WEIGHTS = "weights";
  @SerializedName(SERIALIZED_NAME_WEIGHTS)
  private List<Weight> weights;

  public static final String SERIALIZED_NAME_TECHNICAL_ATTRIBUTES = "technicalAttributes";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_ATTRIBUTES)
  private List<TechnicalAttribute> technicalAttributes;

  public static final String SERIALIZED_NAME_SEMANTIC_RELATIONSHIPS = "semanticRelationships";
  @SerializedName(SERIALIZED_NAME_SEMANTIC_RELATIONSHIPS)
  private List<SemanticRelationship> semanticRelationships;

  public static final String SERIALIZED_NAME_COMPOSITION_RELATIONSHIPS = "compositionRelationships";
  @SerializedName(SERIALIZED_NAME_COMPOSITION_RELATIONSHIPS)
  private List<CompositionRelationship> compositionRelationships;

  public static final String SERIALIZED_NAME_ASSET_LINKS = "assetLinks";
  @SerializedName(SERIALIZED_NAME_ASSET_LINKS)
  private List<AssetLink> assetLinks;

  public static final String SERIALIZED_NAME_DETECTED_BY = "detectedBy";
  @SerializedName(SERIALIZED_NAME_DETECTED_BY)
  private String detectedBy;

  public static final String SERIALIZED_NAME_TIMERANGE = "timerange";
  @SerializedName(SERIALIZED_NAME_TIMERANGE)
  private Timerange timerange;

  public static final String SERIALIZED_NAME_FEATURE_VECTOR = "featureVector";
  @SerializedName(SERIALIZED_NAME_FEATURE_VECTOR)
  private MMFG featureVector;

  public Node() {
  }

  public Node name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Node childNodes(List<Node> childNodes) {
    
    this.childNodes = childNodes;
    return this;
  }

  public Node addChildNodesItem(Node childNodesItem) {
    if (this.childNodes == null) {
      this.childNodes = new ArrayList<>();
    }
    this.childNodes.add(childNodesItem);
    return this;
  }

   /**
   * Get childNodes
   * @return childNodes
  **/
  @javax.annotation.Nullable
  public List<Node> getChildNodes() {
    return childNodes;
  }


  public void setChildNodes(List<Node> childNodes) {
    this.childNodes = childNodes;
  }


  public Node weights(List<Weight> weights) {
    
    this.weights = weights;
    return this;
  }

  public Node addWeightsItem(Weight weightsItem) {
    if (this.weights == null) {
      this.weights = new ArrayList<>();
    }
    this.weights.add(weightsItem);
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @javax.annotation.Nullable
  public List<Weight> getWeights() {
    return weights;
  }


  public void setWeights(List<Weight> weights) {
    this.weights = weights;
  }


  public Node technicalAttributes(List<TechnicalAttribute> technicalAttributes) {
    
    this.technicalAttributes = technicalAttributes;
    return this;
  }

  public Node addTechnicalAttributesItem(TechnicalAttribute technicalAttributesItem) {
    if (this.technicalAttributes == null) {
      this.technicalAttributes = new ArrayList<>();
    }
    this.technicalAttributes.add(technicalAttributesItem);
    return this;
  }

   /**
   * Get technicalAttributes
   * @return technicalAttributes
  **/
  @javax.annotation.Nullable
  public List<TechnicalAttribute> getTechnicalAttributes() {
    return technicalAttributes;
  }


  public void setTechnicalAttributes(List<TechnicalAttribute> technicalAttributes) {
    this.technicalAttributes = technicalAttributes;
  }


  public Node semanticRelationships(List<SemanticRelationship> semanticRelationships) {
    
    this.semanticRelationships = semanticRelationships;
    return this;
  }

  public Node addSemanticRelationshipsItem(SemanticRelationship semanticRelationshipsItem) {
    if (this.semanticRelationships == null) {
      this.semanticRelationships = new ArrayList<>();
    }
    this.semanticRelationships.add(semanticRelationshipsItem);
    return this;
  }

   /**
   * Get semanticRelationships
   * @return semanticRelationships
  **/
  @javax.annotation.Nullable
  public List<SemanticRelationship> getSemanticRelationships() {
    return semanticRelationships;
  }


  public void setSemanticRelationships(List<SemanticRelationship> semanticRelationships) {
    this.semanticRelationships = semanticRelationships;
  }


  public Node compositionRelationships(List<CompositionRelationship> compositionRelationships) {
    
    this.compositionRelationships = compositionRelationships;
    return this;
  }

  public Node addCompositionRelationshipsItem(CompositionRelationship compositionRelationshipsItem) {
    if (this.compositionRelationships == null) {
      this.compositionRelationships = new ArrayList<>();
    }
    this.compositionRelationships.add(compositionRelationshipsItem);
    return this;
  }

   /**
   * Get compositionRelationships
   * @return compositionRelationships
  **/
  @javax.annotation.Nullable
  public List<CompositionRelationship> getCompositionRelationships() {
    return compositionRelationships;
  }


  public void setCompositionRelationships(List<CompositionRelationship> compositionRelationships) {
    this.compositionRelationships = compositionRelationships;
  }


  public Node assetLinks(List<AssetLink> assetLinks) {
    
    this.assetLinks = assetLinks;
    return this;
  }

  public Node addAssetLinksItem(AssetLink assetLinksItem) {
    if (this.assetLinks == null) {
      this.assetLinks = new ArrayList<>();
    }
    this.assetLinks.add(assetLinksItem);
    return this;
  }

   /**
   * Get assetLinks
   * @return assetLinks
  **/
  @javax.annotation.Nullable
  public List<AssetLink> getAssetLinks() {
    return assetLinks;
  }


  public void setAssetLinks(List<AssetLink> assetLinks) {
    this.assetLinks = assetLinks;
  }


  public Node detectedBy(String detectedBy) {
    
    this.detectedBy = detectedBy;
    return this;
  }

   /**
   * Get detectedBy
   * @return detectedBy
  **/
  @javax.annotation.Nullable
  public String getDetectedBy() {
    return detectedBy;
  }


  public void setDetectedBy(String detectedBy) {
    this.detectedBy = detectedBy;
  }


  public Node timerange(Timerange timerange) {
    
    this.timerange = timerange;
    return this;
  }

   /**
   * Get timerange
   * @return timerange
  **/
  @javax.annotation.Nullable
  public Timerange getTimerange() {
    return timerange;
  }


  public void setTimerange(Timerange timerange) {
    this.timerange = timerange;
  }


  public Node featureVector(MMFG featureVector) {
    
    this.featureVector = featureVector;
    return this;
  }

   /**
   * Get featureVector
   * @return featureVector
  **/
  @javax.annotation.Nullable
  public MMFG getFeatureVector() {
    return featureVector;
  }


  public void setFeatureVector(MMFG featureVector) {
    this.featureVector = featureVector;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.name, node.name) &&
        Objects.equals(this.childNodes, node.childNodes) &&
        Objects.equals(this.weights, node.weights) &&
        Objects.equals(this.technicalAttributes, node.technicalAttributes) &&
        Objects.equals(this.semanticRelationships, node.semanticRelationships) &&
        Objects.equals(this.compositionRelationships, node.compositionRelationships) &&
        Objects.equals(this.assetLinks, node.assetLinks) &&
        Objects.equals(this.detectedBy, node.detectedBy) &&
        Objects.equals(this.timerange, node.timerange) &&
        Objects.equals(this.featureVector, node.featureVector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, childNodes, weights, technicalAttributes, semanticRelationships, compositionRelationships, assetLinks, detectedBy, timerange, featureVector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
    sb.append("    technicalAttributes: ").append(toIndentedString(technicalAttributes)).append("\n");
    sb.append("    semanticRelationships: ").append(toIndentedString(semanticRelationships)).append("\n");
    sb.append("    compositionRelationships: ").append(toIndentedString(compositionRelationships)).append("\n");
    sb.append("    assetLinks: ").append(toIndentedString(assetLinks)).append("\n");
    sb.append("    detectedBy: ").append(toIndentedString(detectedBy)).append("\n");
    sb.append("    timerange: ").append(toIndentedString(timerange)).append("\n");
    sb.append("    featureVector: ").append(toIndentedString(featureVector)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("childNodes");
    openapiFields.add("weights");
    openapiFields.add("technicalAttributes");
    openapiFields.add("semanticRelationships");
    openapiFields.add("compositionRelationships");
    openapiFields.add("assetLinks");
    openapiFields.add("detectedBy");
    openapiFields.add("timerange");
    openapiFields.add("featureVector");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Node
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Node.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Node is not found in the empty JSON string", Node.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Node.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Node` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("childNodes") != null && !jsonObj.get("childNodes").isJsonNull()) {
        JsonArray jsonArraychildNodes = jsonObj.getAsJsonArray("childNodes");
        if (jsonArraychildNodes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("childNodes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `childNodes` to be an array in the JSON string but got `%s`", jsonObj.get("childNodes").toString()));
          }

          // validate the optional field `childNodes` (array)
          for (int i = 0; i < jsonArraychildNodes.size(); i++) {
            Node.validateJsonObject(jsonArraychildNodes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("weights") != null && !jsonObj.get("weights").isJsonNull()) {
        JsonArray jsonArrayweights = jsonObj.getAsJsonArray("weights");
        if (jsonArrayweights != null) {
          // ensure the json data is an array
          if (!jsonObj.get("weights").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `weights` to be an array in the JSON string but got `%s`", jsonObj.get("weights").toString()));
          }

          // validate the optional field `weights` (array)
          for (int i = 0; i < jsonArrayweights.size(); i++) {
            Weight.validateJsonObject(jsonArrayweights.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("technicalAttributes") != null && !jsonObj.get("technicalAttributes").isJsonNull()) {
        JsonArray jsonArraytechnicalAttributes = jsonObj.getAsJsonArray("technicalAttributes");
        if (jsonArraytechnicalAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("technicalAttributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `technicalAttributes` to be an array in the JSON string but got `%s`", jsonObj.get("technicalAttributes").toString()));
          }

          // validate the optional field `technicalAttributes` (array)
          for (int i = 0; i < jsonArraytechnicalAttributes.size(); i++) {
            TechnicalAttribute.validateJsonObject(jsonArraytechnicalAttributes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("semanticRelationships") != null && !jsonObj.get("semanticRelationships").isJsonNull()) {
        JsonArray jsonArraysemanticRelationships = jsonObj.getAsJsonArray("semanticRelationships");
        if (jsonArraysemanticRelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("semanticRelationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `semanticRelationships` to be an array in the JSON string but got `%s`", jsonObj.get("semanticRelationships").toString()));
          }

          // validate the optional field `semanticRelationships` (array)
          for (int i = 0; i < jsonArraysemanticRelationships.size(); i++) {
            SemanticRelationship.validateJsonObject(jsonArraysemanticRelationships.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("compositionRelationships") != null && !jsonObj.get("compositionRelationships").isJsonNull()) {
        JsonArray jsonArraycompositionRelationships = jsonObj.getAsJsonArray("compositionRelationships");
        if (jsonArraycompositionRelationships != null) {
          // ensure the json data is an array
          if (!jsonObj.get("compositionRelationships").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `compositionRelationships` to be an array in the JSON string but got `%s`", jsonObj.get("compositionRelationships").toString()));
          }

          // validate the optional field `compositionRelationships` (array)
          for (int i = 0; i < jsonArraycompositionRelationships.size(); i++) {
            CompositionRelationship.validateJsonObject(jsonArraycompositionRelationships.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("assetLinks") != null && !jsonObj.get("assetLinks").isJsonNull()) {
        JsonArray jsonArrayassetLinks = jsonObj.getAsJsonArray("assetLinks");
        if (jsonArrayassetLinks != null) {
          // ensure the json data is an array
          if (!jsonObj.get("assetLinks").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `assetLinks` to be an array in the JSON string but got `%s`", jsonObj.get("assetLinks").toString()));
          }

          // validate the optional field `assetLinks` (array)
          for (int i = 0; i < jsonArrayassetLinks.size(); i++) {
            AssetLink.validateJsonObject(jsonArrayassetLinks.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("detectedBy") != null && !jsonObj.get("detectedBy").isJsonNull()) && !jsonObj.get("detectedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detectedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detectedBy").toString()));
      }
      // validate the optional field `timerange`
      if (jsonObj.get("timerange") != null && !jsonObj.get("timerange").isJsonNull()) {
        Timerange.validateJsonObject(jsonObj.getAsJsonObject("timerange"));
      }
      // validate the optional field `featureVector`
      if (jsonObj.get("featureVector") != null && !jsonObj.get("featureVector").isJsonNull()) {
        MMFG.validateJsonObject(jsonObj.getAsJsonObject("featureVector"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Node.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Node' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Node> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Node.class));

       return (TypeAdapter<T>) new TypeAdapter<Node>() {
           @Override
           public void write(JsonWriter out, Node value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Node read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Node given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Node
  * @throws IOException if the JSON string is invalid with respect to Node
  */
  public static Node fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Node.class);
  }

 /**
  * Convert an instance of Node to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

