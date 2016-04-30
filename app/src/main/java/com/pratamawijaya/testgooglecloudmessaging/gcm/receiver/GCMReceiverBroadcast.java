package com.pratamawijaya.testgooglecloudmessaging.gcm.receiver;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by pratama on 4/30/16.
 */
public class GCMReceiverBroadcast extends WakefulBroadcastReceiver {
  @Override public void onReceive(Context context, Intent intent) {
    ComponentName componentName =
        new ComponentName(context.getPackageName(), GCMReceiverServices.class.getName());
    startWakefulService(context, (intent.setComponent(componentName)));
    setResultCode(Activity.RESULT_OK);
  }
}
