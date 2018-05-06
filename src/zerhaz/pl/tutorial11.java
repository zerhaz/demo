package zerhaz.pl;


class Thing {
    public final static int LUCKY_NUMBER = 5;
    public String name;
    public static String description;

    public static int count = 0;
    public int id;

    public Thing() {
        id = count;
        count++;
    }


    public void showName() {
        System.out.println(name + " " + id);
    }

    public static void showInfo() {
        System.out.println("HELLO");
    }
}

public class tutorial11 {
    public static void print() {

        Thing.description = "I am a thing";
        System.out.println(Thing.description);

        Thing.showInfo();

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        thing2.name = "Bob";
        thing1.name = "Sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
