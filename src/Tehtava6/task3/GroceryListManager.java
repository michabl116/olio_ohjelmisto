package Tehtava6.task3;


import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<Item> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category) {
        groceryList.add(new Item(item, cost, category));
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        for (Item i : groceryList) {
            if (i.category.equalsIgnoreCase(category)) {
                System.out.println("- " + i.name + " (" + i.cost + "€)");
            }
        }
        System.out.println();
    }
}

