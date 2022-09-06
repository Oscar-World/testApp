package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);

        ImageView android = findViewById(R.id.android);
        Button button = findViewById(R.id.Button);
        Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        Animation scale = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        Animation translate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
        Animation mix = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.mix);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                android.startAnimation(rotate);
//                android.startAnimation(scale);
//                android.startAnimation(translate);
//                android.startAnimation(alpha);
                android.startAnimation(mix);

            }
        });


    }
}