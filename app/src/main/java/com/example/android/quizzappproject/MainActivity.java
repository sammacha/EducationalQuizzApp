package com.example.android.quizzappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateTotalScore(View  view) {
        int totalScore = 0;
        String userAnswer;

        /** Correct answers to the questions */
        RadioButton rbqtn2 = (RadioButton) findViewById(R.id.new_radio);
        RadioButton rbqtn4 = (RadioButton) findViewById(R.id.true_radio);
        RadioButton rbqtn5 = (RadioButton) findViewById(R.id.object_button);
        CheckBox cbqtn3 = (CheckBox) findViewById(R.id.int_checkbox);
        CheckBox cbqtn3b = (CheckBox) findViewById(R.id.string_checkbox);
        EditText tvqtn1 = (EditText) findViewById(R.id.user_input);
        userAnswer = tvqtn1.getText().toString();

        if (rbqtn2.isChecked()) {
            totalScore += 1;
        }
        if (rbqtn4.isChecked()) {
            totalScore += 1;
        }
        if (rbqtn5.isChecked()) {
            totalScore += 1;
        }
        if (cbqtn3.isChecked()) {
            totalScore += 1;
        }
        if (cbqtn3b.isChecked()) {
            totalScore += 1;
        }
        if (userAnswer.equalsIgnoreCase("java")) {
            totalScore += 1;
        }

        Intent submitIntent = new Intent(MainActivity.this, ViewAnswersActivity.class);
        Toast.makeText(this, "You have scored " + totalScore, Toast.LENGTH_SHORT).show();
        startActivity(submitIntent);
    }
}
