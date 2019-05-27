package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.p019v7.app.C0713c;
import android.support.p019v7.widget.LinearLayoutManager;
import android.support.p019v7.widget.RecyclerView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.C0538R;
import butterknife.OnClick;
import java.util.HashMap;

public class MainActivity extends  {
    /* renamed from: o */
    private static final char[] f2856o = "0123456789ABCDEF".toCharArray();
    /* renamed from: m */
    C0678b f2857m;
    /* renamed from: n */
    C0549e f2858n;
    @BindView
    RecyclerView recycler;

    static {
        System.loadLibrary("native-lib");
    }

    /* renamed from: a */
    public static String obfuscatedCalculation(byte[] bArr) {          //wtf??
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            cArr[i3] = f2856o[i2 >>> 4];
            cArr[i3 + 1] = f2856o[i2 & 15];
        }
        return new String(cArr);
    }

    /* Access modifiers changed, original: protected */
    @OnClick
    public void calculateHash() {
        C0544a.packetSignatureCheck(this);
        HashMap hashMap = new HashMap();
        for (keyValueStruct c0547c : this.f2857m.mo3149d()) {
            if (!(c0547c.getStringA() == null || c0547c.getStringB() == null || c0547c.getStringA().length() <= 0)) {
                hashMap.put(c0547c.getStringA(), c0547c.getStringB());
            }
        }
        Toast.makeText(this, obfuscatedCalculation(this.f2858n.bitchFunction(hashMap)), 0).show();
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0538R.layout.activity_main);
        ButterKnife.m2141a((Activity) this);
        this.f2857m = new C0678b();
        this.recycler.setLayoutManager(new LinearLayoutManager(this));
        this.recycler.setAdapter(this.f2857m);
        this.f2858n = new C0679d(this);
    }

    /* Access modifiers changed, original: protected */
    @OnClick
    public void addEntry() {
        this.f2857m.addToArrayOfEntries(new keyValueStruct());
        this.f2857m.mo1214c(); //??
    }
}
