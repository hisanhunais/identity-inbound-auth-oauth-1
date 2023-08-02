/*
 * Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.identity.oauth2;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;

import javax.servlet.http.HttpServletRequest;

/**
 * This is a global level interface for building requests.
 */
public interface AbstractRequestBuilder {

    /**
     * Build the request.
     *
     * @param request Incoming HttpServletRequest.
     * @return Built HttpServletRequest.
     * @throws OAuthProblemException OAuthProblemException.
     */
    HttpServletRequest buildRequest(HttpServletRequest request) throws OAuthProblemException;

    /**
     * Check whether the request builder can handle the incoming request.
     *
     * @param request Incoming HttpServletRequest.
     * @return True if the request builder can handle the request.
     */
    boolean canHandle(HttpServletRequest request);

    /**
     * Get the friendly name of the implemented request builder.
     *
     * @return Name of the request builder.
     */
    String getName();

}
