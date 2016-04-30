package com.pratamawijaya.testgooglecloudmessaging.gcm.register;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

/**
 * Created by pratama on 4/30/16.
 */
public class GCMRegistrationIntentService extends IntentService {

  // projectID
  private String projectID = "85053556692";

  public GCMRegistrationIntentService() {
    super("Gcm Registration");
  }

  @Override protected void onHandleIntent(Intent intent) {
    try {
      InstanceID instanceID = InstanceID.getInstance(this);
      String gcmId = instanceID.getToken(projectID, GoogleCloudMessaging.INSTANCE_ID_SCOPE);
      Log.d("debug", "gcm id : " + gcmId);
    } catch (Exception e) {
      Log.e("error", e.getLocalizedMessage());
    }
  }
}
