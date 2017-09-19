package com.nayan.candyparty;

/**
 * Created by Nayan on 9/19/2017.
 */
public class MProduct {
    private int id,color;
    private String size,discountParcentage;
    private int price,discountPrice;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getDiscountParcentage() {
        return discountParcentage;
    }

    public void setDiscountParcentage(String discountParcentage) {
        this.discountParcentage = discountParcentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
