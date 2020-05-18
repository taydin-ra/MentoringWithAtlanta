package exceptions;

public class NestedTryCatch {
    public static void main(String[] args) {
        try{
            try{
                int a=8;
                int b=0;
                System.out.println(a/b);
                try{

                }catch (ArithmeticException n){
                    System.out.println("1");
                }
            }catch (ArrayIndexOutOfBoundsException a){
                System.out.println("this is for arrays");
            }
        }catch ( NumberFormatException ab){
            System.out.println("Finally you found me");
        }
    }
}
