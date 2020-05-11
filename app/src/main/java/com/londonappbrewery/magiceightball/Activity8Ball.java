package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class Activity8Ball extends AppCompatActivity {

    private Button btnAsk;
    private ImageView imageView_decicion;

    private final int[] ballsArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity8_ball);

        inicializeComponents();

        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random nRandor = new Random();

                int number = nRandor.nextInt(5);

                imageView_decicion.setImageResource(ballsArray[number]);

            }
        });

    }


    private void inicializeComponents() {
        btnAsk = findViewById(R.id.btn_ask);
        imageView_decicion = findViewById(R.id.image_decicion);
    }
}
