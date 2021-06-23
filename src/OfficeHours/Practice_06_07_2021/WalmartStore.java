package OfficeHours.Practice_06_07_2021;

import java.util.ArrayList;

public class WalmartStore {
    String location;
    double totalWorth;
    ArrayList<Item>inventory;
    static String companyName;

    public WalmartStore(String location){
        this.location = location;
        this.inventory = new ArrayList<>();
    }
    public WalmartStore(String location, ArrayList<Item> allItems){
        this.location=location;
        this.inventory=allItems;
    }

}
