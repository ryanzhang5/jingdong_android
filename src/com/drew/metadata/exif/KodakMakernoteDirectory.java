// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package com.drew.metadata.exif;

import com.drew.metadata.Directory;
import java.util.HashMap;

public class KodakMakernoteDirectory extends Directory
{

    public KodakMakernoteDirectory()
    {
    }

    public String getName()
    {
        return "Kodak Makernote";
    }

    protected HashMap getTagNameMap()
    {
        return _tagNameMap;
    }

    protected static final HashMap _tagNameMap = new HashMap();

}
