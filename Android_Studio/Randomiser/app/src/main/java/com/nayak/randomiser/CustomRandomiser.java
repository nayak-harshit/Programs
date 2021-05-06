package com.nayak.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        System.out.println("hello");

        editText = findViewById(R.id.number);
        textView = findViewById(R.id.randumNumberDisplay);
        System.out.println("hello2");
//        int a = Integer.getInteger(editText.getText().toString());
//        int a = 10;
//        int a = Integer.getInteger(editText.getText().toString());
        int bound = 0;
        System.out.println("hello3");
        System.out.println("THE Random number is "+bound);
        bound = Integer.valueOf(editText.getText().toString());
        System.out.println("THE Random number is "+bound);

        System.out.println("hello4");
        Random random = new Random();

        int nu = random.nextInt(bound);
        String str = ""+nu;
        textView.setText(str);

    }
}