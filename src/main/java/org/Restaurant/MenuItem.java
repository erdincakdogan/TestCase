package org.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;



    private List<Integer> ratings;

    public MenuItem(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.ratings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAverageRating(){
        if (ratings.isEmpty()){
            return 0.0;
    }
        double totalRating = 0.0;
        for (int rating :ratings) {
            totalRating += rating;
        }




}
