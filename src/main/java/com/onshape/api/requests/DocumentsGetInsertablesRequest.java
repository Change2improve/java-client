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
import com.onshape.api.responses.DocumentsGetInsertablesResponse;
import com.onshape.api.types.OnshapeDocument;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * Request object for getInsertables API endpoint.
 * &copy; 2018 Onshape Inc.
 */
public final class DocumentsGetInsertablesRequest {
  /**
   * Beta capablities of the document requesting insertables
   */
  @JsonProperty("betaCapabilityIds")
  String betaCapabilityIds;

  /**
   * Returns parts
   */
  @JsonProperty("includeParts")
  Boolean includeParts;

  /**
   * Returns surfaces
   */
  @JsonProperty("includeSurfaces")
  Boolean includeSurfaces;

  /**
   * Returns wires
   */
  @JsonProperty("includeWires")
  Boolean includeWires;

  /**
   * Returns sketches
   */
  @JsonProperty("includeSketches")
  Boolean includeSketches;

  /**
   * Returns reference features
   */
  @JsonProperty("includeReferenceFeatures")
  Boolean includeReferenceFeatures;

  /**
   * Returns assemblies
   */
  @JsonProperty("includeAssemblies")
  Boolean includeAssemblies;

  /**
   * Returns feature studios
   */
  @JsonProperty("includeFeatureStudios")
  Boolean includeFeatureStudios;

  /**
   * Returns features
   */
  @JsonProperty("includeFeatures")
  Boolean includeFeatures;

  /**
   * Returns blobs
   */
  @JsonProperty("includeBlobs")
  Boolean includeBlobs;

  /**
   * Returns meshes
   */
  @JsonProperty("includeMeshes")
  Boolean includeMeshes;

  /**
   * Returns flattened sheetmetal bodies
   */
  @JsonProperty("includeFlattenedBodies")
  Boolean includeFlattenedBodies;

  /**
   * Return applications
   */
  @JsonProperty("includeApplications")
  Boolean includeApplications;

  /**
   * Comma separated list of blob mime types to include
   */
  @JsonProperty("allowedBlobMimeTypes")
  String allowedBlobMimeTypes;

  /**
   * Comma separated list of application format ids to include
   */
  @JsonProperty("allowedApplicationMimeTypes")
  String allowedApplicationMimeTypes;

  /**
   * If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
   */
  @JsonProperty("maxFeatureScriptVersion")
  Number maxFeatureScriptVersion;

