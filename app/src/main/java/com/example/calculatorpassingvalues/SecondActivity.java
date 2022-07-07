package com.example.calculatorpassingvalues;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    public void onSum(View v){
        Intent obj=getIntent();
        String num1=obj.getExtras().getString("n1");
        String num2=obj.getExtras().getString("n2");
        a=Integer.parseInt(num1);
        b=Integer.parseInt(num2);
        Intent obj1=new Intent(getApplicationContext(),SumActivity.class);
        obj1.putExtra("val1",a);
        obj1.putExtra("val2",b);
        obj1.putExtra("op","+");
        startActivity(obj1);
    }
    public void onDifference(View v){
        Intent obj1 =new Intent(getApplicationContext(),SumActivity.class);
        Intent obj=getIntent();
        String num1=obj.getExtras().getString("n1");
        String num2=obj.getExtras().getString("n2");
        a=Integer.parseInt(num1);
        b=Integer.parseInt(num2);
        obj1.putExtra("val1",a);
        obj1.putExtra("val2",b);
        obj1.putExtra("op","-");
        startActivity(obj1);
    }

}