/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.HashHashType;
import java.io.IOException;

/**
 * Container message for hash values.
 */
@ApiModel(description = "Container message for hash values.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class ProvenanceHash {
  @SerializedName("type")
  private HashHashType type = null;

  @SerializedName("value")
  private byte[] value = null;

  public ProvenanceHash type(HashHashType type) {
    this.type = type;
    return this;
  }

   /**
   * Required. The type of hash that was performed.
   * @return type
  **/
  @ApiModelProperty(value = "Required. The type of hash that was performed.")
  public HashHashType getType() {
    return type;
  }

  public void setType(HashHashType type) {
    this.type = type;
  }

  public ProvenanceHash value(byte[] value) {
    this.value = value;
    return this;
  }

   /**
   * Required. The hash value.
   * @return value
  **/
  @ApiModelProperty(value = "Required. The hash value.")
  public byte[] getValue() {
    return value;
  }

  public void setValue(byte[] value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceHash provenanceHash = (ProvenanceHash) o;
    return Objects.equals(this.type, provenanceHash.type) &&
        Arrays.equals(this.value, provenanceHash.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, Arrays.hashCode(value));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceHash {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

