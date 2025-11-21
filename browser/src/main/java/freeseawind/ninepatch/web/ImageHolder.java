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
package freeseawind.ninepatch.web;

import org.teavm.jso.dom.html.HTMLImageElement;

public class ImageHolder {
	private int imageWidth;
	private int imageHeight;
	private org.teavm.jso.dom.html.HTMLImageElement image;

	public ImageHolder(int imageWidth, int imageHeight, HTMLImageElement image) {
		super();
		this.imageWidth = imageWidth;
		this.imageHeight = imageHeight;
		this.image = image;
	}
	public org.teavm.jso.dom.html.HTMLImageElement getImage() {
		return image;
	}
	public void setImage(org.teavm.jso.dom.html.HTMLImageElement image) {
		this.image = image;
	}
	public int getImageWidth() {
		return imageWidth;
	}
	public void setImageWidth(int imageWidth) {
		this.imageWidth = imageWidth;
	}
	public int getImageHeight() {
		return imageHeight;
	}
	public void setImageHeight(int imageHeight) {
		this.imageHeight = imageHeight;
	}
}
