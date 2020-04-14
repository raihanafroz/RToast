package com.example.rtoasty;

import android.content.Context;

import es.dmoral.toasty.Toasty;

public class RToastySuccess {
    public RToastySuccess(Context context, String msg) {
        Toasty.success(context, msg).show();
    }
    public RToastySuccess(Context context, String msg, int time) {
        Toasty.success(context, msg, time).show();
    }
//    public RToastySuccess(Context context, String msg) {
//        Toasty.success(context, msg, time).show();
//    }
}
