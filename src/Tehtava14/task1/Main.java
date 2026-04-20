package Tehtava14.task1;


public class Main {
    public static void main(String[] args) {
        Ticket system = new Ticket(10);

        Runnable[] customers = {
                new Customer(system, "Customer 1", 2),
                new Customer(system, "Customer 2", 1),
                new Customer(system, "Customer 3", 3),
                new Customer(system, "Customer 4", 1),
                new Customer(system, "Customer 5", 2),
                new Customer(system, "Customer 6", 2),
                new Customer(system, "Customer 7", 1),
                new Customer(system, "Customer 8", 1),
                new Customer(system, "Customer 9", 3),
                new Customer(system, "Customer 10", 3),
                new Customer(system, "Customer 11", 2),
                new Customer(system, "Customer 12", 4),
                new Customer(system, "Customer 13", 1),
                new Customer(system, "Customer 14", 4),
                new Customer(system, "Customer 15", 3)
        };

        Thread[] threads = new Thread[customers.length];

        for (int i = 0; i < customers.length; i++) {
            threads[i] = new Thread(customers[i]);
            threads[i].start();
        }

        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException ignored) {}
        }

        System.out.println("Reservation process completed.");
    }
}
