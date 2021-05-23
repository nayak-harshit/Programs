package com.nayak.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nayak.contacts.Data.MyDbHandler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDbHandler dbHandler = new MyDbHandler(MainActivity.this);

    }
}