package StaticKeyword;

public class StaticEx2 {

    int age=20; // non-static  // global(instance) variable
    static int age2 = 30;    /*-it is created only once in the memory , it cannot be copied.
                               It is shared among objects
                         - you can call static variable or method from non-static and static methods
                         - if your method is static and your variable is non-static you cannot call it
*/

    public  void method(){
        age=40;
        System.out.println("my non-static variable age--->"+ age++);
        System.out.println("my static variable age2--->"+age2++);
    }

    public static void main(String[] args) {
        StaticEx2 s1= new StaticEx2();
        s1.method();
        StaticEx2 s2= new StaticEx2();
        s2.method();
        StaticEx2 s3= new StaticEx2();
        s3.method();

    }
}