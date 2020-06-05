package interfaceReview;

public interface Device {
    // 100% abstraction
    //keyword implement
    // butun methodlar by default abstract
    // butun variablelar da by default public,static,final
    // java 8 den sonra default keywordli ve static methodlara izin verilmis
    // can not be instantiated (object create edemeyiz)
    // iki farkli interfacede ayni method farkli return type li olamaz


    String name = "iphone";

    void call();

    void receiveCall();    //ctrl + /

    default void brand() {
        System.out.println("iphone 11");
    }
    static void year() {
        System.out.println("2019");

    }
      //  int myAge();
}

class phone  implements Device, MyOtherDevice {  // concrete class
    // name="Samsung";  compile error cunku final bi daha initialize edilemez

    @Override
    public void call() {
        System.out.println("makes calls");
    }

    @Override
    public void receiveCall() {
        System.out.println("receive calls");

    }

    @Override
    public void brand() {
//     Device.super.brand();
//     MyOtherDevice.super.brand();
        System.out.println("samsung");

    }




}
