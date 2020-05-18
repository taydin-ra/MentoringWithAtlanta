package staticKeyword;

public class StaticWithString {
    String name;
    static String name1;

    public static void main(String[] args) {
        StaticWithString obj = new StaticWithString();
        obj.name = "Rana";
        obj.name1 = "Akif";
        StaticWithString obj1 = new StaticWithString();
        obj1.name = "Mina";
        obj1.name1 = "Zehra";

        System.out.println("obj.name: " + obj.name);  //
        System.out.println("obj.name1: " + obj.name1);  //
        System.out.println("obj1.name: " + obj1.name);  //
        System.out.println("obj1.name1: " + obj1.name1); //
    }
}
