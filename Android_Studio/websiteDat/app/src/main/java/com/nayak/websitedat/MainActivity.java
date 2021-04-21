package com.nayak.websitedat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    TextView textView = findViewById(R.id.textView);

    public class background extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... strings) {
            Log.d("toto", "Running in Background");
            String result = "";
            URL url;
            HttpURLConnection connection;
            try {

                url = new URL(strings[0]);
                connection = (HttpURLConnection) url.openConnection();
                InputStream inputStream = connection.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                int data = inputStreamReader.read();
                while (data != -1) {
                    char c = (char) data;
                    result += c;
                    data = inputStreamReader.read();
                }

            }
            catch (Exception e){ Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();}
            return result;
        }


        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            textView.setText(s);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        background bg = new background();
//        bg.execute("https://www.codewithharry.com/");
    }

    public void button(View view){
        Toast.makeText(this, "ths is a toast", Toast.LENGTH_SHORT).show();
    }
}