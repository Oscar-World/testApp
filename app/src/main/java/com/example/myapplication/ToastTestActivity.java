package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        Button button = findViewById(R.id.toast_Btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(),"",Toast.LENGTH_SHORT);
                View toastLayout = getLayoutInflater().inflate(R.layout.toast_custom,null);
                toast.setView(toastLayout);
                toast.setGravity(Gravity.TOP|Gravity.LEFT,50,200);
                toast.show();

            }
        });

    }
}