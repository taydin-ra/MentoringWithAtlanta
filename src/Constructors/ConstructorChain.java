package Constructors;

public class ConstructorChain {
    String name;
    int age;
    int grade;

    public ConstructorChain() {
        this("Tugba");
        System.out.println("I am in default now");
    }
    public ConstructorChain(String name) {
        this(name, 25);


    }
    public ConstructorChain(String name, int age) {
        this(name,  25,90);
    }

    public ConstructorChain(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = 98;
    }
    @Override
    public String toString() {
        return "ConstructorChain{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
    public static void main(String[] args) {
        ConstructorChain cc = new ConstructorChain();
        System.out.println(cc);


    }
}
