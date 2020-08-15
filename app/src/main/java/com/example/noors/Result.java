package com.example.noors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button home;
    TextView risk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        home = (Button) findViewById(R.id.homeBtn);
        risk = (TextView) findViewById(R.id.riskFactor);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
                finishActivity(1);
            }
        });

//TODO data comes from database
        // for high risk :
//        risk.setText(R.string.high_risk);
        //for medium risk:
//        risk.setText(R.string.medium_risk);
        // for low risk:
//        risk.setText(R.string.low_risk);



    }
}