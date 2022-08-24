package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String TAG = "메인 액티비티";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() 호출됨");

        EditText name_EditText = findViewById(R.id.name_EditText);
        EditText age_EditText = findViewById(R.id.age_EditText);
        Button button = findViewById(R.id.change_Btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                String name = name_EditText.getText().toString();
//                String age = age_EditText.getText().toString();
//
//                Intent i = new Intent(MainActivity.this,SecondActivity.class);
//                i.putExtra("이름",name);
//                i.putExtra("나이",age);
//                Log.d(TAG, "putExtra 이름 : " + name);
//                Log.d(TAG, "putExtra 나이 : " + age);
//                startActivity(i);

                Intent i = new Intent(MainActivity.this, TestActivity.class);
                startActivity(i);

            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart() 호출됨");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume() 호출됨");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause() 호출됨");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop() 호출됨");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart() 호출됨");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy() 호출됨");
    }

}
