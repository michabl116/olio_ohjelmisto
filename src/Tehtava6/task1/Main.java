package Tehtava6.task1;

public class Main {
    public static void main(String[] args) {

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");

        manager.displayList();

        System.out.println("Is Milk in the list? " + manager.checkItem("Milk"));

        manager.removeItem("Milk");

        manager.displayList();
    }
}
