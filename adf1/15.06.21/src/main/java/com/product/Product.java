package com.product;

import java.util.Scanner;

public abstract class Product {
    protected String proId;
    protected String proName;
    protected int year;
    protected float price;
    protected Scanner getScanner() {
        return new Scanner(System.in);
    }

    public Product() {}

    public Product(String proId, String proName, int year, float price) {
        this.proId = proId;
        this.proName = proName;
        this.year = year;
        this.price = price;
    }

    public abstract void input();

    public abstract  void display();

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
