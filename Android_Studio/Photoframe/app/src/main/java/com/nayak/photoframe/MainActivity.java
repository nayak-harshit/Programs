package com.nayak.photoframe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        ImageButton previous;
        ImageButton next;
        ImageView picture;

        int currentimg = 0;

    public void previous(View view) {

        String pic1 = "img" + currentimg;
        int id1 = this.getResources().getIdentifier(pic1,  "id", getPackageName());
        picture = findViewById(id1);
        picture.setAlpha(0f);

        currentimg = (4 + currentimg -1)% 4;
        String pic2 = "img" + currentimg;
        int id2 = this.getResources().getIdentifier(pic1,  "id", getPackageName());
        picture = findViewById(id2);
        picture.setAlpha(1f);

    }

    public void next(View view) {
        String pic1 = "img" + currentimg;
        int id1 = this.getResources().getIdentifier(pic1,  "id", getPackageName());
        picture = findViewById(id1);
        picture.setAlpha(0f);

        currentimg = (4 + currentimg +1)% 4;
        String pic2 = "img" + currentimg;
        int id2 = this.getResources().getIdentifier(pic1,  "id", getPackageName());
        picture = findViewById(id2);
        picture.setAlpha(1f);

    }


}