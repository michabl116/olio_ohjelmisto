package Tehtava11.task2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {
        long[] fib = new long[60];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < 60; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        try (FileWriter writer = new FileWriter("src/Tehtava11/task2/fibonacci.csv")) {
            for (int i = 0; i < 60; i++) {
                writer.write(i + ";" + fib[i] + "\n");
            }
            System.out.println("file fibonacci.csv is written.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

