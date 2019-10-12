package com.example.rocketsquirrel2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextPage(View view){
        Intent intent = new Intent(this, Instructions.class);
        String message = "I want some tea";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
