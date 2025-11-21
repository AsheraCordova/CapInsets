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
package freeseawind.ninepatch.common;



/**
 * ä¹�å®«æ ¼çš„æ¯�ä¸€åˆ—
 * @author freeseawind@github
 *
 */
public class Row implements Comparable<Row>
{
    private Rectangle rect;
    private Type type;

    public Row(Rectangle rect, Type type)
    {
        super();
        this.rect = rect;
        this.type = type;
    }

    public Rectangle getRectangle()
    {
        return rect;
    }

    public Type getType()
    {
        return type;
    }

    public int compareTo(Row o)
    {
        return Integer.compare(getRectangle().x, o.getRectangle().x);
    }

    @Override
    public String toString()
    {
        return "Row [row=" + rect + ", type=" + type + "]";
    }

    static enum Type
    {
        FIX, // å›ºå®šç±»åž‹
        HORIZONTALPATCH, // æ°´å¹³æ‹‰ä¼¸ç±»åž‹
        VERTICALPATCH, // åž‚ç›´æ‹‰ä¼¸ç±»åž‹
        TILEPATCH // å¹³é“ºç±»åž‹
    }


}
