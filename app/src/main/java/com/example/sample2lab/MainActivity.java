package com.example.sample2lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String msg="Hello";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"The onCreate event");
    }
    @Override
    protected void onStart()//1
    {
        super.onStart();
        Log.d(msg,"The onStart event");
    }
    @Override
    protected void onResume()//2
    {
        super.onResume();
        Log.d(msg,"The onResume event");
    }
    @Override
    protected void onPause()//3
    {
        super.onPause();
        Log.d(msg,"The onStart event");
    }
    @Override
    protected void onRestart()//4
    {
        super.onRestart();
        Log.d(msg,"The onStart event");
    }
    @Override
    protected void onStop()//5
    {
        super.onStop();
        Log.d(msg,"The onStart event");
    }

    @Override
    protected void onDestroy()//6
    {
        super.onDestroy();
        Log.d(msg,"The onStart event");
    }



}