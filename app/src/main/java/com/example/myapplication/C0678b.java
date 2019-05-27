package com.example.myapplication;

import android.support.p019v7.widget.RecyclerView.C0373a;
import android.support.p019v7.widget.RecyclerView.C0403x;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import butterknife.C0538R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.asen.revtest.b */
public class C0678b extends C0373a<C0677a> {
    /* renamed from: a */
    private List<keyValueStruct> arrayOfEntryStructs = new ArrayList();

    /* renamed from: com.asen.revtest.b$a */
    public class C0677a extends C0403x implements OnClickListener {
        /* renamed from: n */
        EditText editText1;
        /* renamed from: o */
        EditText editText2;
        /* renamed from: p */
        keyValueStruct structAnB;

        public C0677a(View view) {
            super(view);
            this.editText1 = (EditText) view.findViewById(2131165257);
            this.editText2 = (EditText) view.findViewById(2131165330);
            this.editText1.addTextChangedListener(new TextWatcher(C0678b.this) {
                public void afterTextChanged(Editable editable) {
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (C0677a.this.structAnB != null) {
                        C0677a.this.structAnB.stringA = C0677a.this.editText1.getText().toString();
                    }
                }
            });
            this.editText2.addTextChangedListener(new TextWatcher(C0678b.this) {
                public void afterTextChanged(Editable editable) {
                }

                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (C0677a.this.structAnB != null) {
                        C0677a.this.structAnB.stringB = C0677a.this.editText2.getText().toString();
                    }
                }
            });
            view.findViewById(2131165283).setOnClickListener(this);
        }

        /* renamed from: a */
        public void mo3144a(keyValueStruct keyValue) {
            this.structAnB = keyValue;
            this.editText1.setText(keyValue.getStringA());
            this.editText2.setText(keyValue.getStringB());
        }

        public void onClick(View view) {
            C0678b.this.arrayOfEntryStructs.remove(this.structAnB);
            C0678b.this.mo1214c();
        }
    }

    public C0678b() {
        this.arrayOfEntryStructs.add(new keyValueStruct());
    }

    /* renamed from: a */
    public int mo1199a() {
        return this.arrayOfEntryStructs.size();
    }

    /* renamed from: a */
    public void mo1204a(C0677a c0677a, int i) {
        c0677a.mo3144a((keyValueStruct) this.arrayOfEntryStructs.get(i));
    }

    /* renamed from: a */
    public void addToArrayOfEntries(keyValueStruct c0547c) {
        this.arrayOfEntryStructs.add(c0547c);
    }

    /* renamed from: c */
    public C0677a mo1201a(ViewGroup viewGroup, int i) {
        return new C0677a(LayoutInflater.from(viewGroup.getContext()).inflate(C0538R.layout.query_item, viewGroup, false));
    }

    /* renamed from: d */
    public List<keyValueStruct> mo3149d() {
        return this.arrayOfEntryStructs;
    }
}
