package com.example.calculatorpassingvalues;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
;
import androidx.appcompat.app.AppCompatActivity;

public class SumActivity extends AppCompatActivity {
    int a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sum);
        EditText t1,t2,t3;
        t1=(EditText)findViewById(R.id.tv1);
        t2=(EditText)findViewById(R.id.tv2);
        t3=(EditText)findViewById(R.id.tv3);
        Intent obj=getIntent();
        a=obj.getExtras().getInt("val1");
        b=obj.getExtras().getInt("val2");
        t1.setText("" +a);
        t2.setText("" +b);
        if(obj.getExtras().getString("op").equals("+")){
            t3.setText("Sum : "+ (a+b));
        }
        else{
            t3.setText("Difference : "+(a-b));
        }
    }
}