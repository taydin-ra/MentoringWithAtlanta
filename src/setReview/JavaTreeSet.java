package setReview;
import java.util.*;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {

        TreeSet<String>  myTree= new TreeSet<>();  // sort yapmak icin

        myTree.add("z");
        myTree.add("a");
        myTree.add("b");
        myTree.add("t");

        System.out.println(myTree);

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(6);
        mySet.add(90);
        mySet.add(6);
        mySet.add(13);
        mySet.add(64);

        TreeSet<Integer>  myTree1= new TreeSet<>(mySet);
        System.out.println(myTree1);









    }
}
