package Exceptions;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        try {
            int[] myIntArray = new int[]{1, 2, 3}; //0,1,2
            print4hItemInArray(myIntArray);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You can take your element");
        } finally {
            System.out.println("Finally will be executed all the time");
        }

        System.out.println("Fourth line");
        System.out.println("Fifth line");
    }

    private static void print4hItemInArray(int[] myIntArray) {
        System.out.println(myIntArray[3]);
        System.out.println("Fourth element successfully displayed!");
    }


}

