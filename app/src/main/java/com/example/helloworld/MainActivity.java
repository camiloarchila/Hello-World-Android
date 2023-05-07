package com.example.helloworld;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello World");
        Log.i("What is the name of the layout file for the main activity?", "activity_main.xml");
        Log.i("What is the name of the string resource that specifies the application's name?", "applicationId");
        Log.i("Which tool do you use to create a new emulator?", "Device Manager");
        Log.i("MainActivity", "MainActivity layout is complete");
    }

}