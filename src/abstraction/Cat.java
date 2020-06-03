package abstraction;

public class Cat extends Animal {
    // concrete class normal bir class
    // concrete class abstract class a extend oldugu zaman
    // butun abstract methodlari implement etmek zorunda
    // diger methodlari implement etme zorunlulugu yok

    public Cat(){

    }
    public Cat(String name, int legs) {
        super(name, legs);
    }
    @Override
    public void sound() {
        System.out.println("meaaaaw");

    }

    @Override
    public void eat() {
        System.out.println("drinks milk");

    }

    @Override
    public void sleep() {
        System.out.println("cats sleep,too");

    }
}
