package Tehtava1.task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.printf("Temperature in Celsius: %.1f\n", celsius);
    }
}
