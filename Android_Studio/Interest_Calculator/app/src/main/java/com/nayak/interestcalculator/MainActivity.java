package com.nayak.interestcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void si(View view) {
        Intent intent = new Intent(this, simple.class);
        startActivityForResult(intent, 0);
    }

    public void ci(View view) {
        Intent intent = new Intent(this, compound.class);
        startActivityForResult(intent, 0);

    }

    public void both(View view) {
        Intent intent = new Intent(this, both.class);
        startActivityForResult(intent, 0);

    }
}