package com.example.techtron.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //assign variables for each of those widget
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private Button add, sub, div, mul;
    private Button equal, clear;
    private TextView info, result;
    //associate each variables with thier ids in the xml file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
