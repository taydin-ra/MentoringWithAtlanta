package abstraction;

public abstract class Animal {
    // instance variable icerebilir
    // constructor i vardir
    // normal bodyli methodlari olabilir
    // abstract method icerebilir
    // *** object create edemiyorum

    public String name;
    public int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
        breathe();
    }

    public Animal() {

    }

    public void breathe() {
        System.out.println("if it is alive, it can breathe");
    }

    public abstract void sound(); // yarim method tamamlanmaya ihtiyaci var

    public abstract void eat();

    public abstract void sleep();




}
