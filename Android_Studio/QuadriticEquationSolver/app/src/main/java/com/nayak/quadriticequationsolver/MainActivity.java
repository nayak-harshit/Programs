package com.nayak.quadriticequationsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inpA, inpB, inpC;
    TextView root1,  root2, warning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inpA = findViewById(R.id.inputA);
        inpB = findViewById(R.id.inputB);
        inpC = findViewById(R.id.inputC);

        root1 = findViewById(R.id.root1);
        root2 = findViewById(R.id.root2);
        warning = findViewById(R.id.warning);

    }

    public void solveQuad(View view){


        double a = Double.parseDouble(inpA.getText().toString());
        double b = Double.parseDouble(inpB.getText().toString());
        double c = Double.parseDouble(inpC.getText().toString());

        if (a == 0){
            warning.setText("Not a quadritic equation");
            return;
        }

        double v1 = (b * b) - 4 * a * c;
        double v = Math.sqrt(v1);
        if(v1 == 0){
            warning.setText("This is a perfect square");
        }
        else if(v1>0){
            warning.setText("Roots are different and real");
        }
        else{
            warning.setText("Roots are not real.");
        }

        double soln1 = (-v -b)/2*a;
        double soln2 = (v -b)/2*a;

        System.out.println(soln1);
        System.out.println(soln2);


        root1.setText(String.valueOf(soln1));
        root2.setText(String.valueOf(soln2));



    }

}