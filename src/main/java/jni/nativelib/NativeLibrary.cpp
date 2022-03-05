#include "nativelib_NativeLibrary.h"
#include <iostream>

JNIEXPORT void JNICALL Java_nativelib_NativeLibrary_nativeMethod (JNIEnv *, jobject)
{
    std::cout << "Hey! This is C++!" << std::endl;
}