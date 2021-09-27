package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    public void clickFunction(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        String mt1 = myTextField1.getText().toString();
        String mt2 = myTextField2.getText().toString();
        int num1 = Integer.parseInt(mt1);
        int num2 = Integer.parseInt(mt2);
        int answer = num1+num2;
        goToActivity2(answer);
    }

    public void clickFunction1(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        String mt1 = myTextField1.getText().toString();
        String mt2 = myTextField2.getText().toString();
        int num1 = Integer.parseInt(mt1);
        int num2 = Integer.parseInt(mt2);
        int answer = num1-num2;
        goToActivity2(answer);
    }

    public void clickFunction2(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        String mt1 = myTextField1.getText().toString();
        String mt2 = myTextField2.getText().toString();
        int num1 = Integer.parseInt(mt1);
        int num2 = Integer.parseInt(mt2);
        int answer = num1*num2;
        goToActivity2(answer);
    }

    public void clickFunction3(View view){
        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);

        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        String mt1 = myTextField1.getText().toString();
        String mt2 = myTextField2.getText().toString();

        int num1 = Integer.parseInt(mt1);
        int num2 = Integer.parseInt(mt2);
        int answer = num1/num2;
        goToActivity2(answer);
    }



    public void goToActivity2(int num){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("MY_KEY",num);
        startActivity(intent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}