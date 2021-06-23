package models;

import java.util.Scanner;

public class CompactDisk {
    private Integer id;
    private String title;
    private String singer;
    private Integer numberOfSongs;
    private Float price;

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public CompactDisk() {
        title = "";
        singer = "";
        numberOfSongs = 0;
        price = 0.0f;
    }

    public CompactDisk(Integer id, String title, String singer, Integer numberOfSongs, Float price) {
        this.id = id;
        this.title = title;
        this.singer = singer;
        this.numberOfSongs = numberOfSongs;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Integer getNumberOfSongs() {
        return numberOfSongs;
    }

    public void setNumberOfSongs(Integer numberOfSongs) {
        this.numberOfSongs = numberOfSongs;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void inputCD() {
        System.out.println("Enter id: ");
        this.id = getScanner().nextInt();
        System.out.println("Enter title: ");
        this.title = getScanner().next();
        System.out.println("Enter singer: ");
        this.singer = getScanner().next();
        System.out.println("Enter number of songs: ");
        this.numberOfSongs = getScanner().nextInt();
        System.out.println("Enter price: ");
        this.price = getScanner().nextFloat();
    }

    @Override
    public String toString() {
        return String.format("id = %d, title = %s, singer = %s, numberOfSongs = %d, price = %.1f",
                this.id, this.title, this.singer, this.numberOfSongs, this.price);

    }
}
