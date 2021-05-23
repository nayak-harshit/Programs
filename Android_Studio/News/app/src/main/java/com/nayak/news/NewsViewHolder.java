package com.nayak.news;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class NewsViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public NewsViewHolder(View view) {
        super(view);
        // Define click listener for the ViewHolder's View

        textView = (TextView) view.findViewById(R.id.recycleText);
    }

    public TextView getTextView() {
        return textView;
    }
}
