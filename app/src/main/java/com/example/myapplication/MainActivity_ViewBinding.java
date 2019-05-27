package com.example.myapplication;

import android.support.p019v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.p026a.C0542a;
import butterknife.p026a.C0543b;

public class MainActivity_ViewBinding implements Unbinder {
    /* renamed from: b */
    private MainActivity f2524b;
    /* renamed from: c */
    private View f2525c;
    /* renamed from: d */
    private View f2526d;

    public MainActivity_ViewBinding(final MainActivity mainActivity, View view) {
        this.f2524b = mainActivity;
        mainActivity.recycler = (RecyclerView) C0543b.m2146a(view, 2131165279, "field 'recycler'", RecyclerView.class);
        View a = C0543b.m2145a(view, 2131165210, "method 'addEntry'");
        this.f2525c = a;
        a.setOnClickListener(new C0542a() {
            /* renamed from: a */
            public void mo2190a(View view) {
                mainActivity.addEntry();
            }
        });
        view = C0543b.m2145a(view, 2131165303, "method 'calculateHash'");
        this.f2526d = view;
        view.setOnClickListener(new C0542a() {
            /* renamed from: a */
            public void mo2190a(View view) {
                mainActivity.calculateHash();
            }
        });
    }
}
