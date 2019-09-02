package com.wx.wheelview.common;

public class Book {
    private int id;
    private String name;
    private String description;
    private String longdescription;
    private double price;
    private int thumbnail;
    private String amazonURL;
    private boolean isTelBook;

    public Book(int id, String name, String description, String longdescription, double price, int thumbnail, String amazonURL, boolean isTel) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.thumbnail = thumbnail;
        this.longdescription = longdescription;
        this.amazonURL = amazonURL;
        this.isTelBook = isTel;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getLongdescription() {
        return longdescription;
    }

    public String getAmazonURL() {
        return amazonURL;
    }

    public void setAmazonURL(String amazonURL) {
        this.amazonURL = amazonURL;
    }

    public void setLongdescription(String longdescription) {
        this.longdescription = longdescription;
    }

    public boolean isTelBook() {
        return isTelBook;
    }

    public void setTelBook(boolean telBook) {
        isTelBook = telBook;
    }
}
