package com.nayak.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Coin_Flip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin__flip);
        Intent intent = new Intent();
    }
        TextView coin;
        ImageView coinF;
    public void flip(View view) {
       coin = findViewById(R.id.flipcoin);
       coinF = findViewById(R.id.imageView);
        Random rand = new Random();
        boolean c = rand.nextBoolean();
        if(c){
              coin.setText("Heads");
              coinF.setImageResource(R.drawable.heads);
        }
        else{
            coin.setText("Tails");
            coinF.setImageResource(R.drawable.tails);
        }
    }
}