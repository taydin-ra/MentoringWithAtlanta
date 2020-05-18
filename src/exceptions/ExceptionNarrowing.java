package exceptions;

public class ExceptionNarrowing {
    public static void main(String[] args) {
        try {
            int a = 9;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (NullPointerException e) {
            System.out.println("I am the nullpointerexception");
        } catch (ArithmeticException e) {
            System.out.println("I am the correct one");
        }

//        try {
//
//            String str = null;
//
//            char n = str.charAt(9);
//
//            System.out.println(n);
//        } catch (Exception e){
//            System.out.println("I am the parent exception class");
//        }catch (NullPointerException b){
//            System.out.println("Compile error");
//        }
    }
}