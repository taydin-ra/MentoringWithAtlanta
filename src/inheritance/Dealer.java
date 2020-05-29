package inheritance;

public class Dealer {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Toyota",2003,true,5500);
        System.out.println(truck1);

        Car car= new Car("Toyota",2003,true);
        System.out.println(car);




    }
}
