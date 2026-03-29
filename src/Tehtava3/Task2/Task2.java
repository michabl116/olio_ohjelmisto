package Tehtava3.Task2;

import java.util.Scanner;



public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char bit = binary.charAt(i);
            decimal = decimal * 2 + (bit - '0');
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}

