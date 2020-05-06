package MethodsReview;

import java.util.Arrays;

public class ReturnTypeMethod {

    public static boolean AreaOfQfSquare(int a) {

        int area = a * a;
        if (area > 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean myCon = AreaOfQfSquare(0);
        System.out.println(myCon);

        String reverse = myNameReverse("Merve");
        System.out.println(reverse);

    }

    public static String myNameReverse(String name) {

        String result = "";
        for (int i = name.length() - 1; i >=0; i--) {
            result += name.charAt(i);
        }
        return result;
    }
}
