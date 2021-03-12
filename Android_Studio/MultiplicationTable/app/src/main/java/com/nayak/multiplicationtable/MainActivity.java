package com.nayak.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
EditText num;
TextView textView;
    public void table(View view) {
        num = findViewById(R.id.num);
        int tableOf =  Integer.valueOf(num.getText().toString());
        for(int i=1; i<=10; i++){
            String textid = "multiply" + i;
            int Id = this.getResources().getIdentifier(textid, "id", this.getPackageName());
            textView = findViewById(Id);

               String table = tableOf + " x " + i + " = " + tableOf * i;
               textView.setText(table);
        }
    }
}