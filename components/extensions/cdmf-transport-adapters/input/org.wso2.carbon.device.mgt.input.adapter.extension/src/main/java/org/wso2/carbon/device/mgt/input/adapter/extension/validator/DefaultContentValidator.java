/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

package org.wso2.carbon.device.mgt.input.adapter.extension.validator;

import org.wso2.carbon.device.mgt.input.adapter.extension.ContentInfo;
import org.wso2.carbon.device.mgt.input.adapter.extension.ContentValidator;

import java.util.Map;

/**
 * This holds the default implementation of content validator interface.
 */
public class DefaultContentValidator implements ContentValidator {
    private static final String DEFAULT_TYPE = "default";

    @Override
    public String getType() {
        return DEFAULT_TYPE;
    }

    @Override
    public ContentInfo validate(Object message, Map<String, Object> dynamicParams) {
        return new ContentInfo(true, message);
    }

}
