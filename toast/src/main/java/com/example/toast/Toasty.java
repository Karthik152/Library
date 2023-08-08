package com.example.toast;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void Toaster(Context context, String text) {
        System.out.println("tee" +text);
        Toast.makeText(context, "wq", Toast.LENGTH_SHORT).show();

    }
}
