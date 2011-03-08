/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.vcard;

import java.util.List;

/**
 * The class which just counts the number of vCard entries in the specified input.
 */
public class VCardEntryCounter implements VCardInterpreter {
    private int mCount;

    public int getCount() {
        return mCount;
    }

    @Override
    public void start() {
    }

    @Override
    public void end() {
    }

    @Override
    public void startEntry() {
    }

    @Override
    public void endEntry() {
        mCount++;
    }

    @Override
    public void startProperty() {
    }

    @Override
    public void endProperty() {
    }

    @Override
    public void propertyGroup(String group) {
    }

    @Override
    public void propertyName(String name) {
    }

    @Override
    public void propertyParamType(String type) {
    }

    @Override
    public void propertyParamValue(String value) {
    }

    @Override
    public void propertyValues(List<String> values) {
    }
}
