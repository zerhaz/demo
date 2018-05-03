package zerhaz.pl;

import java.util.Scanner;

public class tutorial7 {
    public static void print() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a command:");
        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println("Machine started");
                break;
            case "stop":
                System.out.println("Machine stopped");
                break;
            default:
                System.out.println("Not recognized");
        }
    }
}
