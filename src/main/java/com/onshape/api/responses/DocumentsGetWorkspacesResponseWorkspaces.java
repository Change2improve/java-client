// The MIT License (MIT)
//
// Copyright (c) 2018 - Present Onshape Inc. 
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// SOFTWARE.
//
package com.onshape.api.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Date;

/**
 * Object used in calls to getWorkspaces API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetWorkspacesResponseWorkspaces {
  /**
   * Whether workspace can be deleted
   */
  @JsonProperty("canDelete")
  public Boolean canDelete;

  /**
   * Whether workspace is read-only
   */
  @JsonProperty("isReadOnly")
  public Boolean isReadOnly;

  /**
   * ID of workspace&#39;s parent version
   */
  @JsonProperty("parent")
  public String parent;

  /**
   * Type of record
   */
  @JsonProperty("type")
  public String type;

  /**
   * User information for the creator of the workspace
   */
  @JsonProperty("creator")
  public DocumentsGetWorkspacesResponseWorkspacesCreator creator;

  /**
   * User-provided description of workspace
   */
  @JsonProperty("description")
  public String description;

  /**
   * Document microversion ID that is the root of the workspace branch
   */
  @JsonProperty("microversion")
  public String microversion;

  /**
   * Creation date
   */
  @JsonProperty("createdAt")
  public Date createdAt;

  /**
   * Last modification date
   */
  @JsonProperty("modifiedAt")
  public Date modifiedAt;

  /**
   * User information for the latest modifier of the workspace
   */
  @JsonProperty("lastModifier")
  public DocumentsGetWorkspacesResponseWorkspacesLastModifier lastModifier;

  /**
   * name of workspace
   */
  @JsonProperty("name")
  public String name;

  /**
   * ID of workspace
   */
  @JsonProperty("id")
  public String id;

  /**
   * Get Whether workspace can be deleted
   *
   * @return Whether workspace can be deleted
   *
   */
  public final Boolean getCanDelete() {
    return this.canDelete;
  }

  /**
   * Get Whether workspace is read-only
   *
   * @return Whether workspace is read-only
   *
   */
  public final Boolean getIsReadOnly() {
    return this.isReadOnly;
  }

  /**
   * Get ID of workspace&#39;s parent version
   *
   * @return ID of workspace&#39;s parent version
   *
   */
  public final String getParent() {
    return this.parent;
  }

  /**
   * Get Type of record
   *
   * @return Type of record
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get User information for the creator of the workspace
   *
   * @return User information for the creator of the workspace
   *
   */
  public final DocumentsGetWorkspacesResponseWorkspacesCreator getCreator() {
    return this.creator;
  }

  /**
   * Get User-provided description of workspace
   *
   * @return User-provided description of workspace
   *
   */
  public final String getDescription() {
    return this.description;
  }

  /**
   * Get Document microversion ID that is the root of the workspace branch
   *
   * @return Document microversion ID that is the root of the workspace branch
   *
   */
  public final String getMicroversion() {
    return this.microversion;
  }

  /**
   * Get Creation date
   *
   * @return Creation date
   *
   */
  public final Date getCreatedAt() {
    return this.createdAt;
  }

  /**
   * Get Last modification date
   *
   * @return Last modification date
   *
   */
  public final Date getModifiedAt() {
    return this.modifiedAt;
  }

  /**
   * Get User information for the latest modifier of the workspace
   *
   * @return User information for the latest modifier of the workspace
   *
   */
  public final DocumentsGetWorkspacesResponseWorkspacesLastModifier getLastModifier() {
    return this.lastModifier;
  }

  /**
   * Get name of workspace
   *
   * @return name of workspace
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get ID of workspace
   *
   * @return ID of workspace
   *
   */
  public final String getId() {
    return this.id;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
