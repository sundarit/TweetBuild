package com.vadmin.tweet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();
        boolean checkConnection = new ApplicationUtility().checkConnection(this);
        if (checkConnection == true) {
            timer.schedule(new splash(), 3000);
        }
        else {
            Toast.makeText(SplashActivity.this,
                    "connection not found...plz check connection..Entering offline", Toast.LENGTH_SHORT).show();
            timer.schedule(new splash(), 3000);
        }

    }

    class splash extends TimerTask {
        @Override
        public void run() {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            finish();
            startActivity(i);
        }


    }
}
