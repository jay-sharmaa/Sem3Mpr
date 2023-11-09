package com.example.shoppinapp;

public class Itemmodel {
    int Itemimg;
    String BrandName;
    String ItemName;
    String Price;

    public Itemmodel(int itemimg, String brandName, String itemName, String price) {
        Itemimg = itemimg;
        BrandName = brandName;
        ItemName = itemName;
        Price = price;
    }

    public int getItemimg() {
        return Itemimg;
    }

    public void setItemimg(int itemimg) {
        Itemimg = itemimg;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}
