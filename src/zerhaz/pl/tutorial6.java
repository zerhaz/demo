package zerhaz.pl;

import java.util.Scanner;

public class tutorial6 {
    public static void print() {
        Scanner scanner = new Scanner(System.in);

        int value = 0;

        do {
            System.out.println("enter a number 5: ");
            value = scanner.nextInt();
        }
        while (value != 5);

        System.out.println("Got 5!");
    }
}
