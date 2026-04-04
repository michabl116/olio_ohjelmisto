package Tehtava6.task4;

public class Main {
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 1.20, "Fruits", 5);
        manager.addItem("Milk", 2.50, "Dairy", 0);

        manager.displayAvailableItems();

        manager.updateQuantity("Milk", 3);

        manager.displayAvailableItems();

    }
}
