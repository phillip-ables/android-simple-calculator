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
    private TextView control, result;
    //associate each variables with thier ids in the xml file
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupUIViews() {
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five  = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        div = (Button)findViewById(R.id.btndiv);
        mul = (Button)findViewById(R.id.btnmul);
        equal = (Button)findViewById(R.id.btnequal);
        clear = (Button)findViewById(R.id.btnclear);
        control = (TextView)findViewById(R.id.tvControl);
        result = (TextView)findViewById(R.id.tvResults);
    }
}
