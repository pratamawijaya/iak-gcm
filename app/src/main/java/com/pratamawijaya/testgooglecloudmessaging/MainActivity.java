package com.pratamawijaya.testgooglecloudmessaging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.pratamawijaya.testgooglecloudmessaging.gcm.register.GCMRegistrationIntentService;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // run gcm service
    startService(new Intent(this, GCMRegistrationIntentService.class));
  }
}
