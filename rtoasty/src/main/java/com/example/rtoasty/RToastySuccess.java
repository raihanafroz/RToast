package com.example.rtoasty;

import android.content.Context;

import es.dmoral.toasty.Toasty;

public class RToastySuccess {
    public RToastySuccess(Context context, String msg) {
        Toasty.success(context, msg);
    }
}
