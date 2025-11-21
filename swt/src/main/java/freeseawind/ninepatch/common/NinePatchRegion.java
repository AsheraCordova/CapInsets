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

import java.util.List;

/**
 *
 * @author freeseawind@github
 *
 */
public class NinePatchRegion
{
    private List<Region> fixRegions;
    private List<Region> patchRegions;

    public NinePatchRegion(List<Region> fixRegions, List<Region> patchRegions)
    {
        this.fixRegions = fixRegions;
        this.patchRegions = patchRegions;
    }

    public List<Region> getFixRegions()
    {
        return fixRegions;
    }

    public List<Region> getPatchRegions()
    {
        return patchRegions;
    }

    @Override
    public String toString()
    {
        return "NinePatchRegion [fixRegions=" + fixRegions + ", patchRegions="
                + patchRegions + "]";
    }
}
