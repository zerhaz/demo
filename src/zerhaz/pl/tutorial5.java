package zerhaz.pl;

import java.util.Scanner;

public class tutorial5 {
    public static void print() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String line = input.nextLine();
        System.out.println("You entered: " + line);

        System.out.println("Enter a integer: ");
        int value = input.nextInt();
        System.out.println("You entered: " + value);
    }
}
