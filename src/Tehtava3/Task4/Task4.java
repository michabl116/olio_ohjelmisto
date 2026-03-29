package Tehtava3.Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int score = 0;

            for (int i = 0; i < 10; i++) {
                int a = (int)(Math.random() * 10) + 1;
                int b = (int)(Math.random() * 10) + 1;

                System.out.print("What is " + a + " x " + b + "? ");
                int answer = sc.nextInt();

                if (answer == a * b) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + (a * b));
                }
            }

            if (score == 10) {
                System.out.println("Congratulations! You have mastered the multiplication tables.");
                break;
            } else {
                System.out.println("You scored " + score + " points. Let's try again.");
            }
        }
    }
}
