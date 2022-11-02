package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DrawActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        DrawBoard drawBoard = new DrawBoard(this);
        setContentView(R.layout.activity_draw);

        Button resetBtn = findViewById(R.id.reset_Btn);
        Button increaseBtn = findViewById(R.id.increase_Btn);
        Button decreaseBtn = findViewById(R.id.decrease_Btn);
        Button blackBtn = findViewById(R.id.black_Btn);
        Button redBtn = findViewById(R.id.red_Btn);
        Button blueBtn = findViewById(R.id.blue_Btn);
        Button greenBtn = findViewById(R.id.green_Btn);
        Button yellowBtn = findViewById(R.id.yellow_Btn);

        View.OnClickListener Click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {

                    case R.id.reset_Btn:

                        break;
                    case R.id.increase_Btn:
                        DrawBoard.radius += 2;
                        break;
                    case R.id.decrease_Btn:
                        DrawBoard.radius -= 2;
                        break;
                    case R.id.black_Btn:
                        DrawBoard.whatColor = 0;
                        break;
                    case R.id.red_Btn:
                        DrawBoard.whatColor = 1;
                        break;
                    case R.id.blue_Btn:
                        DrawBoard.whatColor = 2;
                        break;
                    case R.id.green_Btn:
                        DrawBoard.whatColor = 3;
                        break;
                    case R.id.yellow_Btn:
                        DrawBoard.whatColor = 4;
                        break;

                }

            }
        };

        resetBtn.setOnClickListener(Click);
        increaseBtn.setOnClickListener(Click);
        decreaseBtn.setOnClickListener(Click);
        blackBtn.setOnClickListener(Click);
        redBtn.setOnClickListener(Click);
        blueBtn.setOnClickListener(Click);
        greenBtn.setOnClickListener(Click);
        yellowBtn.setOnClickListener(Click);


    }

}