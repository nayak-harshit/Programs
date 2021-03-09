package com.nayak.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class compound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound);
        Intent intent = getIntent();
    }
    EditText p, t, r;
    TextView cimpl;

    public void cim(View view) {
        p = findViewById(R.id.principal);
        t = findViewById(R.id.time);
        r = findViewById(R.id.rate);
        cimpl = findViewById(R.id.ci);
        double pr = Double.parseDouble(p.getText().toString());
        double tr = Double.parseDouble(t.getText().toString());
        double rr = Double.parseDouble(r.getText().toString());
        double cimr = (pr * (Math.pow((1 + rr/100), tr)))-pr;
        String i = "C.I.: "+ cimr;
        cimpl.setText(i);
    }
}