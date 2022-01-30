package com.example.factoriser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


    }

    public static boolean isFactor(int x, int n) {
        return x % n == 0;
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i - 2) == 0)
                return false;
        }

        return true;
    }

    public static int nextPrime(int a) {
        if (a < 2)
            return 2;
        int nextPrime = a + 1;
        boolean found = false;

        while (!found) {
            nextPrime++;
            if (isPrime(nextPrime))
                found = true;
        }
        return nextPrime;
    }

    public static ArrayList<Integer> primeFactorisation(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        int quot = n;


        int factor = 2;
        while (quot != 1) {
            if (isFactor(quot, factor)) {
                primeFactors.add(factor);
                quot = quot / factor;
            } else {
                factor = nextPrime(factor);
            }
        }
        return primeFactors;

    }

}