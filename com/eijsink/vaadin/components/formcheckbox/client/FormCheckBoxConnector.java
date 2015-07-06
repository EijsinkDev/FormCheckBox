/*
 * Copyright 2014 Eijsink Afrekensystemen BV/Eijsink Software BV
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.eijsink.vaadin.components.formcheckbox.client;

import com.eijsink.vaadin.components.formcheckbox.FormCheckBox;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.checkbox.CheckBoxConnector;
import com.vaadin.shared.ui.Connect;

@Connect(FormCheckBox.class)
public class FormCheckBoxConnector extends CheckBoxConnector {

    @Override
    public boolean delegateCaptionHandling() {
        return true;
    }

    @Override
    public void onStateChanged(final StateChangeEvent stateChangeEvent) {
        super.onStateChanged(stateChangeEvent);
        this.getWidget().setText(null);
    }
}
