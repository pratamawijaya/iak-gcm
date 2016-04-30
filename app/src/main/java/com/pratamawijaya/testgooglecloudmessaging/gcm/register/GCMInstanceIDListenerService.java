package com.pratamawijaya.testgooglecloudmessaging.gcm.register;

import android.content.Intent;
import com.google.android.gms.iid.InstanceIDListenerService;

/**
 * Created by pratama on 4/30/16.
 */
public class GCMInstanceIDListenerService extends InstanceIDListenerService {
  @Override public void onTokenRefresh() {
    super.onTokenRefresh();
    Intent intent = new Intent(this, GCMRegistrationIntentService.class);
    startService(intent);
  }
}
