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
 * Object used in calls to getAssemblyDefinition API endpoint.
 * &copy; 2018 Onshape Inc.
 */
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public final class AssembliesGetAssemblyDefinitionResponseSubAssemblies {
  /**
   * Document ID for the document containing the sub-assembly
   */
  @JsonProperty("documentId")
  public String documentId;

  /**
   * Document microversion ID for the document containing the sub-assembly
   */
  @JsonProperty("documentMicroversion")
  public String documentMicroversion;

  /**
   * Version ID of document containing the subAssembly, if reached through one or more version references
   */
  @JsonProperty("documentVersion")
  public String documentVersion;

  /**
   * Element ID of the sub-assembly
   */
  @JsonProperty("elementId")
  public String elementId;

  /**
   * Instances within the sub-assembly
   */
  @JsonProperty("instances")
  public Map[] instances;

  /**
   * Get Document ID for the document containing the sub-assembly
   *
   * @return Document ID for the document containing the sub-assembly
   *
   */
  public final String getDocumentId() {
    return this.documentId;
  }

  /**
   * Get Document microversion ID for the document containing the sub-assembly
   *
   * @return Document microversion ID for the document containing the sub-assembly
   *
   */
  public final String getDocumentMicroversion() {
    return this.documentMicroversion;
  }

  /**
   * Get Version ID of document containing the subAssembly, if reached through one or more version references
   *
   * @return Version ID of document containing the subAssembly, if reached through one or more version references
   *
   */
  public final String getDocumentVersion() {
    return this.documentVersion;
  }

  /**
   * Get Element ID of the sub-assembly
   *
   * @return Element ID of the sub-assembly
   *
   */
  public final String getElementId() {
    return this.elementId;
  }

  /**
   * Get Instances within the sub-assembly
   *
   * @return Instances within the sub-assembly
   *
   */
  public final Map[] getInstances() {
    return this.instances;
  }

  @Override
  public String toString() {
    return Onshape.toString(this);
  }
}
