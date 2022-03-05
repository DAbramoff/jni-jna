package jni;

import jni.nativelib.NativeLibrary;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hey! This is Java!");
        NativeLibrary nativeLib = new NativeLibrary();
        nativeLib.nativeMethod();
    }
}
