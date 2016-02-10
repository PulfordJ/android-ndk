package com.android.gl2jni;

/**
 * Created by john on 09/02/16.
 */
public class NativeLibrary {
    static
    {
        System.loadLibrary("gl2jni");
    }

    public static native void init();
}
