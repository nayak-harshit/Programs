package com.nayak.randomiser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class RollDice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roll_dice);
        Intent intent = new Intent();
    }
    ImageView dice;
    TextView dnum;
    public void roll(View view) {
        dice = findViewById(R.id.imageView);
        dnum = findViewById(R.id.rollDice);
        Random r = new Random();
        int rll = r.nextInt(6);
        System.out.println("1");
        switch (rll) {
            case 0:
                dice.setImageResource(R.drawable.dice1);
                dnum.setText("1");
                break;
            case 1:
                dice.setImageResource(R.drawable.dice2);
                dnum.setText("2");
                break;
            case 2:
                dice.setImageResource(R.drawable.dice3);
                dnum.setText("3");
                break;
            case 3:
                dice.setImageResource(R.drawable.dice4);
                dnum.setText("4");
                break;
            case 4:
                dice.setImageResource(R.drawable.dice5);
                dnum.setText("5");
                break;
            case 5:
                dice.setImageResource(R.drawable.dice6);
                dnum.setText("6");
                break;
            default:
                break;
        }
//        String randdice = "dice"+ (rll+1);
//        System.out.println("2");
//        int imgviewid = this.getResources().getIdentifier(randdice, "drawable", this.getPackageName());
//        System.out.println("3");
//        System.out.println(imgviewid);
//        dice.setImageResource(imgviewid);
//        dnum.setText(rll+1);
        }
    }
