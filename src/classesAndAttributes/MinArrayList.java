package classesAndAttributes;

import java.util.ArrayList;

public class MinArrayList {

    /*
    given an arraylist of integer
    move the minimum element of the arraylist to the front
     myList.add(38);
        myList.add(17);
        myList.add(1);
        myList.add(45);

        output:  // 1,38,17,45
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(38);
        myList.add(17);
        myList.add(1);
        myList.add(45);

        // 1,38,17,45

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < min) {
                min = myList.get(i);
            }
        }
        System.out.println(min);
    }
}
