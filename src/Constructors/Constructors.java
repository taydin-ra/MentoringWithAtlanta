package Constructors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.Date;

public class Constructors {
    // it is used to create an object of a class to initialize the instance variables

    // difference between constructor and methods
    // constructors don't have return value
    // methods have return value
    // constructor has to be same name with class
    // methods can be same name or different name
    // constructors is called with 'new' keyword
    // method is called without any keyword

    /*
    three types
                           // default
                          // no-arg
                          // parametrized constructor
     */

    String name;
    int age;
    double salary;   // field , instance variable

    public Constructors() {

    }

    public Constructors(String name) {
        this.name = name;

    }

    public Constructors(String isim, int yas) {
        this.name = isim;
        this.age = yas;

    }

    // override
    public String toString() {
        return "name: " + this.name +
                "\nage: " + this.age;

    } // implicitly (butun classlarda var ama hashcode return ediyor)

    public void print() {
        System.out.println(this.name + " " + this.age);
    }

    // Access modifiers
    // private in the same class
    // public is accessible from everywhere
    // default in the same package

    public static void main(String[] args) throws ParseException {
//        Constructors cn = new Constructors();
//        cn.name = "Ali";
//        System.out.println(cn.name);
//        Constructors cnn = new Constructors("John", 30);
//        cnn.print();

        LocalDate today = LocalDate.now();                          //Today's date
        LocalDate birthday = LocalDate.of(1988, Month.SEPTEMBER, 6);  //Birth date

        Period p = Period.between(birthday, today);
        System.out.println(p.getYears());


    }

}
