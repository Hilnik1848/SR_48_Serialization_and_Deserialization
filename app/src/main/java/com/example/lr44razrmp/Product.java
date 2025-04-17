package com.example.lr44razrmp;


import com.google.gson.annotations.SerializedName;


public class Product {
    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("price")
    private double price;

    @SerializedName("description")
    private String description;

    @SerializedName("category")
    private String category;

    @SerializedName("image")
    private String image;

    @SerializedName("rating")
    private Rating rating;

    public Product(int id, String title, double price, String description,
                   String category, String image, Rating rating) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rating = rating;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public double getPrice() { return price; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public String getImage() { return image; }
    public Rating getRating() { return rating; }
}

class Rating {
    @SerializedName("rate")
    private double rate;

    @SerializedName("count")
    private int count;

    public Rating(double rate, int count) {
        this.rate = rate;
        this.count = count;
    }

    public double getRate() { return rate; }
    public int getCount() { return count; }
}