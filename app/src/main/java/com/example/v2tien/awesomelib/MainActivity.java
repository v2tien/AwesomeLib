package com.example.v2tien.awesomelib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.v2tien.awesomelibrary.MyView;

public class MainActivity extends AppCompatActivity {

    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = findViewById(R.id.mv);
        myView.setHintEditText("Enter anything ... ");
    }
}
