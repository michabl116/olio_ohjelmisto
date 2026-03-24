package Tehtava1.task3;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = input.nextDouble();

        double totalLuoti = grams / 13.28;


        int luotiPerLeiviska = 20 * 32;

        int leiviska = (int)(totalLuoti / luotiPerLeiviska);
        double remainder = totalLuoti - leiviska * luotiPerLeiviska;

        int naula = (int)(remainder / 32);
        double luoti = remainder - naula * 32;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.\n",
                grams, leiviska, naula, luoti);

    }
}
