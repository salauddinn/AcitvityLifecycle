package com.practice.com.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String tag="lifecycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(tag,"Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"Activity onStarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"Activity onResumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"Activity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"Activity onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"Activity onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"Activity onDestroy");
    }
}
