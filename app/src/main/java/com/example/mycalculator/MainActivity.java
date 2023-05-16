package com.example.mycalculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.MissingFormatArgumentException;


public class MainActivity extends AppCompatActivity  {
    TextView textView = findViewById(R.id.textView2);
    EditText n1 = findViewById(R.id.n1);
    EditText n2 = findViewById(R.id.n2);
   Button button = findViewById(R.id.button6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Float result = Float.parseFloat(n1.getText().toString()) + Float.parseFloat(n2.getText().toString());
                textView.setText("The result is "+result);

            }
        });


    }
}