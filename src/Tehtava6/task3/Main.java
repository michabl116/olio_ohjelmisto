package Tehtava6.task3;

public class Main {
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples", 1.20, "Fruits");
        manager.addItem("Bananas", 1.10, "Fruits");
        manager.addItem("Milk", 2.50, "Dairy");

        manager.displayByCategory("Fruits");
    }
}
