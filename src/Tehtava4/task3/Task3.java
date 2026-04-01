package Tehtava4.task3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna taulukon koko: ");
        int num = scanner.nextInt();

        int[] dup = new int[num];

        System.out.println("Syötä kokonaisluvut taulukkoon:");
        for (int i = 0; i < num; i++) {
            System.out.print("Anna luku " + (i + 1) + ": ");
            dup[i] = scanner.nextInt();
        }

        int[] uni = new int[num];
        int Count = 0;

        for (int i = 0; i < num; i++) {
            boolean exists = false;

            for (int j = 0; j < Count; j++) {
                if (dup[i] == uni[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                uni[Count] = dup[i];
                Count++;
            }
        }

        System.out.println("\nTaulukko ilman duplikaatteja:");
        for (int i = 0; i < Count; i++) {
            System.out.print(uni[i] + " ");
        }
    }
}
