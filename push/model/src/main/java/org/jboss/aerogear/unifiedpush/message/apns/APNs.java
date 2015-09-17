/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.unifiedpush.message.apns;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

/**
 * iOS specific settings for Push Notifications
 */
@JsonRootName("apns")
public class APNs implements Serializable {

    @JsonProperty("action-category")
    private String actionCategory;
    private String title;
    private String action;

    @JsonProperty("localized-title-key")
    private String localizedTitleKey;

    @JsonProperty("localized-title-arguments")
    private String[] localizedTitleArguments;

    @JsonProperty("url-args")
    private String[] urlArgs;

    @JsonProperty("content-available")
    private boolean contentAvailable;

    /**
     * Returns the value of the 'action-category', which is used on the client (iOS for now),
     * to invoke a certain "user action" on the device, based on the push message. Implemented for iOS8
     */
    @JsonProperty("action-category")
    public String getActionCategory() {
        return actionCategory;
    }

    @JsonProperty("action-category")
    public void setActionCategory(String actionCategory) {
        this.actionCategory = actionCategory;
    }

    /**
     * Returns the value of the 'title' key from the submitted payload.
     * This key is recognized in APNs for Safari, without any API invocation.
     *
     */
    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    /**
     * Returns the value of the 'action' key from the submitted payload.
     * This key is recognized in APNs for Safari.
     *
     */
    public String getAction() { return action; }

    public void setAction(String action) { this.action = action; }

    /**
     * Used for in iOS specific feature, to indicate if content (for Newsstand or silent messages) has marked as
     * being available
     *
     * Not supported on other platforms.
     */
    @JsonProperty("content-available")
    public boolean isContentAvailable() {
        return contentAvailable;
    }

    @JsonProperty("content-available")
    public void setContentAvailable(boolean contentAvailable) {
        this.contentAvailable = contentAvailable;
    }

    /**
     * Returns the value of the 'url-args' key from the submitted payload.
     * This key is recognized in APNs for Safari.
     *
     */
    @JsonProperty("url-args")
    public String[] getUrlArgs() { return urlArgs; }

    @JsonProperty("url-args")
    public void setUrlArgs(String[] urlArgs) { this.urlArgs = urlArgs; }

    /**
     * The key to a title string in the Localizable.strings file for the current localization.
     */
    @JsonProperty("localized-title-key")
    public String getLocalizedTitleKey() { return localizedTitleKey;}

    @JsonProperty("localized-title-key")
    public void setLocalizedTitleKey(String localizedTitleKey) {this.localizedTitleKey = localizedTitleKey;}

    /**
     * Sets the arguments for the localizable title key
     */
    @JsonProperty("localized-title-arguments")
    public String[] getLocalizedTitleArguments() { return localizedTitleArguments;}

    @JsonProperty("localized-title-arguments")
    public void setLocalizedTitleArguments(String[] localizedTitleArguments) {this.localizedTitleArguments = localizedTitleArguments;}



}
