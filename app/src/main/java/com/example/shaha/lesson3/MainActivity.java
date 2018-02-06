package com.example.shaha.lesson3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_toEquation).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toEquat = new Intent(MainActivity.this, QuadraticActivity.class);
                startActivity(toEquat);
            }
        });

        findViewById(R.id.button_toMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMenu = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(toMenu);
            }
        });
        findViewById(R.id.button_screen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toScreen = new Intent(MainActivity.this, ScreenActivity.class);
                startActivity(toScreen);
            }
        });

    }
}
