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
package com.onshape.api;

import com.onshape.api.requests.DocumentsCopyWorkspaceRequest;
import com.onshape.api.requests.DocumentsCreateDocumentRequest;
import com.onshape.api.requests.DocumentsCreateVersionOldRequest;
import com.onshape.api.requests.DocumentsCreateVersionRequest;
import com.onshape.api.requests.DocumentsCreateWorkspaceOldRequest;
import com.onshape.api.requests.DocumentsCreateWorkspaceRequest;
import com.onshape.api.requests.DocumentsDeleteDocumentRequest;
import com.onshape.api.requests.DocumentsDeleteWorkspaceOldRequest;
import com.onshape.api.requests.DocumentsDeleteWorkspaceRequest;
import com.onshape.api.requests.DocumentsDownloadExternalDataRequest;
import com.onshape.api.requests.DocumentsExportElementPostJsonRequest;
import com.onshape.api.requests.DocumentsExportElementRequest;
import com.onshape.api.requests.DocumentsExportOldRequest;
import com.onshape.api.requests.DocumentsGetAclRequest;
import com.onshape.api.requests.DocumentsGetCurrentMicroversionRequest;
import com.onshape.api.requests.DocumentsGetDocumentPermissionSetRequest;
import com.onshape.api.requests.DocumentsGetDocumentRequest;
import com.onshape.api.requests.DocumentsGetDocumentsRequest;
import com.onshape.api.requests.DocumentsGetElementListRequest;
import com.onshape.api.requests.DocumentsGetElementsRequest;
import com.onshape.api.requests.DocumentsGetInsertablesRequest;
import com.onshape.api.requests.DocumentsGetVersionOldRequest;
import com.onshape.api.requests.DocumentsGetVersionRequest;
import com.onshape.api.requests.DocumentsGetVersionsOldRequest;
import com.onshape.api.requests.DocumentsGetVersionsRequest;
import com.onshape.api.requests.DocumentsGetWorkspaceOldRequest;
import com.onshape.api.requests.DocumentsGetWorkspaceRequest;
import com.onshape.api.requests.DocumentsGetWorkspacesOldRequest;
import com.onshape.api.requests.DocumentsGetWorkspacesRequest;
import com.onshape.api.requests.DocumentsMoveElementsToDocumentRequest;
import com.onshape.api.requests.DocumentsShareDocumentRequest;
import com.onshape.api.requests.DocumentsUnShareRequest;
import com.onshape.api.requests.DocumentsUpdateDocumentAttributesRequest;
import com.onshape.api.requests.DocumentsUpdateExternalReferencesToLatestDocumentsRequest;
import com.onshape.api.requests.DocumentsUpdateVersionOldRequest;

/**
 * Documents: API endpoints for Documents group.
 * &copy; 2018 Onshape Inc.
 */
public final class Documents {
  Onshape onshape;

