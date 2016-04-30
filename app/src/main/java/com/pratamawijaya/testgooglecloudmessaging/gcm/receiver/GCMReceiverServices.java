package com.pratamawijaya.testgooglecloudmessaging.gcm.receiver;

import android.os.Bundle;
import com.google.android.gms.gcm.GcmListenerService;

/**
 * Created by pratama on 4/30/16.
 */
public class GCMReceiverServices extends GcmListenerService {
  @Override public void onMessageReceived(String from, Bundle data) {
    super.onMessageReceived(from, data);
    bundle2string(data);
  }

  public static String bundle2string(Bundle bundle) {
    if (bundle == null) {
      return null;
    }
    String string = "Bundle{";
    for (String key : bundle.keySet()) {
      string += " " + key + " => " + bundle.get(key) + ";";
    }
    string += " }Bundle";
    return string;
  }
}
