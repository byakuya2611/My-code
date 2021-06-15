package com.product.computers;

import com.product.Product;

public class Computer extends Product {
    private String speed;
    private String producer;
    public Computer() {}

    public Computer(String proId, String proName, int year, float price,
                    String speed, String producer) {
        super(proId, proName, year, price);
        this.speed = speed;
        this.producer = producer;
    }

    @Override
    public void input() {
        System.out.println("Enter Computer's id: ");
        this.proId = getScanner().next();

        System.out.println("Enter Computer's name: ");
        this.proName = getScanner().next();

        System.out.println("Enter Computer's year: ");
        this.year = getScanner().nextInt();

        System.out.println("Enter Computer's price: ");
        this.price = getScanner().nextFloat();

        System.out.println("Enter Computer's speed: ");
        this.speed = getScanner().next();

        System.out.println("Enter Computer's producer: ");
        this.producer = getScanner().next();
    }

    @Override
    public void display() {
        System.out.println("Computer's id: \n" + proId
                        + "Computer's name \n: " + proName
                        + "Computer's year: \n" + year
                        + "Computer's price: \n" + price
                        + "Computer's speed: \n" + speed
                        + "Computer's producer: \n" + producer);
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
