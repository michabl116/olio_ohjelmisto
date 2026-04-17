package Tehtava13.task2;

import java.util.Random;

class PartialSum implements Runnable {
    int[] arr;
    int start, end;
    long sum = 0;

    public PartialSum(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        long s = 0;
        for (int i = start; i < end; i++) {
            s += arr[i];
        }
        sum = s;
    }
}

class Main {
    public static void main(String[] args) {
        int size = 100000;
        int[] numbers = new int[size];
        Random r = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = r.nextInt(100);
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Using " + cores + " threads.");

        Thread[] threads = new Thread[cores];
        PartialSum[] tasks = new PartialSum[cores];

        int chunk = size / cores;

        for (int i = 0; i < cores; i++) {
            int start = i * chunk;
            int end = (i == cores - 1) ? size : start + chunk;

            tasks[i] = new PartialSum(numbers, start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        long total = 0;

        for (int i = 0; i < cores; i++) {
            try { threads[i].join(); } catch (InterruptedException e) {}
            total += tasks[i].getSum();
        }

        System.out.println("Total sum = " + total);
    }
}

