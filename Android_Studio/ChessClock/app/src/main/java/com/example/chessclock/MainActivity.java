package com.example.chessclock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    TextView whiteClock, blackClock, timedOut, wMovesTextView, bMovesTextView;
    ImageButton pause;
    private SharedPreferences sharedPreferences;
    private static long START_TIME_IN_MILLIS = 100 ;

    private CountDownTimer wCountDownTimer;
    private CountDownTimer bCountDownTimer;

    private boolean wTimerRunning;
    private boolean bTimerRunning;

    private long wTimeLeftInMillis = START_TIME_IN_MILLIS;
    private long bTimeLeftInMillis = START_TIME_IN_MILLIS;

    private boolean wTimeOut;
    private boolean bTimeOut;

    private int wMoves;
    private int bMoves;

//    Boolean isWhiteTurn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        whiteClock = findViewById(R.id.textView1);
        blackClock = findViewById(R.id.textView2);
        timedOut = findViewById(R.id.timedOut);
        pause = findViewById(R.id.imageButton3);
        wMovesTextView = findViewById(R.id.wMoves);
        bMovesTextView = findViewById(R.id.bMoves);

        wTimeOut = false;
        bTimeOut = false;

        sharedPreferences = getSharedPreferences("START_TIME_IN_MILLIS", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong("KEY_START_TIME_IN_MILLIS", 60000);
        editor.apply();

        START_TIME_IN_MILLIS = sharedPreferences.getLong("KEY_START_TIME_IN_MILLIS", 600000);

        editor.putLong("KEY_wTimeLeftInMillis", START_TIME_IN_MILLIS);
        editor.putLong("KEY_bTimeLeftInMillis", START_TIME_IN_MILLIS);
        editor.apply();

        wTimeLeftInMillis = sharedPreferences.getLong("KEY_wTimeLeftInMillis", START_TIME_IN_MILLIS);
        bTimeLeftInMillis = sharedPreferences.getLong("KEY_bTimeLeftInMillis", START_TIME_IN_MILLIS);

    }



    public void playWhite(View view) {
//        tag == 1 then the button is green and the timer is stopped
//               change the tag of both clocks and start the countdown and stop the other countdown
//        tag == 0 then the button is red and the timer is running
//               do nothing
        if (whiteClock.getTag().toString().equals("1")){
            changeTag( "1");
            wStartTimer();
            bPauseTimer();
            wMoves++;
        }



    }

    public void playBlack(View view) {
        if (blackClock.getTag().toString().equals("1")){
            changeTag( "0");
            wPauseTimer();
            bStartTimer();
            bMoves++;
        }
    }

    public void startAgain(View view) {
        resetTimer();
    }

    public void restart(View view){
        resetTimer();
        timedOut.setVisibility(View.INVISIBLE);
    }

    public void pause(View view){
//        tag == 1 timer running
//        tag == 0 timer paused

        if (pause.getTag().toString().equals("1")) {
            wPauseTimer();
            bPauseTimer();
            pause.setTag("0");
            pause.setBackgroundResource(android.R.drawable.ic_media_play);
        }else if(pause.getTag().toString().equals("0")){
            pause.setTag("1");
            pause.setBackgroundResource(android.R.drawable.ic_media_pause);
            if (whiteClock.getTag().toString().equals("1")){
                changeTag( "1");
                wStartTimer();
                bPauseTimer();
            }
            if (blackClock.getTag().toString().equals("1")){
                changeTag( "0");
                wPauseTimer();
                bStartTimer();
            }
        }


    }

    public void settings(View view) {
//        Intent intent = new Intent(this, Preference.class);
//        startActivity(intent);
//
//        SharedPreferences shrd = getSharedPreferences("time", MODE_MULTI_PROCESS);
//        String t = shrd.getString("timeKey", "00000");
////        Toast.makeText(this, t, Toast.LENGTH_SHORT).show();
//        Log.d("TAG", "settings: " + t);
//
////        wTimeLeftInMillis = (long) Integer.getInteger(t);

        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }


    public void changeTag(@NonNull String whiteTag){
        if (whiteTag.equals("1")){
            whiteClock.setTag("0");
            blackClock.setTag("1");
            whiteClock.setBackground(this.getDrawable(R.color.red));
            blackClock.setBackground(this.getDrawable(R.color.green));
        }
        else if(whiteTag.equals("0")){
            whiteClock.setTag("1");
            blackClock.setTag("0");
            whiteClock.setBackground(this.getDrawable(R.color.green));
            blackClock.setBackground(this.getDrawable(R.color.red));
        }
    }


    private void wStartTimer(){
        wCountDownTimer = new CountDownTimer(wTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                wTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                wTimeOut = true;
                if(!bTimeOut){
                    timeOut("White");
                }
            }
        }.start();
        wTimerRunning = true;
    }

    private void wPauseTimer(){
        try {
            wCountDownTimer.cancel();
            wTimerRunning = false;
        }catch (Exception e){
            Log.d("TAG", "wPauseTimer: "+e);
        }

    }

    private void bStartTimer(){
        bCountDownTimer = new CountDownTimer(bTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                bTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                bTimeOut = true;
                if(!wTimeOut){
                    timeOut("Black");
                }
            }
        }.start();
    }

    private void bPauseTimer(){
        try {
            bCountDownTimer.cancel();
            bTimerRunning = false;
        }
        catch (Exception e){
            Log.d("TAG", "bPauseTimer: "+e);
        }

    }

    private void resetTimer(){
        try {
            wCountDownTimer.cancel();
            bCountDownTimer.cancel();
        }catch (Exception e){
            Log.d("TAG", "resetTimer: "+e);
        }


        wTimeLeftInMillis = START_TIME_IN_MILLIS;
        bTimeLeftInMillis = START_TIME_IN_MILLIS;

        wTimeOut = false;
        bTimeOut = false;

        updateCountDownText();
        if (whiteClock.getTag().toString().equals("1")){
            changeTag( "1");
        }else if (whiteClock.getTag().toString().equals("0")){
            changeTag( "0");

        }
    }

    private void updateCountDownText(){
        int wMinutes = (int) (wTimeLeftInMillis / 1000) / 60;
        int wSeconds = (int) (wTimeLeftInMillis / 1000) % 60;

        int bMinutes = (int) (bTimeLeftInMillis / 1000) / 60;
        int bSeconds = (int) (bTimeLeftInMillis / 1000) % 60;

        String wTimeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d",wMinutes, wSeconds );
        String bTimeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d",bMinutes, bSeconds );

        whiteClock.setText(wTimeLeftFormatted);
        blackClock.setText(bTimeLeftFormatted);

        wMovesTextView.setText(String.format("Moves: %d", wMoves));
        bMovesTextView.setText(String.format("Moves: %d", bMoves));

    }

    private void timeOut(String whoTimedOut){
        try {
            bCountDownTimer.cancel();
        }catch (Exception e) {
            Log.d("TAG", "timeOut: " + e);
        }
        try {
            wCountDownTimer.cancel();
        }catch (Exception e) {
            Log.d("TAG", "timeOut: " + e);
        }
        String outputMessage = whoTimedOut+" Timed Out Tap to restart";
        timedOut.setText(outputMessage);
        timedOut.setVisibility(View.VISIBLE);
    }


}