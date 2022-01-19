package com.example.chessclock;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView startOne, startTwo;
    long time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startOne = findViewById(R.id.textView1);
        startTwo = findViewById(R.id.textView2);
        time = 600000;

    }

    public void playOne(View view) {

        Log.d("TAG", "playOne: ");

        Log.d("TAG", "playOne: "+ startOne.getTag().toString());
        if(startOne.getTag().toString().equals("1")){
            //Green - timer is running
            Log.d("TAG", "playOne: green");
            startOne.setBackground(this.getDrawable(R.color.red));
            startTwo.setBackground(this.getDrawable(R.color.green));
            startOne.setTag("0");
            startTwo.setTag("1");



        }else{
            //Red - timer is stopped
            Log.d("TAG", "playOne: else");
          return;

        }

    }

    public void playTwo(View view) {
        Log.d("TAG", "playTwo: ");
        if(startTwo.getTag().toString().equals("1")){
            //Green

            startOne.setBackground(this.getDrawable(R.color.green));
            startTwo.setBackground(this.getDrawable(R.color.red));
            startOne.setTag("1");
            startTwo.setTag("0");
            Log.d("TAG", "playTwo: green");
        }else{
            //Red
            return;
//            startOne.setBackground(this.getDrawable(R.color.red));
//            startTwo.setBackground(this.getDrawable(R.color.green));
//            startOne.setTag("1");
//            startTwo.setTag("0");
//            Log.d("TAG", "playOne: red");

        }
    }
}