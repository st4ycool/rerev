package com.example.myapplication;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import net.idik.lib.cipher.p027so.C0550a;
import org.p028a.p029a.p030a.C0553b;
import org.p028a.p029a.p030a.p031a.C0551a;

/* renamed from: com.asen.revtest.d */
public class C0679d implements C0549e<String, String> {
    /* renamed from: a */
    private static int f2532a = 4;
    /* renamed from: b */
    private WeakReference<Context> f2533b;

    /* renamed from: com.asen.revtest.d$1 */
    class C05481 implements Comparator {
        C05481() {
        }

        public int compare(Object obj, Object obj2) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            int i = 0;
            for (int i2 = 0; i2 < obj3.length(); i2++) {
                i = (((-i) + (i << 5)) + obj3.charAt(i2)) & -1;
            }
            if (C0679d.f2532a > 4) {
                long j;
                if (i > Integer.MAX_VALUE) {
                    j = ((long) i) - 4294967296L;
                } else if (i < Integer.MIN_VALUE) {
                    j = ((long) i) + 4294967296L;
                }
                i = (int) j;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < obj4.length(); i4++) {
                i3 = (((-i3) + (i3 << 5)) + obj4.charAt(i4)) & -1;
            }
            if (C0679d.f2532a > 4) {
                long j2;
                if (i3 > Integer.MAX_VALUE) {
                    j2 = ((long) i3) - 4294967296L;
                } else if (i3 < Integer.MIN_VALUE) {
                    j2 = ((long) i3) + 4294967296L;
                }
                i3 = (int) j2;
            }
            return i < i3 ? -1 : i > i3 ? 1 : 0;
        }
    }

    public C0679d(Context context) {
        this.f2533b = new WeakReference(context);
    }

    /* renamed from: a */
    private byte[] m3351a(String str, String str2, byte[] bArr) {
        if (str2.trim().length() == 0) {
            str2 = "dummy";
            //todo: sent it to log?
        }
        byte[] bytes = str2.getBytes();
        byte[] bytes2 = str.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] ^ bytes2[bytes[i] % bytes2.length]);
            bytes[i] = (byte) (bytes[i] ^ bArr[i % bArr.length]);
        }
        return bytes;
    }

    /* renamed from: a */
    public byte[] bitchFunction(Map<String, String> map) {
        if (map.size() == 0) {
            return new byte[0];
        }
        if (map.containsKey("user")) {
            return new byte[0];
        }
        TreeMap treeMap = new TreeMap(new C05481());
        for (Entry entry : map.entrySet()) {
            treeMap.put(entry.getKey().toString(), entry.getValue().toString());
            if (entry.getValue().toString().contains("M4")) {
                return new byte[0];
            }
        }
        byte[] bArr = null;
        try {
            bArr = C0551a.m2161a(CipherClass.stringFromCipherB().toCharArray());
        } catch (C0553b e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        for (String add : treeMap.keySet()) {
            arrayList.add(add);
        }
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr, "HmacSHA256"));
            for (Entry entry2 : treeMap.entrySet()) {
                instance.update(entry2.getKey().toString().getBytes());
                byte[] a = m3351a(entry2.getKey().toString(), entry2.getValue().toString(), bArr);
                instance.update(a);
                if (new String(a).equalsIgnoreCase("1n1#8lh#)7d?14\"1>w6'7`} 3&u</772")) {
                    return new byte[0];
                }
                instance.update(C0544a.packetSignatureIf((Context) this.f2533b.get()));
            }
            return instance.doFinal();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return new byte[0];
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return new byte[0];
        }
    }
}
