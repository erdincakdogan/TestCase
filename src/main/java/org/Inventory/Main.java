package org.Inventory;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product0 = new Product("Water", "30", 40);
        Product product1 = new Product("Coke", "10",30);
        Product product2 = new Product("Mouse", "50",1);

        inventory.addProduct(product0);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        inventory.listProducts();
        inventory.updateProductCount(product0,-39);
        inventory.updateProductCount(product1,-20);
        inventory.listProducts();



    }
}
