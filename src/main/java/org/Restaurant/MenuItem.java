package org.Restaurant;
import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private List<Integer> ratings;

    public MenuItem(String name, double price) {
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

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (int rating : ratings) {
            totalRating += rating;
        }

        return totalRating / ratings.size();
    }



    public int getRatingCount() {
        return ratings.size();
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }


    public void printAllRatings() {
        System.out.println("Ratings for " + name + ":");
        System.out.println("Total ratings: " + getRatingCount());
        System.out.println("Average ratings: " + getAverageRating());

    }
}