package com.example.myapplication;

import java.nio.charset.Charset;

/* renamed from: org.a.a.a.a.a */
public class C0551a {
    /* renamed from: a */
    public static final Charset f1788a = C0552a.f1797f;
    /* renamed from: b */
    private static final char[] f1789b = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    /* renamed from: c */
    private static final char[] f1790c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    /* renamed from: d */
    private final Charset f1791d;

    /* renamed from: a */
    protected static int m2160a(char c, int i) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Illegal hexadecimal character ");
        stringBuilder.append(c);
        stringBuilder.append(" at index ");
        stringBuilder.append(i);
        throw new C0553b(stringBuilder.toString());
    }

    /* renamed from: a */
    public static byte[] m2161a(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new C0553b("Odd number of characters.");
        }
        byte[] bArr = new byte[(length >> 1)];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            i++;
            i++;
            bArr[i2] = (byte) (((C0551a.m2160a(cArr[i], i) << 4) | C0551a.m2160a(cArr[i], i)) & 255);
            i2++;
        }
        return bArr;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[charsetName=");
        stringBuilder.append(this.f1791d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
