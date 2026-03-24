package Tehtava1.task2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first leg: ");
        double a = input.nextDouble();

        System.out.print("Enter the length of the second leg: ");
        double b = input.nextDouble();

        double hypotenuse = Math.sqrt(a * a + b * b);

        System.out.println("The length of the hypotenuse is: " + hypotenuse);

    }
}
