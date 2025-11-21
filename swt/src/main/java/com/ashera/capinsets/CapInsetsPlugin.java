//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
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
 */
//end - license
package com.ashera.capinsets;

import com.ashera.converter.ConverterFactory;

public class CapInsetsPlugin  {
    public static void initPlugin() {
		ConverterFactory.registerCommandConverter(new CapInsetsCommandConverter("capInsets"));

    	//start - widgets
        com.ashera.widget.WidgetFactory.registerAttributableFor("View", new com.ashera.capinsets.CapInsetsViewImpl());
        //end - widgets
    }
}
