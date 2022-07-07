package com.example.calculatorpassingvalues;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onCalc(View v){
        EditText e1,e2;
        e1=(EditText) findViewById(R.id.en1);
        e2=(EditText) findViewById(R.id.en2);
        Intent obj;
        obj=new Intent(getApplicationContext(),SecondActivity.class);
        obj.putExtra("n1",e1.getText().toString());
        obj.putExtra("n2",e2.getText().toString());
        startActivity(obj);
    }
}