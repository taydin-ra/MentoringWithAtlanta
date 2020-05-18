package setReview;

import java.util.Arrays;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        // ikisinin de ayni harflerden olustugunu ispat edeceksiniz

        String[] array1 = s1.split("");   //{"l","i","s","t","e","n"}
        String[] array2 = s2.split("");    // {"s","i","l","e","n","t"}

        TreeSet<String> mySet1 = new TreeSet<>(Arrays.asList(array1));

        TreeSet<String> mySet2 = new TreeSet<>(Arrays.asList(array2));

        if (mySet1.equals(mySet2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 2ci yol

        String[] array3 = s1.split("");   //{"l","i","s","t","e","n"}
        String[] array4 = s2.split("");    // {"s","i","l","e","n","t"}

        TreeSet<String> mySet3 = new TreeSet<>();
        for (String array : array3) {
            mySet3.add(array);
        }

        TreeSet<String> mySet4 = new TreeSet<>();
        for (String arr : array4) {
            mySet4.add(arr);
        }
        if (mySet3.equals(mySet4)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
