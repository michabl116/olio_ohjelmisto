package Tehtava14.task2;

public class ListWorker implements Runnable {
    private ThreadSafeList<String> safeList;
    private String value;

    public ListWorker(ThreadSafeList<String> safeList, String value) {
        this.safeList = safeList;
        this.value = value;
    }

    @Override
    public void run() {
        safeList.add(value);

        try { Thread.sleep(10); } catch (InterruptedException ignored) {}

        safeList.remove(value);
    }
}

