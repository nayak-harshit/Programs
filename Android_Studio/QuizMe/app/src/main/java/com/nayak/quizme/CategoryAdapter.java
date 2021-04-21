package com.nayak.quizme;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private List<CategoryModel> categoryModelList;

    public CategoryAdapter(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(categoryModelList.get(position).getImageURL(), categoryModelList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private CircleImageView imageView;
        private TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.ImageView);
            title = itemView.findViewById(R.id.Title);
        }

        private void setData(String url, String title){
            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.title.setText(title);
        }
    }

}
