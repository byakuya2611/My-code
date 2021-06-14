package models;

public class LandA extends LandTransaction{
    public Float getTotalPrice() {
        return price * area * 1.5f;
    }
}
