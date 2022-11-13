package com.example.mycinema;

import androidx.appcompat.app.AppCompatActivity;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 7ca075f (13/11/2022)
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
<<<<<<< HEAD
=======

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        });
        thread.start();
>>>>>>> 7ca075f (13/11/2022)
    }
}