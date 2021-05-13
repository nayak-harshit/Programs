    package com.nayak.memeshare;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import org.json.JSONException;
import org.json.JSONObject;

    public class MainActivity extends AppCompatActivity {
        ImageView imageView;
        ProgressBar progressBar;
        Button next;
        String imageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        progressBar = findViewById(R.id.progressBar);
        next = findViewById(R.id.next);

        System.out.println("Load meme below");
        loadMeme();
        System.out.println("Load meme above");

    }
    private void loadMeme(){
        progressBar.setVisibility(View.VISIBLE);
// ...

// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url ="https://meme-api.herokuapp.com/gimme";

// Request a string response from the provided URL.
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url,null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Display the first 500 characters of the response string.
                        System.out.println("Response is: ");
                        try {
                            System.out.println("inside try");
                            imageUrl = (String) response.get("url");
                            Glide.with(MainActivity.this).load(imageUrl).listener(new RequestListener<Drawable>() {
                                @Override
                                public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                                   progressBar.setVisibility(View.GONE);
                                   next.setText("Retry");
                                    return false;
                                }

                                @Override
                                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                                    progressBar.setVisibility(View.INVISIBLE);
                                    return false;
                                }
                            }).into(imageView);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(jsonObjectRequest);


    }

        public void share(View view) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "I got a meme from Reddit through memeShare App"+imageUrl);
            Intent chooser = Intent.createChooser(intent,"Share this awesome meme");
            startActivity(chooser);
        }

        public void next(View view) {
        loadMeme();
        }
}