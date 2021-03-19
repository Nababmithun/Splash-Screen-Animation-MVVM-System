package com.example.splashscreenanimation.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.splashscreenanimation.Data.AppConstants;
import com.example.splashscreenanimation.R;

import yanzhikai.textpath.AsyncTextPathView;

public class Splash_Screen extends AppCompatActivity {

    ImageView ivSplashImageBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        ivSplashImageBg = findViewById(R.id.iv_splash_bg_img);
        setImageWithGlide(ivSplashImageBg);
        AsyncTextPathView textPathView = findViewById(R.id.text_path);
        textPathView.startAnimation(0, 1);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, AppConstants.SPLASH_DURATION);

    }

    private void setImageWithGlide(ImageView imageView){
        Glide.with(this)
                .load(R.drawable.splash_screen)
                .apply(new RequestOptions().override(400, 600))
                .into(imageView);
    }

}