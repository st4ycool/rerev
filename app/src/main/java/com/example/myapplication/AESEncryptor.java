package com.example.myapplication;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: net.idik.lib.cipher.so.encrypt.AESEncryptor */
public final class AESEncryptor {
    /* renamed from: a */
    private static byte[] f1787a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0};

    private AESEncryptor() {
        throw new IllegalAccessException();
    }

    /* renamed from: a */
    private static SecretKeySpec m2157a(String str) {
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(str.getBytes("UTF-8"));
        return new SecretKeySpec(instance.digest(), "AES");
    }

    /* renamed from: a */
    private static byte[] m2158a(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    /* renamed from: b */
    private static byte[] m2159b(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(bArr));
        return instance.doFinal(bArr2);
    }

    public static String decrypt(String str, String str2) {
        String str3 = "";
        try {
            return new String(AESEncryptor.m2159b(AESEncryptor.m2157a(str), f1787a, Base64.decode(str2, 0)), "UTF-8");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str3;
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return str3;
        } catch (NoSuchPaddingException e3) {
            e3.printStackTrace();
            return str3;
        } catch (InvalidKeyException e4) {
            e4.printStackTrace();
            return str3;
        } catch (InvalidAlgorithmParameterException e5) {
            e5.printStackTrace();
            return str3;
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return str3;
        } catch (BadPaddingException e7) {
            e7.printStackTrace();
            return str3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    public static java.lang.String encrypt(java.lang.String r2, java.lang.String r3) {
        /*
        r2 = net.idik.lib.cipher.p027so.encrypt.AESEncryptor.m2157a(r2);	 Catch:{ NoSuchAlgorithmException -> 0x002f, UnsupportedEncodingException -> 0x002a, NoSuchPaddingException -> 0x0025, InvalidKeyException -> 0x0020, InvalidAlgorithmParameterException -> 0x001b, IllegalBlockSizeException -> 0x0016, BadPaddingException -> 0x0011 }
        r0 = f1787a;	 Catch:{ NoSuchAlgorithmException -> 0x002f, UnsupportedEncodingException -> 0x002a, NoSuchPaddingException -> 0x0025, InvalidKeyException -> 0x0020, InvalidAlgorithmParameterException -> 0x001b, IllegalBlockSizeException -> 0x0016, BadPaddingException -> 0x0011 }
        r1 = "UTF-8";
        r3 = r3.getBytes(r1);	 Catch:{ NoSuchAlgorithmException -> 0x002f, UnsupportedEncodingException -> 0x002a, NoSuchPaddingException -> 0x0025, InvalidKeyException -> 0x0020, InvalidAlgorithmParameterException -> 0x001b, IllegalBlockSizeException -> 0x0016, BadPaddingException -> 0x0011 }
        r2 = net.idik.lib.cipher.p027so.encrypt.AESEncryptor.m2158a(r2, r0, r3);	 Catch:{ NoSuchAlgorithmException -> 0x002f, UnsupportedEncodingException -> 0x002a, NoSuchPaddingException -> 0x0025, InvalidKeyException -> 0x0020, InvalidAlgorithmParameterException -> 0x001b, IllegalBlockSizeException -> 0x0016, BadPaddingException -> 0x0011 }
        goto L_0x0034;
    L_0x0011:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x0016:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x001b:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x0020:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x0025:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x002a:
        r2 = move-exception;
        r2.printStackTrace();
        goto L_0x0033;
    L_0x002f:
        r2 = move-exception;
        r2.printStackTrace();
    L_0x0033:
        r2 = 0;
    L_0x0034:
        if (r2 != 0) goto L_0x0039;
    L_0x0036:
        r2 = "";
        return r2;
    L_0x0039:
        r3 = 0;
        r2 = android.util.Base64.encodeToString(r2, r3);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: net.idik.lib.cipher.p027so.encrypt.AESEncryptor.encrypt(java.lang.String, java.lang.String):java.lang.String");
    }

    public static void setIv(String str) {
        try {
            f1787a = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
