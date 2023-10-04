package org.Inventory;

public class Product {
    private String name;
    private String price;
    private int count;
    public Product(String name, String price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }





}
