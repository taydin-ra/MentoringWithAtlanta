package exceptions;

public class ExceptionsReview {
    public static void main(String[] args) {
        try {
            int a = 9;
            int b = 0;
            int c = a / b;
            System.out.println(c);
            System.out.println("I am in the try block"); // will not execute
        } catch (ArithmeticException e) {
            System.out.println("Now, you can divide your number");


            int num1 = 6 + 8;
            System.out.println(num1);

            String m = "Tugba";
            System.out.println(m);
        }
    }
}