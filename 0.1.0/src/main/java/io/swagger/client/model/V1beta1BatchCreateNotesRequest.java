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
import io.swagger.client.model.V1beta1Note;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Request to create notes in batch.
 */
@ApiModel(description = "Request to create notes in batch.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class V1beta1BatchCreateNotesRequest {
  @SerializedName("parent")
  private String parent = null;

  @SerializedName("notes")
  private Map<String, V1beta1Note> notes = null;

  public V1beta1BatchCreateNotesRequest parent(String parent) {
    this.parent = parent;
    return this;
  }

   /**
   * The name of the project in the form of &#x60;projects/[PROJECT_ID]&#x60;, under which the notes are to be created.
   * @return parent
  **/
  @ApiModelProperty(value = "The name of the project in the form of `projects/[PROJECT_ID]`, under which the notes are to be created.")
  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public V1beta1BatchCreateNotesRequest notes(Map<String, V1beta1Note> notes) {
    this.notes = notes;
    return this;
  }

  public V1beta1BatchCreateNotesRequest putNotesItem(String key, V1beta1Note notesItem) {
    if (this.notes == null) {
      this.notes = new HashMap<String, V1beta1Note>();
    }
    this.notes.put(key, notesItem);
    return this;
  }

   /**
   * The notes to create. Max allowed length is 1000.
   * @return notes
  **/
  @ApiModelProperty(value = "The notes to create. Max allowed length is 1000.")
  public Map<String, V1beta1Note> getNotes() {
    return notes;
  }

  public void setNotes(Map<String, V1beta1Note> notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1BatchCreateNotesRequest v1beta1BatchCreateNotesRequest = (V1beta1BatchCreateNotesRequest) o;
    return Objects.equals(this.parent, v1beta1BatchCreateNotesRequest.parent) &&
        Objects.equals(this.notes, v1beta1BatchCreateNotesRequest.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1BatchCreateNotesRequest {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

