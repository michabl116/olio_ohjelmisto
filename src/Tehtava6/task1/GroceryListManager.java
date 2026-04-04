package Tehtava6.task1;


import java.util.ArrayList;

public class GroceryListManager {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public void displayList() {
        System.out.println("Grocery List:");
        int index = 1;
        for (String item : groceryList) {
            System.out.println(index++ + ". " + item);
        }
        System.out.println();
    }
}


