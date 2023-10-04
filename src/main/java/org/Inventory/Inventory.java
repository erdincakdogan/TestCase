package org.Inventory;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> productList;
    private boolean inventoryUpdated;
    public Inventory(){
        productList= new ArrayList<>();
        inventoryUpdated= false;
    }
    public void addProduct(Product product){
        if(!productList.contains(product)){
            productList.add(product);
            inventoryUpdated = true;
        }else {
            System.out.println("Cannot be negative");
        }
    }
    public void removeProduct(Product product){
        if (product.getCount() >=0){
        productList.remove(product);
        }else {
            System.out.println("Cannot be negative");

        }
    }
    public void updateProductCount(Product product, int change) {
        int currentCount = product.getCount();
        int newCount = currentCount + change;

        if (newCount >= 0) {
            product.setCount(newCount);
            System.out.println("Product count "+product.getName() +" updated: "+ newCount);
        } else {
            System.err.println("Error: Product count cannot be negative. The count remains unchanged.");
        }

        inventoryUpdated = true;
    }
    public List<Product> getProductList(){
        return productList;
    }
    public void lowStockAlarm(){
        productList.stream()
                .filter(product -> product.getCount() < 2)
                .forEach(product -> System.out.println("Low stock alarm: "+ product.getName() +" "+ product.getCount()));
    }
    public void listProducts() {
//if (inventoryUpdated) {
            System.out.println("Current Invetory: ");
            productList.forEach(product -> {
                System.out.println(product.getName() + " - Count: " + product.getCount());
            });
        //    inventoryUpdated=false;

    }
}

