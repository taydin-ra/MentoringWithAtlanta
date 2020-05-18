package setReview;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaSet {

    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();  // insert sirasina gore print yapmiyor
        //  duplicate izin vermiyor
        // list.get(i) seklinde indexle elemana ulasmak yok

        mySet.add(1);
        mySet.add(2);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);

        System.out.println(mySet);


        ArrayList<String> myList = new ArrayList<>();
        myList.add("Merve");
        myList.add("Tugba");
        myList.add("Hafize");
        myList.add("Hale");
        myList.add("Ersin");
        myList.add("Hafize");

        // convert to hashset

        HashSet<String> myHashSet = new HashSet<>(myList);

        // System.out.println("My ArrayList: "+ myList);

        //System.out.println("My HashSet: "+ myHashSet);

        // convert from hashset to arraylist
        ArrayList<String> myList2 = new ArrayList<>(myHashSet);

        System.out.println(myList2);

        // convert to array


    }
}
