package Tehtava6.task2;


import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<Item> groceryList = new ArrayList<>();

    public void addItem(String item, double cost) {
        groceryList.add(new Item(item, cost));
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Item i : groceryList) {
            total += i.cost;
        }
        return total;
    }

    public void displayList() {
        System.out.println("Grocery List:");
        for (Item i : groceryList) {
            System.out.println("- " + i.name + " (" + i.cost + "€)");
        }
        System.out.println();
    }
}
