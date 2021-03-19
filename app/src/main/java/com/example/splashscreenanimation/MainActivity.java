package com.example.splashscreenanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variable
    private TextView bTextView;
    private EditText eEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Method
        gotToMain();

    }

    private void gotToMain() {
        Intent intent=new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }


}