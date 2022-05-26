package com.example.a10119176uts;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class SplashScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_2);

        getSupportActionBar().hide();
    }

    public void Walktrought (View view){
        Intent intent = new Intent(this, Walktrought.class);
        startActivity(intent);
    }
}

