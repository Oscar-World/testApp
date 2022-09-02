package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ApplyVisibleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply_visible);

        Button color_btn = findViewById(R.id.color_Btn);
        Button color_block = findViewById(R.id.color_Block);
        Button black_btn = findViewById(R.id.black_Btn);
        Button black_block = findViewById(R.id.black_Block);
        ImageView tiger1 = findViewById(R.id.tiger1);
        ImageView tiger2 = findViewById(R.id.tiger2);

        color_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                color_block.setVisibility(View.VISIBLE);
                color_btn.setVisibility(View.GONE);
                black_block.setVisibility(View.GONE);
                black_btn.setVisibility(View.VISIBLE);
                tiger1.setVisibility(View.VISIBLE);
                tiger2.setVisibility(View.GONE);

            }
        });

        black_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                black_block.setVisibility(View.VISIBLE);
                black_btn.setVisibility(View.GONE);
                color_block.setVisibility(View.GONE);
                color_btn.setVisibility(View.VISIBLE);
                tiger1.setVisibility(View.GONE);
                tiger2.setVisibility(View.VISIBLE);

            }
        });

    }
}