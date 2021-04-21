package com.nayak.quizme;

public class CategoryModel {
    private  String imageURL, Title;

    public CategoryModel(String imageURL, String title) {
        this.imageURL = imageURL;
        Title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
