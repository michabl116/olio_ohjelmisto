package Tehtava3.Task3;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int n = start; n <= end; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
