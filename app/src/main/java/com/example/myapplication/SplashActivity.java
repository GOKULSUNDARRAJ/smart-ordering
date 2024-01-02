package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textView;
    private String textToType = "Smart Ordering";
    private int charIndex = 0;
    private static final int DELAY = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = findViewById(R.id.textView);


        final Handler handler = new Handler();


        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (charIndex <= textToType.length()) {
                    textView.setText(textToType.substring(0, charIndex));
                    charIndex++;
                    handler.postDelayed(this, DELAY);
                } else {

                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        }, DELAY);

        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        textView.startAnimation(fadeIn);
    }
}







