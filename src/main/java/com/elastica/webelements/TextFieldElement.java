/*
 * Copyright 2015 www.seleniumtests.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.elastica.webelements;

import org.openqa.selenium.By;

import com.elastica.core.TestLogging;

public class TextFieldElement extends HtmlElement {
    public TextFieldElement(final String label, final By by) {
        super(label, by);
    }

    public void clear() {
        TestLogging.logWebStep(null, "Remove data From " + toHTML(), false);
        findElement();
        if (!element.getAttribute("type").equalsIgnoreCase("file")) {
            element.clear();
        }
    }

    public void sendKeys(final String keysToSend) {
        TestLogging.logWebStep(null, "Enter data: \"" + keysToSend + "\" on " + toHTML(), false);
        findElement();
        element.sendKeys(keysToSend);
    }

    public void type(final String keysToSend) {
        sendKeys(keysToSend);
    }

    public void clearAndType(final String keysToSend) {
        clear();
        type(keysToSend);
    }
}
