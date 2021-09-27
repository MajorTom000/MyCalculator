package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = (TextView) findViewById(R.id.testView2);
        Intent intent = getIntent();
        int num = intent.getExtras().getInt("MY_KEY");
        textView2.setText(String.valueOf(num));
    }
}