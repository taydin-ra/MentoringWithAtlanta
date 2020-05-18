package exceptions;

public class ThrowsAndThrow {

    // Unchecked Throwing
    public static void myMethod(String name) throws NullPointerException  {
        String str=null;
        if (name==str) {
            throw new NullPointerException("Its really cold outside, wear something warm");
        }
    }
    public static void main(String[] args) {
        try {
            myMethod(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Fine");
        }

    }
}