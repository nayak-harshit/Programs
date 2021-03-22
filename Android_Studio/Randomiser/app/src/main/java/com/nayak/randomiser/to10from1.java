package com.nayak.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class to10from1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to10from1);
        Intent myintent = new Intent();
    }
        TextView textView;
    public void to10rnd(View view) {
        textView = findViewById(R.id.num);
        Random random = new Random();
        int number = random.nextInt(10);
        String n = String.valueOf(number+1);
        textView.setText(n);

    }
}