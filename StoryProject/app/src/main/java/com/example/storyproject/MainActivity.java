package com.example.storyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find button view and set on click listener
        (findViewById(R.id.display_button)).setOnClickListener(v ->{
            //Get user inputs while button clicked
            String name = ((EditText)findViewById(R.id.name_edit_text)).getText().toString();
            String age = ((EditText)findViewById(R.id.age_edit_text)).getText().toString();
            String city = ((EditText)findViewById(R.id.city_edit_text)).getText().toString();
            String college = ((EditText)findViewById(R.id.college_edit_text)).getText().toString();
            String profession = ((EditText)findViewById(R.id.profession_edit_text)).getText().toString();
            String animal = ((EditText)findViewById(R.id.animal_edit_text)).getText().toString();
            String petName = ((EditText)findViewById(R.id.pet_name_edit_text)).getText().toString();
            //Set up the story into the text view
            ((TextView)findViewById(R.id.story_text_view)).setText(String.format(
                    "There once was a person named %s who lived in %s. \nAt the age of " +
                    "%s, %s went to college at %s. %s graduated and went to work " +
                    "as a %s. Then, %s adopted a (n) %s named %s." +
                    "\nThey both lived happily ever after! ",name, city, age, name, college, name, profession, name, animal, petName));
        });
    }
}