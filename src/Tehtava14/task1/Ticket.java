package Tehtava14.task1;

public class Ticket {
    private int availableSeats;

    public Ticket(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserve(String customerName, int tickets) {
        if (tickets <= availableSeats) {
            availableSeats -= tickets;
            System.out.println(customerName + " reserved " + tickets + " tickets.");
            return true;
        } else {
            System.out.println(customerName + " couldn't reserve " + tickets + " tickets.");
            return false;
        }
    }
}

