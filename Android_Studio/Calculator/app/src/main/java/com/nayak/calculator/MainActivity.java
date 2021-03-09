package com.nayak.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText num1, num2;
    TextView result;



    public void sum(View v) {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        result = findViewById(R.id.result_of_operation);

//        long n1 = Long.getLong(String.valueOf(num1.getText()));
//        long n2 = Long.getLong(String.valueOf(num2.getText()));
//        result.setText((int) (n1 + n2));

        double n1 = Double.parseDouble(String.valueOf(num1.getText()));
        double n2 = Double.parseDouble(String.valueOf(num2.getText()));
        String res = String.valueOf(n1 + n2);
        result.setText(res);
    }


    public void sub(View v) {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        result = findViewById(R.id.result_of_operation);

//        long n1 = Long.getLong(String.valueOf(num1.getText()));
//        long n2 = Long.getLong(String.valueOf(num2.getText()));
//        result.setText((int) (n1 - n2));
        double n1 = Double.parseDouble(String.valueOf(num1.getText()));
        double n2 = Double.parseDouble(String.valueOf(num2.getText()));
        String res = String.valueOf(n1 - n2);
        result.setText(res);
    }

    public void multiply(View v) {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        result = findViewById(R.id.result_of_operation);

//        long n1 = Long.getLong(String.valueOf(num1.getText()));
//        long n2 = Long.getLong(String.valueOf(num2.getText()));
//        result.setText((int) (n1 * n2));
        double n1 = Double.parseDouble(String.valueOf(num1.getText()));
        double n2 = Double.parseDouble(String.valueOf(num2.getText()));
        String res = String.valueOf(n1 * n2);
        result.setText(res);
    }

    public void divide(View v) {
        num1 = findViewById(R.id.number1);
        num2 = findViewById(R.id.number2);
        result = findViewById(R.id.result_of_operation);

//        long n1 = Long.getLong(String.valueOf(num1.getText()));
//        long n2 = Long.getLong(String.valueOf(num2.getText()));
//        result.setText(Long.toString(n1/n2));

        double n1 = Double.parseDouble(String.valueOf(num1.getText()));
        double n2 = Double.parseDouble(String.valueOf(num2.getText()));
        String res = String.valueOf(n1 / n2);
        result.setText(res);

    }
}