package SetReview;

import java.util.HashSet;

public class TreeSet {

    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        //setA.addAll(setB);

        System.out.println("After the union : " + setA);

        setB.retainAll(setA);  // A da olan Bde olmayan elemanlar
        System.out.println("intersection " + setA);



    }
}
