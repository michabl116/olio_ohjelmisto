package Tehtava13.task1;

public class NumberPrinter {
     int max;
     boolean evenDone = false;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printEven() {
        for (int i = 2; i <= max; i += 2) {
            System.out.println("Even Thread: " + i);
        }
        evenDone = true;
        notifyAll();
    }

    public synchronized void printOdd() {
        while (!evenDone) {
            try { wait(); } catch (InterruptedException e) { return; }
        }

        for (int i = 1; i <= max; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter(20);

        Thread evenThread = new Thread(() -> printer.printEven());
        Thread oddThread  = new Thread(() -> printer.printOdd());

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {}

        System.out.println("Printing complete.");
    }
}
