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
import java.lang.Override;
import java.lang.String;
import java.util.Map;

/**
 * Object used in calls to getElementList API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class DocumentsGetElementListResponseElements {
  /**
   * Element name
   */
  @JsonProperty("name")
  public String name;

  /**
   * Element ID
   */
  @JsonProperty("id")
  public String id;

  /**
   * Element type (for example, &quot;PARTSTUDIO&quot;)
   */
  @JsonProperty("elementType")
  public String elementType;

  /**
   * Onshape internal use
   */
  @JsonProperty("type")
  public String type;

  /**
   * Length units, for Part Studio and Assembly elements only
   */
  @JsonProperty("lengthUnits")
  public String lengthUnits;

  /**
   * Angle units, for Part Studio and Assembly elements only
   */
  @JsonProperty("angleUnits")
  public String angleUnits;

  /**
   * Mass units, for Part Studio and Assembly elements only
   */
  @JsonProperty("massUnits")
  public String massUnits;

  /**
   * Thumbnail information
   */
  @JsonProperty("thumbnailInfo")
  public DocumentsGetElementListResponseElementsThumbnailInfo thumbnailInfo;

  /**
   * Onshape internal use
   */
  @JsonProperty("thumbnails")
  public Map thumbnails;

  /**
   * Get Element name
   *
   * @return Element name
   *
   */
  public final String getName() {
    return this.name;
  }

  /**
   * Get Element ID
   *
   * @return Element ID
   *
   */
  public final String getId() {
    return this.id;
  }

  /**
   * Get Element type (for example, &quot;PARTSTUDIO&quot;)
   *
   * @return Element type (for example, &quot;PARTSTUDIO&quot;)
   *
   */
  public final String getElementType() {
    return this.elementType;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final String getType() {
    return this.type;
  }

  /**
   * Get Length units, for Part Studio and Assembly elements only
   *
   * @return Length units, for Part Studio and Assembly elements only
   *
   */
  public final String getLengthUnits() {
    return this.lengthUnits;
  }

  /**
   * Get Angle units, for Part Studio and Assembly elements only
   *
   * @return Angle units, for Part Studio and Assembly elements only
   *
   */
  public final String getAngleUnits() {
    return this.angleUnits;
  }

  /**
   * Get Mass units, for Part Studio and Assembly elements only
   *
   * @return Mass units, for Part Studio and Assembly elements only
   *
   */
  public final String getMassUnits() {
    return this.massUnits;
  }

  /**
   * Get Thumbnail information
   *
   * @return Thumbnail information
   *
   */
  public final DocumentsGetElementListResponseElementsThumbnailInfo getThumbnailInfo() {
    return this.thumbnailInfo;
  }

  /**
   * Get Onshape internal use
   *
   * @return Onshape internal use
   *
   */
  public final Map getThumbnails() {
    return this.thumbnails;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
