package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VisibleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visible);

        TextView text_A = findViewById(R.id.A_text);
        TextView text_B = findViewById(R.id.B_text);
        Button btn_A = findViewById(R.id.A_btn);
        Button btn_B = findViewById(R.id.B_btn);

        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_A.setVisibility(View.VISIBLE);
                text_B.setVisibility(View.GONE);

            }
        });

        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                text_A.setVisibility(View.GONE);
                text_B.setVisibility(View.VISIBLE);

            }
        });


        Button next = findViewById(R.id.next_btn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VisibleActivity.this,ApplyVisibleActivity.class);
                startActivity(i);
            }
        });

    }
}