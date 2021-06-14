package models;

import java.util.Date;
import java.util.Scanner;

public class LandTransaction {
    private Integer id;
    private Date date;
    protected Float price;
    protected Float area;

    public LandTransaction() {

    }

    public LandTransaction(Integer id, Date date, Float price, Float area) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

}
