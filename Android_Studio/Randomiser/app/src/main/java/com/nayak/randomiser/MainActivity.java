package com.nayak.randomiser;

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

    public void flipC(View view) {
        Intent intent = new Intent(this, Coin_Flip.class);
        startActivityForResult(intent, 0);
    }

    public void RollD(View view) {
        Intent intent = new Intent(this, RollDice.class);
        startActivityForResult(intent, 0);

    }

    public void to10(View view) {
        Intent intent = new Intent(this, to10from1.class);
        startActivityForResult(intent, 0);

    }

    public void custom(View view) {
        Intent intent = new Intent(this, CustomRandomiser.class);
        startActivityForResult(intent, 0);

    }


}