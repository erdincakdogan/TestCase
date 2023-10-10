package org.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestoranMenu {
    private List<Category> categories;

    public RestoranMenu() {
        categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Category> getCategories() {
        return categories;
    }
    //item ıcın hangı oydan kac tane var.
    //
    public void printRatingsCategory (){
        for (Category category : getCategories()) {
            for (MenuItem item : category.getItems()) {
                item.printAllRatings();
            }
        }
    }
}