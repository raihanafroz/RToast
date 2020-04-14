package com.example.rtoasty;

import android.content.Context;
import es.dmoral.toasty.Toasty;

public class Success {
    public Success(Context context, String string) {
        Toasty.success(context, string, Toasty.LENGTH_SHORT).show();
    }
}
