package com.nayak.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class simple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        Intent myintent1 =  new Intent();
    }
    EditText p, t, r;
    TextView simpl;
    public void sim(View view) {
        p = findViewById(R.id.principal);
        t = findViewById(R.id.time);
        r = findViewById(R.id.rate);
        simpl = findViewById(R.id.si);
        double pr = Double.parseDouble(p.getText().toString());
        double tr = Double.parseDouble(t.getText().toString());
        double rr = Double.parseDouble(r.getText().toString());
        double sint = pr * tr * rr / 100;
        String i = "S.I.: "+ sint;
        simpl.setText(i);


    }
}