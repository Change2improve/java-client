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

import com.onshape.api.requests.AppAssociativeDataDeleteAssociativeDataRequest;
import com.onshape.api.requests.AppAssociativeDataGetAssociativeDataRequest;
import com.onshape.api.requests.AppAssociativeDataUpdateAssociativeDataRequest;

/**
 * AppAssociativeData: API endpoints for AppAssociativeData group.
 * &copy; 2018 Onshape Inc.
 */
public final class AppAssociativeData {
  Onshape onshape;

  AppAssociativeData(Onshape onshape) {
    this.onshape = onshape;
  }

  /**
   * Create request for deleteAssociativeData
   *  @return Request builder object
   */
  public final AppAssociativeDataDeleteAssociativeDataRequest.Builder deleteAssociativeData() {
    return AppAssociativeDataDeleteAssociativeDataRequest.builder(onshape);
  }

  /**
   * Create request for getAssociativeData
   *  @return Request builder object
   */
  public final AppAssociativeDataGetAssociativeDataRequest.Builder getAssociativeData() {
    return AppAssociativeDataGetAssociativeDataRequest.builder(onshape);
  }

  /**
   * Create request for updateAssociativeData
   *  @return Request builder object
   */
  public final AppAssociativeDataUpdateAssociativeDataRequest.Builder updateAssociativeData() {
    return AppAssociativeDataUpdateAssociativeDataRequest.builder(onshape);
  }
}
