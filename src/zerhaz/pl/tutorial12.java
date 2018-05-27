package zerhaz.pl;

public class tutorial12 {
    public static void print() {

        String info = "";

        info += "My name is Bob.";
        info += " ";
        info += "I am a builder.";

        System.out.println(info);

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am an astronaut.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.").append(" ").append("I am aa skydiver.");
        System.out.println(s.toString());


        // formatting

        System.out.print("Here is some text.\tThat is a tab.\nThat is new line.");
        System.out.println();
        System.out.printf("Total cost %d; quantity is %d;\n", 5, 120);
        System.out.printf("Total cost %5d; quantity is %-10d;\n", 5, 120);

        for (int i = 7; i < 13; i++) {
            System.out.printf("%2d: %s\n", i, "here is some text");
        }

        System.out.printf("Total value: %f;\n", 5.628);
        System.out.printf("Total value: %.2f;\n", 5.628);
        System.out.printf("Total value: %10.1f;\n", 235.6289112);
    }
}