    package com.example.noors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class Dashboard extends AppCompatActivity {

    TextView activeCases, newCases, deaths, recovered;
    Button settings, survey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        survey = (Button) findViewById(R.id.surveyBtn);

        survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Survey.class);
                startActivity(intent);
                finishActivity(1);
            }
        });

    }
}