package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String TAG = "메인 액티비티";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() 호출됨");

        TextView name_Text = findViewById(R.id.name_Text);
        TextView age_Text = findViewById(R.id.age_Text);
        TextView nickname_Text = findViewById(R.id.nickname_Text);
        EditText name_EditText = findViewById(R.id.name_EditText);
        EditText age_EditText = findViewById(R.id.age_EditText);
        EditText nickname_EditText = findViewById(R.id.nickname_EditText);
        Button button = findViewById(R.id.apply_Btn);

        SharedPreferences sharedPreferences = getSharedPreferences("사용자 정보",MODE_PRIVATE);
        String userInfo = sharedPreferences.getString("정보","");
        String[] info = userInfo.split(",");

        String name = info[0];
        String age = info[1];
        String nickname = info[2];

        name_Text.setText(name);
        age_Text.setText(age);
        nickname_Text.setText(nickname);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = name_EditText.getText().toString();
                String age = age_EditText.getText().toString();
                String nickname = nickname_EditText.getText().toString();

                name_Text.setText(name);
                age_Text.setText(age);
                nickname_Text.setText(nickname);

                name_EditText.setText("");
                age_EditText.setText("");
                nickname_EditText.setText("");

                SharedPreferences sharedPreferences = getSharedPreferences("사용자 정보",MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("정보",name + "," + age + "," + nickname);
                editor.commit();

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
