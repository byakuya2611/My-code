package models;

public class NormalHouse extends HouseTransaction{
    public Float getTotalPrice(){
        return price * area * 0.9f;
    }
}
