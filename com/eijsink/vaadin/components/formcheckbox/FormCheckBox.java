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

package com.eijsink.vaadin.components.formcheckbox;

import com.vaadin.data.Property;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.FormLayout;

/**
 * @author Auke te Winkel
 *
 *         {@link CheckBox} subclass which delegates caption handling to a
 *         parent component, such as a {@link FormLayout}.
 *
 */
public class FormCheckBox extends CheckBox {

    /**
     * Creates a new checkbox.
     */
    public FormCheckBox() {
        super();
    }

    /**
     * Creates a new checkbox with a set caption.
     *
     * @param caption
     *            the Checkbox caption.
     */
    public FormCheckBox(final String caption) {
        super(caption);
    }

    /**
     * Creates a new checkbox with a caption and a set initial state.
     *
     * @param caption
     *            the caption of the checkbox
     * @param initialState
     *            the initial state of the checkbox
     */
    public FormCheckBox(final String caption, final boolean initialState) {
        super(caption, initialState);
    }

    /**
     * Creates a new checkbox that is connected to a boolean property.
     *
     * @param state
     *            the Initial state of the switch-button.
     * @param dataSource
     */
    public FormCheckBox(final String caption, final Property<?> dataSource) {
        super(caption, dataSource);
    }

}
