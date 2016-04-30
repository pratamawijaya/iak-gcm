package com.pratamawijaya.testgooglecloudmessaging.gcm.register;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by pratama on 4/30/16.
 */
public class GCMRegisterBroadcastReceiver extends BroadcastReceiver {
  @Override public void onReceive(Context context, Intent intent) {
    String gcmId = intent.getExtras().getString("registration_id");
    Log.d("debug", "gcm id :" + gcmId);
  }
}