  Documents(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for copyWorkspace
   *  @return Request builder object
   */
  public final DocumentsCopyWorkspaceRequest.Builder copyWorkspace() {
    return DocumentsCopyWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for createDocument
   *  @return Request builder object
   */
  public final DocumentsCreateDocumentRequest.Builder createDocument() {
    return DocumentsCreateDocumentRequest.builder(onshape);
  }

  /**
   * Create request for createVersion
   *  @return Request builder object
   */
  public final DocumentsCreateVersionRequest.Builder createVersion() {
    return DocumentsCreateVersionRequest.builder(onshape);
  }

  /**
   * Create request for createVersionOld
   *  @return Request builder object
   */
  public final DocumentsCreateVersionOldRequest.Builder createVersionOld() {
    return DocumentsCreateVersionOldRequest.builder(onshape);
  }

  /**
   * Create request for createWorkspace
   *  @return Request builder object
   */
  public final DocumentsCreateWorkspaceRequest.Builder createWorkspace() {
    return DocumentsCreateWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for createWorkspaceOld
   *  @return Request builder object
   */
  public final DocumentsCreateWorkspaceOldRequest.Builder createWorkspaceOld() {
    return DocumentsCreateWorkspaceOldRequest.builder(onshape);
  }

  /**
   * Create request for deleteDocument
   *  @return Request builder object
   */
  public final DocumentsDeleteDocumentRequest.Builder deleteDocument() {
    return DocumentsDeleteDocumentRequest.builder(onshape);
  }

  /**
   * Create request for deleteWorkspace
   *  @return Request builder object
   */
  public final DocumentsDeleteWorkspaceRequest.Builder deleteWorkspace() {
    return DocumentsDeleteWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for deleteWorkspaceOld
   *  @return Request builder object
   */
  public final DocumentsDeleteWorkspaceOldRequest.Builder deleteWorkspaceOld() {
    return DocumentsDeleteWorkspaceOldRequest.builder(onshape);
  }

  /**
   * Create request for downloadExternalData
   *  @return Request builder object
   */
  public final DocumentsDownloadExternalDataRequest.Builder downloadExternalData() {
    return DocumentsDownloadExternalDataRequest.builder(onshape);
  }

  /**
   * Create request for getElementList
   *  @return Request builder object
   */
  public final DocumentsGetElementListRequest.Builder getElementList() {
    return DocumentsGetElementListRequest.builder(onshape);
  }

  /**
   * Create request for exportOld
   *  @return Request builder object
   */
  public final DocumentsExportOldRequest.Builder exportOld() {
    return DocumentsExportOldRequest.builder(onshape);
  }

  /**
   * Create request for exportElement
   *  @return Request builder object
   */
  public final DocumentsExportElementRequest.Builder exportElement() {
    return DocumentsExportElementRequest.builder(onshape);
  }

  /**
   * Create request for exportElementPostJson
   *  @return Request builder object
   */
  public final DocumentsExportElementPostJsonRequest.Builder exportElementPostJson() {
    return DocumentsExportElementPostJsonRequest.builder(onshape);
  }

  /**
   * Create request for getAcl
   *  @return Request builder object
   */
  public final DocumentsGetAclRequest.Builder getAcl() {
    return DocumentsGetAclRequest.builder(onshape);
  }

  /**
   * Create request for getCurrentMicroversion
   *  @return Request builder object
   */
  public final DocumentsGetCurrentMicroversionRequest.Builder getCurrentMicroversion() {
    return DocumentsGetCurrentMicroversionRequest.builder(onshape);
  }

  /**
   * Create request for getDocument
   *  @return Request builder object
   */
  public final DocumentsGetDocumentRequest.Builder getDocument() {
    return DocumentsGetDocumentRequest.builder(onshape);
  }

  /**
   * Create request for getDocumentPermissionSet
   *  @return Request builder object
   */
  public final DocumentsGetDocumentPermissionSetRequest.Builder getDocumentPermissionSet() {
    return DocumentsGetDocumentPermissionSetRequest.builder(onshape);
  }

  /**
   * Create request for getDocuments
   *  @return Request builder object
   */
  public final DocumentsGetDocumentsRequest.Builder getDocuments() {
    return DocumentsGetDocumentsRequest.builder(onshape);
  }

  /**
   * Create request for getElements
   *  @return Request builder object
   */
  public final DocumentsGetElementsRequest.Builder getElements() {
    return DocumentsGetElementsRequest.builder(onshape);
  }

  /**
   * Create request for getVersion
   *  @return Request builder object
   */
  public final DocumentsGetVersionRequest.Builder getVersion() {
    return DocumentsGetVersionRequest.builder(onshape);
  }

  /**
   * Create request for getVersionOld
   *  @return Request builder object
   */
  public final DocumentsGetVersionOldRequest.Builder getVersionOld() {
    return DocumentsGetVersionOldRequest.builder(onshape);
  }

  /**
   * Create request for getVersions
   *  @return Request builder object
   */
  public final DocumentsGetVersionsRequest.Builder getVersions() {
    return DocumentsGetVersionsRequest.builder(onshape);
  }

  /**
   * Create request for getVersionsOld
   *  @return Request builder object
   */
  public final DocumentsGetVersionsOldRequest.Builder getVersionsOld() {
    return DocumentsGetVersionsOldRequest.builder(onshape);
  }

  /**
   * Create request for getWorkspace
   *  @return Request builder object
   */
  public final DocumentsGetWorkspaceRequest.Builder getWorkspace() {
    return DocumentsGetWorkspaceRequest.builder(onshape);
  }

  /**
   * Create request for getWorkspaceOld
   *  @return Request builder object
   */
  public final DocumentsGetWorkspaceOldRequest.Builder getWorkspaceOld() {
    return DocumentsGetWorkspaceOldRequest.builder(onshape);
  }

  /**
   * Create request for getWorkspaces
   *  @return Request builder object
   */
  public final DocumentsGetWorkspacesRequest.Builder getWorkspaces() {
    return DocumentsGetWorkspacesRequest.builder(onshape);
  }

  /**
   * Create request for getWorkspacesOld
   *  @return Request builder object
   */
  public final DocumentsGetWorkspacesOldRequest.Builder getWorkspacesOld() {
    return DocumentsGetWorkspacesOldRequest.builder(onshape);
  }

  /**
   * Create request for getInsertables
   *  @return Request builder object
   */
  public final DocumentsGetInsertablesRequest.Builder getInsertables() {
    return DocumentsGetInsertablesRequest.builder(onshape);
  }

  /**
   * Create request for moveElementsToDocument
   *  @return Request builder object
   */
  public final DocumentsMoveElementsToDocumentRequest.Builder moveElementsToDocument() {
    return DocumentsMoveElementsToDocumentRequest.builder(onshape);
  }

  /**
   * Create request for shareDocument
   *  @return Request builder object
   */
  public final DocumentsShareDocumentRequest.Builder shareDocument() {
    return DocumentsShareDocumentRequest.builder(onshape);
  }

  /**
   * Create request for unShare
   *  @return Request builder object
   */
  public final DocumentsUnShareRequest.Builder unShare() {
    return DocumentsUnShareRequest.builder(onshape);
  }

  /**
   * Create request for updateDocumentAttributes
   *  @return Request builder object
   */
  public final DocumentsUpdateDocumentAttributesRequest.Builder updateDocumentAttributes() {
    return DocumentsUpdateDocumentAttributesRequest.builder(onshape);
  }

  /**
   * Create request for updateExternalReferencesToLatestDocuments
   *  @return Request builder object
   */
  public final DocumentsUpdateExternalReferencesToLatestDocumentsRequest.Builder updateExternalReferencesToLatestDocuments() {
    return DocumentsUpdateExternalReferencesToLatestDocumentsRequest.builder(onshape);
  }

  /**
   * Create request for updateVersionOld
   *  @return Request builder object
   */
  public final DocumentsUpdateVersionOldRequest.Builder updateVersionOld() {
    return DocumentsUpdateVersionOldRequest.builder(onshape);
  }
}
