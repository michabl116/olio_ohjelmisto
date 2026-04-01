package Tehtava4.task1;

import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        String [] firstName ={ "Pedro", "Kalle", "luisa", "Terhi"};
        String [] lastName ={ "Valkone", "Virta", "Kakonen", "Jarvinen"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Kuinka monta nimeä haluat luoda?(1-5)");
        int luku = scanner.nextInt();
        for (int i = 0; i < luku; i++){
            int ifist = random.nextInt(firstName.length);
            int ilast = random.nextInt(lastName.length);
            String firstAndLastName = firstName[ifist]+ " " + lastName[ilast];
            System.out.println(firstAndLastName);
        }





    }
}
