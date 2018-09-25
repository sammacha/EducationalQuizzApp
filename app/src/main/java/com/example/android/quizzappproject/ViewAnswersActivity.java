package com.example.android.quizzappproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class ViewAnswersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_answers);
    }

    public void goHome(View view) {
        Intent gohome = new Intent(this, MainActivity.class);
        startActivity(gohome);
    }
}
