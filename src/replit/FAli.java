package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FAli {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 45, 76, 1, 12));
        moveMinValue(list);
        System.out.println(list);
    }

    public static int minValue(ArrayList<Integer> list) {

        ArrayList<Integer> newList = new ArrayList<>(list);
        Collections.sort(newList);

        return newList.get(0);
    }

    public static ArrayList<Integer> moveMinValue(ArrayList<Integer> list) {
        int num = (minValue(list));
        list.removeIf(element -> element.equals(num));
        list.add(0, num);
        return list;
    }
}

