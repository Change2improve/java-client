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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Object used in calls to getPartsInPartstudio API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class PartsGetPartsInPartstudioResponsePartsAppearanceColor {
  /**
   * Red RGB value
   */
  @JsonProperty("red")
  public Number red;

  /**
   * Blue RGB value
   */
  @JsonProperty("blue")
  public Number blue;

  /**
   * Green RGB value
   */
  @JsonProperty("green")
  public Number green;

  /**
   * Get Red RGB value
   *
   * @return Red RGB value
   *
   */
  public final Number getRed() {
    return this.red;
  }

  /**
   * Get Blue RGB value
   *
   * @return Blue RGB value
   *
   */
  public final Number getBlue() {
    return this.blue;
  }

  /**
   * Get Green RGB value
   *
   * @return Green RGB value
   *
   */
  public final Number getGreen() {
    return this.green;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
