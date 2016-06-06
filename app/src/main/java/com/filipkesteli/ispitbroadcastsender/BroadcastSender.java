package com.filipkesteli.ispitbroadcastsender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BroadcastSender extends BroadcastReceiver {

    public static final String PARAMETER_KEY = "Pozdrav";
    public static final String PARAMETER_VALUE = "Buon Voyage";
    public static final String INTENT_RECEIVER_NAME = "com.filipkesteli.ispitbroadcastsender";

    public BroadcastSender() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

    }
}
