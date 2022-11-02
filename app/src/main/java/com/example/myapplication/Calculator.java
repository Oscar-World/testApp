package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    TextView result_Text, process_Text;

    Button no1_Btn, no2_Btn, no3_Btn, no4_Btn, no5_Btn, no6_Btn, no7_Btn, no8_Btn,
            no9_Btn, no0_Btn, plus_Btn, minus_Btn, division_Btn, multiplication_Btn,
            clear_Btn, erase_Btn, rest_Btn, point_Btn, change_Btn, calculate_Btn;

    View.OnClickListener Click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        setView();

        Click = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {

                    case R.id.no1_Btn: addNumber("1");
                        break;

                    case R.id.no2_Btn: addNumber("2");
                        break;

                    case R.id.no3_Btn: addNumber("3");
                        break;

                    case R.id.no4_Btn: addNumber("4");
                        break;

                    case R.id.no5_Btn: addNumber("5");
                        break;

                    case R.id.no6_Btn: addNumber("6");
                        break;

                    case R.id.no7_Btn: addNumber("7");
                        break;

                    case R.id.no8_Btn: addNumber("8");
                        break;

                    case R.id.no9_Btn: addNumber("9");
                        break;

                    case R.id.no0_Btn: addNumber("0");
                        break;

                    case R.id.plus_Btn: addOperator("+");
                        break;

                    case R.id.minus_Btn: addOperator("-");
                        break;

                    case R.id.multiplication_Btn: addOperator("*");
                        break;

                    case R.id.division_Btn: addOperator("/");
                        break;

                    case R.id.rest_Btn: addOperator("%");
                        break;

                    case R.id.clear_Btn: clear();
                        break;

                    case R.id.erase_Btn: erase();
                        break;

                    case R.id.change_Btn: changePM();
                        break;

                    case R.id.point_Btn: addPoint(".");
                        break;

                    case R.id.calculate_Btn: result();
                        break;

                }

            }
        };

    }

    void addNumber(String str) {
        process_Text.append(str);
    }

    void addOperator(String str) {
        process_Text.append(" " + str + " ");
    }

    void addPoint(String str) {
        process_Text.append(str);
    }

    void changePM() {

    }

    void erase() {

    }

    void clear() {
        result_Text.setText("");
        process_Text.setText("");
    }

    // 숫자 판별
    boolean isNumber(String str) {
        boolean result = true;
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            result = false;
        }
        return result;
    }

    void result() {

    }

    public void setView() {

        result_Text = findViewById(R.id.result_Text);
        process_Text = findViewById(R.id.process_Text);
//        no1_Btn = findViewById(R.id.no1_Btn);
//        no2_Btn = findViewById(R.id.no2_Btn);
//        no3_Btn = findViewById(R.id.no3_Btn);
//        no4_Btn = findViewById(R.id.no4_Btn);
//        no5_Btn = findViewById(R.id.no5_Btn);
//        no6_Btn = findViewById(R.id.no6_Btn);
//        no7_Btn = findViewById(R.id.no7_Btn);
//        no8_Btn = findViewById(R.id.no8_Btn);
//        no9_Btn = findViewById(R.id.no9_Btn);
//        no0_Btn = findViewById(R.id.no0_Btn);
//        plus_Btn = findViewById(R.id.plus_Btn);
//        minus_Btn = findViewById(R.id.minus_Btn);
//        multiplication_Btn = findViewById(R.id.multiplication_Btn);
//        division_Btn = findViewById(R.id.division_Btn);
//        clear_Btn = findViewById(R.id.clear_Btn);
//        erase_Btn = findViewById(R.id.erase_Btn);
//        rest_Btn = findViewById(R.id.rest_Btn);
//        point_Btn = findViewById(R.id.point_Btn);
//        change_Btn = findViewById(R.id.change_Btn);
//        calculate_Btn = findViewById(R.id.calculate_Btn);

        no1_Btn.setOnClickListener(Click);
        no2_Btn.setOnClickListener(Click);
        no3_Btn.setOnClickListener(Click);
        no4_Btn.setOnClickListener(Click);
        no5_Btn.setOnClickListener(Click);
        no6_Btn.setOnClickListener(Click);
        no7_Btn.setOnClickListener(Click);
        no8_Btn.setOnClickListener(Click);
        no9_Btn.setOnClickListener(Click);
        no0_Btn.setOnClickListener(Click);
        plus_Btn.setOnClickListener(Click);
        minus_Btn.setOnClickListener(Click);
        division_Btn.setOnClickListener(Click);
        multiplication_Btn.setOnClickListener(Click);
        rest_Btn.setOnClickListener(Click);
        point_Btn.setOnClickListener(Click);
        change_Btn.setOnClickListener(Click);
        clear_Btn.setOnClickListener(Click);
        erase_Btn.setOnClickListener(Click);
        calculate_Btn.setOnClickListener(Click);



    }

}