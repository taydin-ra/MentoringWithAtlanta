package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ssss {
    //
    public static void minToFront(ArrayList<Integer> array) {
        int minIndex = 0;

        for (int i = 1; i < array.size(); i++) {
            if (array.get(i)<array.get(minIndex) ) {
                minIndex = i;
            }
        }

        int minValue = array.remove(minIndex);
        array.add(0, minValue);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 45, 76, 1, 12));
        minToFront(list);
        System.out.println(list);
    }

}

