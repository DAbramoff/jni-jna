package jna;

import com.sun.jna.Native;
import com.sun.jna.Platform;

public class Main {
    public static void main(String[] args) {
        CMath lib = Native.load(Platform.isWindows()?"msvcrt":"c", CMath.class);
        double sin = lib.sin(0);
        System.out.println("Sin(0): " + sin);
        double cos = lib.cos(0);
        System.out.println("Cos(0): " + cos);
    }
}
