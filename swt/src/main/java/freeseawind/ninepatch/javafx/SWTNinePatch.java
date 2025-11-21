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
package freeseawind.ninepatch.javafx;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;

import freeseawind.ninepatch.common.AbstractNinePatch;
import freeseawind.ninepatch.common.CapInsets;
import freeseawind.ninepatch.common.RepeatType;

/**
 *
 * @author freeseawind@github
 *
 */
public class SWTNinePatch extends AbstractNinePatch<ImageHolder, GC> {
    private Transform tr;
    public SWTNinePatch(ImageHolder image) {
        super(image, null);
        tr = new Transform(Display.getDefault());
    }


    public SWTNinePatch(ImageHolder image, RepeatType repeatType) {
        super(image, repeatType);
        tr = new Transform(Display.getDefault());
    }


    public SWTNinePatch(ImageHolder image, CapInsets capInsets) {
        super(image, null, capInsets);
        tr = new Transform(Display.getDefault());
    }


    @Override
    public int[] getPixels(ImageHolder img, int x, int y, int w, int h) {
        int[] pixels = new int[w * h];
        ImageData reader = img.image.getImageData();
        reader.getPixels(x, y, w, pixels, 0);
        return pixels;
    }


    @Override
    public int getImageWidth(ImageHolder img) {
        return img.image.getImageData().width;
    }


    @Override
    public int getImageHeight(ImageHolder img) {
        return img.image.getImageData().height;
    }


    @Override
    public void translate(GC g2d, int x, int y) {        
        tr.translate(x, y);
        g2d.setTransform(tr);
    }


    @Override
    public void drawImage(GC g2d, ImageHolder image, int x, int y, int scaledWidth, int scaledHeight) {
        g2d.setAntialias(org.eclipse.swt.SWT.ON);
        g2d.setInterpolation(org.eclipse.swt.SWT.HIGH);
        g2d.drawImage(image.image, x, y, image.control.getBounds().width, image.control.getBounds().height, scaledWidth * x/image.control.getBounds().width, 
                scaledHeight * y/image.control.getBounds().height, scaledWidth, scaledHeight);
    }


    @Override
    public void drawImage(GC g2d, ImageHolder image, int sx, int sy, int sw, int sh, int dx, int dy, int dw,
            int dh) {
        g2d.setAntialias(org.eclipse.swt.SWT.ON);
        g2d.setInterpolation(org.eclipse.swt.SWT.HIGH);
        g2d.drawImage(image.image, sx, sy, sw, sh, dx, dy, dw, dh);
    }
    
    public void dispose() {
        tr.dispose();
    }
}
