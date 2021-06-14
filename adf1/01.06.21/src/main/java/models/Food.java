package models;

import java.util.Date;

public class Food {
    private Integer id;
    private String name;
    private Float unitPrice;
    private Date productionDate;
    private Date expiredDate;

    public Food(Integer id, String name, Float unitPrice,
                Date productionDate, Date expiredDate) {
        this.id = id;
        this.name = name == null ? "" : name;
        this.unitPrice = unitPrice < 0 ? 0.0f : unitPrice;
        this.productionDate = productionDate;
        this.expiredDate = expiredDate;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
}
