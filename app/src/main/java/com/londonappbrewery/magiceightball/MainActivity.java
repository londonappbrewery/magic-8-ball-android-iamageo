package com.londonappbrewery.magiceightball;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                open8ball();
            }
        }, 2000);
    }

    private void open8ball() {
        Intent intent = new Intent(MainActivity.this, Activity8Ball.class);
        startActivity(intent);
        finish();
    }
}
