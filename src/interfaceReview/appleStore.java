package interfaceReview;

import javax.print.attribute.standard.Chromaticity;

public class appleStore {
    public static void main(String[] args) {
        Device device = new phone(); // polymorphism
//        device.call();
//        device.receiveCall();
//        System.out.println("name: "+ device.name);

        phone phone = new phone();
        phone.brand();



    }
}
