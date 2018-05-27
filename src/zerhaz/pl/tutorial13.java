package zerhaz.pl;


class Frog {

    private String name;
    private int id;

    public Frog (int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }

}

class Dog {


}


public class tutorial13 {
    public static void print() {

        Frog frog1 = new Frog(7, "Bob");
        Frog frog2 = new Frog(8, "Roger");
        Dog dog1 = new Dog();
        System.out.println(frog1);
        System.out.println(frog2);
       // System.out.println(dog1);

    }
}