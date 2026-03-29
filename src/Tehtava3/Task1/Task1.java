package Tehtava3.Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number A: ");
        double a = sc.nextDouble();

        System.out.print("Enter Number B: ");
        double b = sc.nextDouble();

        System.out.print("Enter Number C: ");
        double c = sc.nextDouble();

        double discriminant = b*b - 4*a*c;

        if (discriminant < 0) {
            System.out.println("No real roots");
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2*a);

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}
