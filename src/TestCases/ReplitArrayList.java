package TestCases;

import java.util.ArrayList;

public class ReplitArrayList {
    /*
    Create one method name is getCount()

Parameter is one String ArrayList , one String

return type is int.

Count how many times your parameter String occurs in the arraylist and return the count

For Example:
ArrayList is Orange , Kiwi , Peach , Banana , Orange

String is Orange

count should be 2
     */

    public static int getCount(ArrayList<String> list, String str) {

        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {

                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        ArrayList<String> myList= new ArrayList<>();

        myList.add("Orange");
        myList.add("Orange");
        myList.add("Orange");

       int a= getCount(myList,"Orange");
        System.out.println(a);


    }
}
