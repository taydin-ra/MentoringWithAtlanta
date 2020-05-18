package staticKeyword;

public class StaticEx {

   int age; // global variable (instance variable)

   public  void method1(){
      int myAge=30;  // local variable
   }

   public void method2(){
      age=20;
      System.out.println(age);
      StaticEx obj= new StaticEx();

   }

   public static void main(String[] args) {
      StaticEx obj= new StaticEx();

   }


}