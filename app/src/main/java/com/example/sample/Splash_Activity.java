package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Activity extends AppCompatActivity {
    TextView Splash;
    LottieAnimationView lottie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Splash=findViewById(R.id.Splash);
        lottie=findViewById(R.id.lottie);

        Intent ihome= new Intent(Splash_Activity.this, MainActivity.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              startActivity(ihome);
              finish();
            }
        },5000);


    }
}