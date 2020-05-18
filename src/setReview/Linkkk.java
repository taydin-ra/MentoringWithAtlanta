package setReview;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkkk {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");

        //System.out.println("HashSet: " + hashSet);


        LinkedHashSet<String> linkedSet = new LinkedHashSet();
        linkedSet.add("One");
        linkedSet.add("Two");
        linkedSet.add("Three");
        linkedSet.add("Four");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");
        linkedSet.add("Five");

        //System.out.println(linkedSet);

        int[] ar = {1, 2, 3, 3, 4, 5};  // lenght 6

        HashSet<Integer> hashSet1 = new HashSet();

        for (int my : ar) {

            hashSet1.add(my);
        }

        int lenght = ar.length;
        int len = hashSet1.size();
        if (len == lenght) {
            System.out.println("they are same");
        } else {
            System.out.println("there is duplicate");
        }

    }
}
