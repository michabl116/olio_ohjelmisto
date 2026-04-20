package Tehtava14.task2;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList<String> safeList = new ThreadSafeList<>();

        Thread[] workers = new Thread[100];

        for (int i = 0; i < workers.length; i++) {
            workers[i] = new Thread(new ListWorker(safeList, "Item " + i));
        }

        for (Thread t : workers) t.start();
        for (Thread t : workers) {
            try { t.join(); } catch (InterruptedException ignored) {}
        }

        System.out.println("Final size: " + safeList.size());
    }
}

