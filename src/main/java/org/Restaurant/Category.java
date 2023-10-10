package org.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<MenuItem> items;

    public Category(String name) {
        this.name = name;
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public List<MenuItem> getItems() {
        return items;
    }

}