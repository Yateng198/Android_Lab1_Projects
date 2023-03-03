package com.example.reversestringproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputString_Edit_Text;
    private TextView reverseString_Text_View;
    private Button reverseString_Button;
    private String inputString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the view of reverseString_Button
        reverseString_Button = (Button) findViewById(R.id.reverse_string_button);
        reverseString_Button.setOnClickListener(v -> {
                //a, Read content of inputString_Edit_Text
                inputString_Edit_Text = (EditText) findViewById(R.id.input_string_edit_ext);
                inputString = inputString_Edit_Text.getText().toString();
                //b, Do the reverse(as in java)
                reverseString_Text_View = (TextView) findViewById((R.id.reverse_string_text_view));
                //c, Display the reversed content using reverseString_Text_View
                reverseString_Text_View.setText(reverseString(inputString));

//                ((TextView)findViewById(R.id.reverse_string_text_view)).setText(reverseString(((EditText) findViewById(R.id.input_string_edit_ext)).getText().toString()));

        });
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }


}