package jni.nativelib;

public class NativeLibrary {
    static {
        System.loadLibrary("native");
    }

    public native void nativeMethod();
}
