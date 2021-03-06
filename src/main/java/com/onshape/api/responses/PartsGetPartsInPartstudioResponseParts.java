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
import java.util.Map;

/**
 * Object used in calls to getPartsInPartstudio API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsGetPartsInPartstudioResponseParts {
  /**
   * Part ID
   */
  @JsonProperty("partId")
  public String partId;

  /**
   * Part name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Onshape internal use
   */
  @JsonProperty("partQuery")
  public String partQuery;

  /**
   * Element ID
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Part visibility
   */
  @JsonProperty("isHidden")
  public Boolean isHidden;

  /**
   * Part appearance
   */
  @JsonProperty("appearance")
  public PartsGetPartsInPartstudioResponsePartsAppearance appearance;

  /**
   * Part material, if assigned
   */
  @JsonProperty("material")
  public PartsGetPartsInPartstudioResponsePartsMaterial material;

  /**
   * Custom properties, if any
   */
  @JsonProperty("customProperties")
  public Map customProperties;

  /**
   * Document microversion ID
   */
  @JsonProperty("microversionId")
  public String microversionId;

  /**
   * Part body type; can be &#39;solid&#39;, &#39;surface&#39;, or &#39;wire&#39;
   */
  @JsonProperty("bodyType")
  public String bodyType;

  /**
   * Whether the part is a mesh
   */
  @JsonProperty("isMesh")
  public Boolean isMesh;

  /**
   * Get Part ID
   *
   * @return Part ID
   *
   */
  public final String getPartId() {
    return this.partId;
  }

  /**
   * Get Part name
   *
   * @return Part name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getPartQuery() {
    return this.partQuery;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Part visibility
   *
   * @return Part visibility
   *
   */
  public final Boolean getIsHidden() {
    return this.isHidden;
  }

  /**
   * Get Part appearance
   *
   * @return Part appearance
   *
   */
  public final PartsGetPartsInPartstudioResponsePartsAppearance getAppearance() {
    return this.appearance;
  }

  /**
   * Get Part material, if assigned
   *
   * @return Part material, if assigned
   *
   */
  public final PartsGetPartsInPartstudioResponsePartsMaterial getMaterial() {
    return this.material;
  }

  /**
   * Get Custom properties, if any
   *
   * @return Custom properties, if any
   *
   */
  public final Map getCustomProperties() {
    return this.customProperties;
  }

  /**
   * Get Document microversion ID
   *
   * @return Document microversion ID
   *
   */
  public final String getMicroversionId() {
    return this.microversionId;
  }

  /**
   * Get Part body type; can be &#39;solid&#39;, &#39;surface&#39;, or &#39;wire&#39;
   *
   * @return Part body type; can be &#39;solid&#39;, &#39;surface&#39;, or &#39;wire&#39;
   *
   */
  public final String getBodyType() {
    return this.bodyType;
  }

  /**
   * Get Whether the part is a mesh
   *
   * @return Whether the part is a mesh
   *
   */
  public final Boolean getIsMesh() {
    return this.isMesh;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
