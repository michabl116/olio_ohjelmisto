package Tehtava6.task4;


import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<Item> groceryList = new ArrayList<>();

    public void addItem(String item, double cost, String category, int quantity) {
        groceryList.add(new Item(item, cost, category, quantity));
    }

    public void updateQuantity(String item, int newQuantity) {
        for (Item i : groceryList) {
            if (i.name.equalsIgnoreCase(item)) {
                i.quantity = newQuantity;
            }
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available items:");
        for (Item i : groceryList) {
            if (i.quantity > 0) {
                System.out.println(i.name + " - " + i.quantity + " pcs");
            }
        }
        System.out.println();
    }
}

