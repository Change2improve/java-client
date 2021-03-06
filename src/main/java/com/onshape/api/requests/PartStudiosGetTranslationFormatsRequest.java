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
package com.onshape.api.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onshape.api.Onshape;
import com.onshape.api.exceptions.OnshapeException;
import com.onshape.api.responses.PartStudiosGetTranslationFormatsResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getTranslationFormats API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class PartStudiosGetTranslationFormatsRequest {
  /**
   * Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
   */
  @JsonProperty("checkContent")
  Boolean checkContent;

  PartStudiosGetTranslationFormatsRequest(Boolean checkContent) {
    this.checkContent = checkContent;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }

  public static final Builder builder(Onshape onshape) {
    Builder builder = new Builder();
    builder.onshape = onshape;
    return builder;
  }

  public static final class Builder {
    /**
     * Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
     */
    private Boolean checkContent;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
     *
     * @return Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
     *
     */
    public final Boolean checkContent() {
      return this.checkContent;
    }

    /**
     * Set Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
     *
     * @param value Whether the current content or lack thereof should be considered when determining the available formats. Empty part studios cannot be translated into any format.
     *
     * @return the Builder object.
     */
    public final Builder checkContent(Boolean value) {
      this.checkContent = value;
      return this;
    }

    private PartStudiosGetTranslationFormatsRequest build() {
      return new com.onshape.api.requests.PartStudiosGetTranslationFormatsRequest(checkContent);
    }

    /**
     * Calls getTranslationFormats method, Returns a list of the available formats to which this Part Studio can be translated
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param wid Workspace ID
     *
     * @param eid Element ID
     */
    public final PartStudiosGetTranslationFormatsResponse call(String did, String wid, String eid)
        throws OnshapeException {
      return onshape.call("get", "/partstudios/d/:did/w/:wid/e/:eid/translationformats", build(), onshape.buildMap("did", did, "wid", wid, "eid", eid), onshape.buildMap("checkContent", checkContent), com.onshape.api.responses.PartStudiosGetTranslationFormatsResponse.class);
    }

    /**
     * Calls getTranslationFormats method, Returns a list of the available formats to which this Part Studio can be translated
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param wid Workspace ID
     */
    public final PartStudiosGetTranslationFormatsResponse call(OnshapeDocument document, String wid)
        throws OnshapeException {
      return onshape.call("get", "/partstudios/d/:did/w/:wid/e/:eid/translationformats", build(), onshape.buildMap("did", document.getDocumentId(), "wid", wid, "eid", document.getElementId()), onshape.buildMap(), com.onshape.api.responses.PartStudiosGetTranslationFormatsResponse.class);
    }
  }
}