  DocumentsGetInsertablesRequest(String betaCapabilityIds, Boolean includeParts,
      Boolean includeSurfaces, Boolean includeWires, Boolean includeSketches,
      Boolean includeReferenceFeatures, Boolean includeAssemblies, Boolean includeFeatureStudios,
      Boolean includeFeatures, Boolean includeBlobs, Boolean includeMeshes,
      Boolean includeFlattenedBodies, Boolean includeApplications, String allowedBlobMimeTypes,
      String allowedApplicationMimeTypes, Number maxFeatureScriptVersion) {
    this.betaCapabilityIds = betaCapabilityIds;
    this.includeParts = includeParts;
    this.includeSurfaces = includeSurfaces;
    this.includeWires = includeWires;
    this.includeSketches = includeSketches;
    this.includeReferenceFeatures = includeReferenceFeatures;
    this.includeAssemblies = includeAssemblies;
    this.includeFeatureStudios = includeFeatureStudios;
    this.includeFeatures = includeFeatures;
    this.includeBlobs = includeBlobs;
    this.includeMeshes = includeMeshes;
    this.includeFlattenedBodies = includeFlattenedBodies;
    this.includeApplications = includeApplications;
    this.allowedBlobMimeTypes = allowedBlobMimeTypes;
    this.allowedApplicationMimeTypes = allowedApplicationMimeTypes;
    this.maxFeatureScriptVersion = maxFeatureScriptVersion;
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
     * Beta capablities of the document requesting insertables
     */
    private String betaCapabilityIds;

    /**
     * Returns parts
     */
    private Boolean includeParts;

    /**
     * Returns surfaces
     */
    private Boolean includeSurfaces;

    /**
     * Returns wires
     */
    private Boolean includeWires;

    /**
     * Returns sketches
     */
    private Boolean includeSketches;

    /**
     * Returns reference features
     */
    private Boolean includeReferenceFeatures;

    /**
     * Returns assemblies
     */
    private Boolean includeAssemblies;

    /**
     * Returns feature studios
     */
    private Boolean includeFeatureStudios;

    /**
     * Returns features
     */
    private Boolean includeFeatures;

    /**
     * Returns blobs
     */
    private Boolean includeBlobs;

    /**
     * Returns meshes
     */
    private Boolean includeMeshes;

    /**
     * Returns flattened sheetmetal bodies
     */
    private Boolean includeFlattenedBodies;

    /**
     * Return applications
     */
    private Boolean includeApplications;

    /**
     * Comma separated list of blob mime types to include
     */
    private String allowedBlobMimeTypes;

    /**
     * Comma separated list of application format ids to include
     */
    private String allowedApplicationMimeTypes;

    /**
     * If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
     */
    private Number maxFeatureScriptVersion;

    Onshape onshape;

    Builder() {
    }

    /**
     * Get Beta capablities of the document requesting insertables
     *
     * @return Beta capablities of the document requesting insertables
     *
     */
    public final String betaCapabilityIds() {
      return this.betaCapabilityIds;
    }

    /**
     * Set Beta capablities of the document requesting insertables
     *
     * @param value Beta capablities of the document requesting insertables
     *
     * @return the Builder object.
     */
    public final Builder betaCapabilityIds(String value) {
      this.betaCapabilityIds = value;
      return this;
    }

    /**
     * Get Returns parts
     *
     * @return Returns parts
     *
     */
    public final Boolean includeParts() {
      return this.includeParts;
    }

    /**
     * Set Returns parts
     *
     * @param value Returns parts
     *
     * @return the Builder object.
     */
    public final Builder includeParts(Boolean value) {
      this.includeParts = value;
      return this;
    }

    /**
     * Get Returns surfaces
     *
     * @return Returns surfaces
     *
     */
    public final Boolean includeSurfaces() {
      return this.includeSurfaces;
    }

    /**
     * Set Returns surfaces
     *
     * @param value Returns surfaces
     *
     * @return the Builder object.
     */
    public final Builder includeSurfaces(Boolean value) {
      this.includeSurfaces = value;
      return this;
    }

    /**
     * Get Returns wires
     *
     * @return Returns wires
     *
     */
    public final Boolean includeWires() {
      return this.includeWires;
    }

    /**
     * Set Returns wires
     *
     * @param value Returns wires
     *
     * @return the Builder object.
     */
    public final Builder includeWires(Boolean value) {
      this.includeWires = value;
      return this;
    }

    /**
     * Get Returns sketches
     *
     * @return Returns sketches
     *
     */
    public final Boolean includeSketches() {
      return this.includeSketches;
    }

    /**
     * Set Returns sketches
     *
     * @param value Returns sketches
     *
     * @return the Builder object.
     */
    public final Builder includeSketches(Boolean value) {
      this.includeSketches = value;
      return this;
    }

    /**
     * Get Returns reference features
     *
     * @return Returns reference features
     *
     */
    public final Boolean includeReferenceFeatures() {
      return this.includeReferenceFeatures;
    }

    /**
     * Set Returns reference features
     *
     * @param value Returns reference features
     *
     * @return the Builder object.
     */
    public final Builder includeReferenceFeatures(Boolean value) {
      this.includeReferenceFeatures = value;
      return this;
    }

    /**
     * Get Returns assemblies
     *
     * @return Returns assemblies
     *
     */
    public final Boolean includeAssemblies() {
      return this.includeAssemblies;
    }

    /**
     * Set Returns assemblies
     *
     * @param value Returns assemblies
     *
     * @return the Builder object.
     */
    public final Builder includeAssemblies(Boolean value) {
      this.includeAssemblies = value;
      return this;
    }

    /**
     * Get Returns feature studios
     *
     * @return Returns feature studios
     *
     */
    public final Boolean includeFeatureStudios() {
      return this.includeFeatureStudios;
    }

    /**
     * Set Returns feature studios
     *
     * @param value Returns feature studios
     *
     * @return the Builder object.
     */
    public final Builder includeFeatureStudios(Boolean value) {
      this.includeFeatureStudios = value;
      return this;
    }

    /**
     * Get Returns features
     *
     * @return Returns features
     *
     */
    public final Boolean includeFeatures() {
      return this.includeFeatures;
    }

    /**
     * Set Returns features
     *
     * @param value Returns features
     *
     * @return the Builder object.
     */
    public final Builder includeFeatures(Boolean value) {
      this.includeFeatures = value;
      return this;
    }

    /**
     * Get Returns blobs
     *
     * @return Returns blobs
     *
     */
    public final Boolean includeBlobs() {
      return this.includeBlobs;
    }

    /**
     * Set Returns blobs
     *
     * @param value Returns blobs
     *
     * @return the Builder object.
     */
    public final Builder includeBlobs(Boolean value) {
      this.includeBlobs = value;
      return this;
    }

    /**
     * Get Returns meshes
     *
     * @return Returns meshes
     *
     */
    public final Boolean includeMeshes() {
      return this.includeMeshes;
    }

    /**
     * Set Returns meshes
     *
     * @param value Returns meshes
     *
     * @return the Builder object.
     */
    public final Builder includeMeshes(Boolean value) {
      this.includeMeshes = value;
      return this;
    }

    /**
     * Get Returns flattened sheetmetal bodies
     *
     * @return Returns flattened sheetmetal bodies
     *
     */
    public final Boolean includeFlattenedBodies() {
      return this.includeFlattenedBodies;
    }

    /**
     * Set Returns flattened sheetmetal bodies
     *
     * @param value Returns flattened sheetmetal bodies
     *
     * @return the Builder object.
     */
    public final Builder includeFlattenedBodies(Boolean value) {
      this.includeFlattenedBodies = value;
      return this;
    }

    /**
     * Get Return applications
     *
     * @return Return applications
     *
     */
    public final Boolean includeApplications() {
      return this.includeApplications;
    }

    /**
     * Set Return applications
     *
     * @param value Return applications
     *
     * @return the Builder object.
     */
    public final Builder includeApplications(Boolean value) {
      this.includeApplications = value;
      return this;
    }

    /**
     * Get Comma separated list of blob mime types to include
     *
     * @return Comma separated list of blob mime types to include
     *
     */
    public final String allowedBlobMimeTypes() {
      return this.allowedBlobMimeTypes;
    }

    /**
     * Set Comma separated list of blob mime types to include
     *
     * @param value Comma separated list of blob mime types to include
     *
     * @return the Builder object.
     */
    public final Builder allowedBlobMimeTypes(String value) {
      this.allowedBlobMimeTypes = value;
      return this;
    }

    /**
     * Get Comma separated list of application format ids to include
     *
     * @return Comma separated list of application format ids to include
     *
     */
    public final String allowedApplicationMimeTypes() {
      return this.allowedApplicationMimeTypes;
    }

    /**
     * Set Comma separated list of application format ids to include
     *
     * @param value Comma separated list of application format ids to include
     *
     * @return the Builder object.
     */
    public final Builder allowedApplicationMimeTypes(String value) {
      this.allowedApplicationMimeTypes = value;
      return this;
    }

    /**
     * Get If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
     *
     * @return If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
     *
     */
    public final Number maxFeatureScriptVersion() {
      return this.maxFeatureScriptVersion;
    }

    /**
     * Set If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
     *
     * @param value If specified and is greater than zero, insertables that are created using feature script version less than or equal to maxFeatureScriptVersion will be returned
     *
     * @return the Builder object.
     */
    public final Builder maxFeatureScriptVersion(Number value) {
      this.maxFeatureScriptVersion = value;
      return this;
    }

    private DocumentsGetInsertablesRequest build() {
      return new com.onshape.api.requests.DocumentsGetInsertablesRequest(betaCapabilityIds,includeParts,includeSurfaces,includeWires,includeSketches,includeReferenceFeatures,includeAssemblies,includeFeatureStudios,includeFeatures,includeBlobs,includeMeshes,includeFlattenedBodies,includeApplications,allowedBlobMimeTypes,allowedApplicationMimeTypes,maxFeatureScriptVersion);
    }

    /**
     * Calls getInsertables method, Get a list of insertables in the version of the document.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param did Document ID
     *
     * @param vid Version ID
     */
    public final DocumentsGetInsertablesResponse call(String did, String vid) throws
        OnshapeException {
      return onshape.call("get", "/documents/d/:did/v/:vid/insertables", build(), onshape.buildMap("did", did, "vid", vid), onshape.buildMap("betaCapabilityIds", betaCapabilityIds, "includeParts", includeParts, "includeSurfaces", includeSurfaces, "includeWires", includeWires, "includeSketches", includeSketches, "includeReferenceFeatures", includeReferenceFeatures, "includeAssemblies", includeAssemblies, "includeFeatureStudios", includeFeatureStudios, "includeFeatures", includeFeatures, "includeBlobs", includeBlobs, "includeMeshes", includeMeshes, "includeFlattenedBodies", includeFlattenedBodies, "includeApplications", includeApplications, "allowedBlobMimeTypes", allowedBlobMimeTypes, "allowedApplicationMimeTypes", allowedApplicationMimeTypes, "maxFeatureScriptVersion", maxFeatureScriptVersion), com.onshape.api.responses.DocumentsGetInsertablesResponse.class);
    }

    /**
     * Calls getInsertables method, Get a list of insertables in the version of the document.
     * @param document Document object from Onshape URL.
     * @return Response object
     * @throws OnshapeException On HTTP or serialization error
     *
     * @param vid Version ID
     */
    public final DocumentsGetInsertablesResponse call(OnshapeDocument document, String vid) throws
        OnshapeException {
      return onshape.call("get", "/documents/d/:did/v/:vid/insertables", build(), onshape.buildMap("did", document.getDocumentId(), "vid", vid), onshape.buildMap(), com.onshape.api.responses.DocumentsGetInsertablesResponse.class);
    }
  }
}
