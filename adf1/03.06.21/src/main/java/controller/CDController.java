package controller;

import models.CompactDisk;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class CDController {
    private Integer maxSize = 100;
    private ArrayList<CompactDisk> compactDisks = new ArrayList<>();
    public void insert() {
        CompactDisk compactDisk = new CompactDisk();
        compactDisk.inputCD();
        CompactDisk foundCompactDisk = null;
        for(int i = 0; i < compactDisks.size(); i++) {
            CompactDisk item = compactDisks.get(i);
            if(item.getId() == compactDisk.getId()) {
                foundCompactDisk = item;
            }
        }
        if(foundCompactDisk != null) {
            System.err.println(String.format("CD: %s has duplicate ID, please choose another id",
                    compactDisk.toString()));
        } else {
            if(compactDisks.size() < maxSize) {
                compactDisks.add(compactDisk);
            } else {
                System.err.println("List is full, cannot update");
            }
        }
    }

    public Integer getNumberOFCDs() {
        return compactDisks.size();
    }

    public Float getTotalPrice() {
        Float result = 0.0f;
        for(int i = 0; i < compactDisks.size(); i++) {
            CompactDisk item = compactDisks.get(i);
            result += item.getPrice();
        }
        return result;
    }

    public void sortByPrice() {
        this.compactDisks.sort((CompactDisk cd1, CompactDisk cd2)
                -> cd1.getPrice() > cd2.getPrice() ? 1 : -1);
    }

    public void sortByTitle() {
        this.compactDisks.sort((CompactDisk cd1, CompactDisk cd2)
                -> cd1.getTitle().compareTo(cd2.getTitle()) > 0 ? 1 : -1);
    }

    public void printAllCDs() {
        for (CompactDisk compactDisk : this.compactDisks) {
            System.out.println(compactDisk.toString());
        }
    }
}
