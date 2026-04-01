package Tehtava4.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna tauluko koko;");
        int num= scanner.nextInt();
        int[]  sp = new int[num];
        System.out.println("Syötä kokonaisluvut taulukkoon:");
        for (int i = 0; i < num; i++) {
            System.out.print("Anna luku " + (i + 1) + ": ");
            sp[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < num; i++) {
            int currentSum = 0;
            for (int j = i; j < num; j++) {
                currentSum += sp[j];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("\nSuurin summa: " + maxSum);
        System.out.println("Indeksit: " + (startIndex + 1) + "-" + (endIndex + 1));
    }

    }

