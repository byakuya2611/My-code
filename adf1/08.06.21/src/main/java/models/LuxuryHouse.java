package models;

public class LuxuryHouse extends HouseTransaction{
    public Float getTotalPrice(){
        return price * area;
    }
}
