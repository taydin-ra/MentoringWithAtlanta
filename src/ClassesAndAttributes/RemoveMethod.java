package ClassesAndAttributes;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add("Bran");
        myList.add("Rick");
        myList.add("Bran");

        if (myList.remove("Bran")) {
            myList.remove("John");
        }
        System.out.println(myList);
    }
}
