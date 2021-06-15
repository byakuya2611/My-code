package com.product.books;

import com.product.Product;

public class Book extends Product {
    private String type;
    private String publisher;
    public Book() {}

    public Book(String proId, String proName, int year, float price,
                String type, String publisher) {
        super(proId, proName, year, price);
        this.type = type;
        this.publisher = publisher;
    }

    @Override
    public void input() {
        System.out.println("Enter Book's id: ");
        this.proId = getScanner().next();

        System.out.println("Enter Book's name: ");
        this.proName = getScanner().next();

        System.out.println("Enter Book's year: ");
        this.year = getScanner().nextInt();

        System.out.println("Enter Book's price: ");
        this.price = getScanner().nextFloat();

        System.out.println("Enter Book's type: ");
        this.type = getScanner().next();

        System.out.println("Enter Book's publisher: ");
        this.publisher = getScanner().next();
    }

    @Override
    public void display() {
        System.out.println("Book's id: \n" + proId
                + "Book's name \n: " + proName
                + "Book's year: \n" + year
                + "Book's price: \n" + price
                + "Book's type: \n" + type
                + "Book's publisher: \n" + publisher);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
