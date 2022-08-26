package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    int clickNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView textView = findViewById(R.id.textView);
        Button button_1 = findViewById(R.id.button_1);
        Button button_10 = findViewById(R.id.button_10);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickNum += 1;
                textView.setText("Click : " + clickNum);

            }
        });

        button_10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                clickNum += 10;
                textView.setText("Click : " + clickNum);
                return true;
            }
        });

    }
}