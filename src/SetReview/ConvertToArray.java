package SetReview;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertToArray {

    public static void main(String[] args) {
       // convert a hashset to array
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(6);
        mySet.add(90);
        mySet.add(6);
        mySet.add(13);
        mySet.add(64);

        System.out.println(mySet);

        int[] myArray = new int[mySet.size()];

        int index = 0;
        for (Integer myvalue : mySet) {
            myArray[index++] = myvalue;

        }

        System.out.println(Arrays.toString(myArray));


    }
}
