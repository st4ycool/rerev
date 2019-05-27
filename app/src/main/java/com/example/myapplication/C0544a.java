package com.example.myapplication;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;

/* renamed from: com.asen.revtest.a */
public class C0544a {
    /* renamed from: a */
    public static boolean packetSignatureCheck(Context context) {
        try {
            for (Signature toCharsString : context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures) {
                if (toCharsString.toCharsString().contains(CipherClass.stringFromCipherA())) {
                    return true;
                }
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: b */
    public static byte[] packetSignatureIf(Context context) {
        Signature[] signatureArr;
        Signature[] signatureArr2 = new Signature[0];
        try {
            signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        } catch (NameNotFoundException e) {
            e.printStackTrace();
            signatureArr = signatureArr2;
        }
        return signatureArr.length != 1 ? new byte[0] : signatureArr[0].toByteArray();
    }
}
