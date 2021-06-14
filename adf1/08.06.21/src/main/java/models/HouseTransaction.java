package models;

import java.util.Date;

public class HouseTransaction {
    private Integer id;
    private Date date;
    protected Float price;
    protected Float area;
    private String address;

    public HouseTransaction() {

    }

    public HouseTransaction(Integer id, Date date, Float price, Float area, String address) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.area = area;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
