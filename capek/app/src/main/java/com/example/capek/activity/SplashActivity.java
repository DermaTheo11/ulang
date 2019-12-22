package com.example.capek.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_splash);



        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, WelcomeActivity.class));
                finish();
            }
        },3000);
    }
}
