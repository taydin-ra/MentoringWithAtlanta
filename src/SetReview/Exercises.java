package SetReview;

import java.util.HashSet;

public class Exercises {

    //Write a Java program to compare two sets and retain elements which are same on both sets.

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        convertToSet(set1, new int[]{35, 12, 67, 45, 32});

        HashSet<Integer> set2 = new HashSet<>();
        convertToSet(set2, new int[]{12, 67, 45, 33, 98});

        System.out.println("set1 " + set1);
        System.out.println("set2 " + set2);


        HashSet<Integer> totalElements = totalElements(set1, set2);

        System.out.println("all elements are here " + totalElements);

        HashSet<Integer> commonElements = commonElements(set1, set2);

        System.out.println("only common elements " + commonElements);

    }

    //create a method that converts int[] array to HashSet

    public static HashSet<Integer> convertToSet(HashSet<Integer> set, int[] array) {

        for (int number : array) {
            set.add(number);
        }
        return set;
    }
    //create a method returns HashSet that stores all elements inside

    public static HashSet<Integer> totalElements(HashSet<Integer> set1, HashSet<Integer> set2) {

        HashSet<Integer> totalElements = new HashSet<>();

        totalElements.addAll(set1);
        totalElements.addAll(set2);

        return totalElements;
    }
    //create a method returns HashSet that stores only common elements inside

    public static HashSet<Integer> commonElements(HashSet<Integer> set1, HashSet<Integer> set2) {

        HashSet<Integer> commonElements = new HashSet<>();

        commonElements.addAll(set1);
        commonElements.retainAll(set2);

        return commonElements;
    }
}
