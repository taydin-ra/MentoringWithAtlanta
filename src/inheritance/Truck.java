package inheritance;

public class Truck extends Car {
    // subclass//child//derived



    public Truck() {

        System.out.println("I am child constructor");
    }
  

    public double price;

    public Truck(String name, int year, boolean condition, double newPrice) {
        super(name, year, condition);
        this.price = newPrice;
    }


    public String toString() {
        return "Truck{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", condition=" + isCondition() + ", price= " + price + ", wheels="+ wheels+
                '}';
    }






}

class Tractor extends Truck {
    private int horsePower;


    public Tractor(String name, int year, boolean condition, double newPrice, int horsePower) {
        super(name, year, condition, newPrice);
        this.horsePower = horsePower;
    }

    public String toString() {
        return "Tractor{" +
                "name='" + getName() + '\'' +
                ", year=" + getYear() +
                ", condition=" + isCondition() + ", price= " + price + ", horsePower=" + horsePower +
                '}';
    }
}




