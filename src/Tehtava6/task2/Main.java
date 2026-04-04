package Tehtava6.task2;

public class Main {
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 1.20);
        manager.addItem("Milk", 2.50);
        manager.addItem("Bread", 1.80);

        manager.displayList();

        System.out.println("Total cost: " + manager.calculateTotalCost() + "€");
    }
}
