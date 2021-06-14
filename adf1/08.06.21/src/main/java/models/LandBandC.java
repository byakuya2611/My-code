package models;

public class LandBandC extends LandTransaction{
    public Float getTotalPrice() {
        return price * area;
    }
}
