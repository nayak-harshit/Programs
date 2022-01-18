package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;
    int time;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textView = findViewById(R.id.textView);
       editText = findViewById(R.id.editText);

//        CountDownTimer countDownTimer = new CountDownTimer(10000,1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                textView.setText(String.valueOf(millisUntilFinished/1000));
//                Log.d("TAG", "onTick:"+millisUntilFinished/1000);
//            }
//
//            @Override
//            public void onFinish() {
//                Log.d("TAG", "onFinish: finished");
//            }
//        };
//        countDownTimer.start();

    }

    public void timerRun(View view) {
        try {
            countDownTimer.cancel();
        }catch (Exception e){
            Log.d("TAG", "timerRun: "+e.toString());
        }

       time = Integer.parseInt(editText.getText().toString()) *1000;

       countDownTimer = new CountDownTimer(time, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
               textView.setText(String.valueOf(millisUntilFinished/1000));
//               textView.animate().x(10).setDuration(100)
            }

            @Override
            public void onFinish() {
                textView.setText("00");
            }
        };

        countDownTimer.start();

    }
}