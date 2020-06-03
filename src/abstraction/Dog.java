package abstraction;

public abstract class Dog extends Lion{
    /*
     abstract class extend abstract oldugu zaman abstract
     methodlari implement etmek zorunda degil, cunku yine bir yarim class olusturuyor
     */

    public Dog(String name, int legs) {
        super(name, legs);
    }
    @Override
    public void sound() {
        System.out.println("woof woof");

    }

    @Override
    public void eat() {
        System.out.println("eats bones");

    }

    @Override
    public void sleep() {
        System.out.println("sleep");

    }
}
