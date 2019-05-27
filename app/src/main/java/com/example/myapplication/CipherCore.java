package com.example.myapplication;

/* renamed from: net.idik.lib.cipher.so.CipherCore */
final class CipherCore {
    static {
        System.loadLibrary("cipher-lib");
        CipherCore.init();
    }

    /* renamed from: a */
    static String m2154a(String str) {
        return CipherCore.getString(str);
    }

    private static native String getString(String str);

    private static native void init();
}
