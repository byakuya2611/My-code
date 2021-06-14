package models;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class LandTransaction extends Transaction{
    private LandType landType;
    public LandTransaction() {

    }

    public LandTransaction(String transactionCode, Date transactionDate,
                           Double unitPrice, Double area, LandType landType) {
        super(transactionCode, transactionDate, unitPrice, area);
        this.landType = landType;
    }

    @Override
    public Double getTotalPrice() {
        return this.getArea() * this.getUnitPrice() * (landType == LandType.A ? 1.5 : 1);
    }

    @Override
    public void input() {
        super.input();
        System.out.println("Enter land type(a,b,c): ");
        String inputType = getScanner().next();
        this.landType = inputType.toLowerCase().equals("a") ? LandType.A
                : (inputType.toLowerCase().equals("b") ? LandType.B : LandType.C);
    }

    public LandType getLandType() {
        return landType;
    }

    public void setLandType(LandType landType) {
        this.landType = landType;
    }

    @Override
    public String toString() {
        return String.format("%s, landType = %s", super.toString(), landType);
    }
}
