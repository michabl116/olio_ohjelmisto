package Tehtava14.task1;

public class Customer implements Runnable {
    Ticket system;
    int tickets;
    String name;

    public Customer(Ticket system, String name, int tickets) {
        this.system = system;
        this.name = name;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        system.reserve(name, tickets);
    }
}

