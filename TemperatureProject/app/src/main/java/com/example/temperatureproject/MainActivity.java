package com.example.temperatureproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get user input and convert to double, then calculate with formula provided and set text to output text view while button clicked
        findViewById(R.id.convert_button).setOnClickListener(v ->{
            ((TextView)findViewById(R.id.output_celsius_text_view)).setText(String.format("Temperature in Celsius is: %.2f",
                    ((Double.parseDouble(((EditText)findViewById(R.id.input_fahrenheit_edit_text)).getText().toString())) - 32) * 5/9));
        });
    }
}