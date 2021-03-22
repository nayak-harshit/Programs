package com.nayak.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CustomRandomiser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_randomiser);
        Intent intent = new Intent();
    }
TextView textView;
    EditText editText;
    public void random(View view) {
        editText = findViewById(R.id.number);
        textView = findViewById(R.id.rand);
        int a = Integer.getInteger(editText.getText().toString());
        Random random = new Random();
        int b = Math.abs(a);
        int nu = random.nextInt(b);
        String nm = String.valueOf(b);
        textView.setText(nm);
    }
}