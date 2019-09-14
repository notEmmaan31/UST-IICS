package com.falceso.falcesoemmanuellabactivity1;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class CottonPicker extends IntentService {
    public CottonPicker() {
        super("Cotton Picker: ");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 10; i++){
            Log.d("CottonPicker",(i) + "x cotton picked");
        }
    }
}
