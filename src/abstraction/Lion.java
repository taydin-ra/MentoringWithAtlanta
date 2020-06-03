package abstraction;

public class Lion extends Cat {
    /*  concrete class baska bir concrete class a extend oldugu zaman
    abstract methodlari override yapmak zorunlulugu yok , optional
   */
    public Lion(String name, int legs) {
        super(name, legs);
    }
    @Override
    public void sound() {
        System.out.println("roarr");

    }

    @Override
    public void eat() {
        System.out.println("eats deer");

    }

    @Override
    public void sleep() {
        System.out.println("it sleeps");

    }


}
