package com.nayak.jokes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
        TextView joke, punchLine;
    String fullJoke;
    ProgressBar progressBar ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        joke = findViewById(R.id.jokes);
        punchLine = findViewById(R.id.punchline);
        progressBar = findViewById(R.id.progressBar);
        getJokeNet();
    }

        public void getJokeNet(){
        progressBar.setVisibility(View.VISIBLE);
        punchLine.setAlpha(0);


         RequestQueue requestQueue =  Volley.newRequestQueue(this);
         String url = "https://official-joke-api.appspot.com/random_joke";
            JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {
                                String jokeSetup =  (String) response.get("setup");
                                joke.setText(jokeSetup);
                                String jokePunchline =  (String) response.get("punchline");
                                punchLine.setText(jokePunchline);
                                fullJoke = "Setup: " + jokeSetup + "PunchLine: "+ jokePunchline;
                                progressBar.setVisibility(View.INVISIBLE);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                }
            });

            requestQueue.add(jsonObjectRequest);
        }


    public void showPunch(View view) {
            punchLine.setAlpha(1);
    }


    public void NextJoke(View view) {
        getJokeNet();
    }

    public void copyToClip(View view) {
        Toast makeText = Toast.makeText(MainActivity.this, "Copied", Toast.LENGTH_LONG);
        ClipboardManager clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("joke", fullJoke);
        clipboardManager.setPrimaryClip(clipData);
        makeText.show();
    }



}