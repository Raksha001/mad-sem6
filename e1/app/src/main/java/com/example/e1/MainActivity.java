package com.example.e1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView T1;
    Button B1,B2,B3;
    float font = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1 = findViewById(R.id.textView);
        B1 = findViewById(R.id.button);
        B2 = findViewById(R.id.button2);
        B3 = findViewById(R.id.button3);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(font == 25){
                    font=50;
                }
                else font +=5;
                T1.setTextSize(font);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setTextColor(Color.RED);
            }
        });

        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T1.setTypeface(Typeface.MONOSPACE);
            }
        });
    }}
