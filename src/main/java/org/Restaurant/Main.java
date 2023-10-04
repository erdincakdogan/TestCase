package org.Restaurant;
public class Main {
    public static void main(String[] args) {
        RestoranMenu restaurantMenu = new RestoranMenu();

        Category foodCategory = new Category("Food");
        Category drinksCategory = new Category("Drinks");

        MenuItem burger = new MenuItem("Burger", 10.0, 4);
        MenuItem pizza = new MenuItem("Pizza", 15.0, 5);
        MenuItem cola = new MenuItem("Cola", 3.0, 3);

        foodCategory.addItem(burger);
        foodCategory.addItem(pizza);
        drinksCategory.addItem(cola);

        restaurantMenu.addCategory(foodCategory);
        restaurantMenu.addCategory(drinksCategory);


    }


}
