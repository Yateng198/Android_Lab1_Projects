package com.example.mathoperationsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double input_x;
    private double input_y;


    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the view of calculate button
        Button calculate_button = findViewById(R.id.calculate_button);
        calculate_button.setOnClickListener(v ->{
            //Get user input number X and parse it to double
            input_x = Double.parseDouble(((EditText)findViewById(R.id.first_number_edit_text)).getText().toString());
            //Get user input number Y and parse it to double
            input_y = Double.parseDouble(((EditText)findViewById(R.id.second_number_edit_text)).getText().toString());

            ((TextView)findViewById(R.id.addition_text_view)).setText(String.format("Addition of X + Y is: %.2f", input_x + input_y));
            ((TextView)findViewById(R.id.subtract_text_view)).setText(String.format("Subtract Y from X is: %.2f", input_x - input_y));
            ((TextView)findViewById(R.id.product_text_view)).setText(String.format("Product of X and Y is: %.2f", input_x * input_y));
            ((TextView)findViewById(R.id.divide_text_view)).setText(String.format("Divide X/Y is: %.2f", input_x / input_y));
        });

    }
}