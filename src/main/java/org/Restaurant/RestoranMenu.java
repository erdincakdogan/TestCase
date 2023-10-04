
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


}


