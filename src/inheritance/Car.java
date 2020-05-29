package inheritance;

public class Car {
    //encapsulation
    // data hiding
    // inheritance
    // reusabelity
    // parent/base/superclass

    private String name;
    private int year;
    private boolean condition;
    public final int wheels=4;


    public int getWheels() {
        return wheels;
    }



    public Car(){


        System.out.println("I am parent constructor");
    }

    public Car(String name, int year, boolean condition) {
        this.name = name;
        this.year = year;
        this.condition = condition;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public String getName() {  // read only
        return name;
    }

    public void setName(String name) {  // write only
        this.name = name;
    }

    public void method(){
        System.out.println("I am parent method");
    }

    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", condition=" + condition + ",wheels="+wheels+
                '}';
    }




}
