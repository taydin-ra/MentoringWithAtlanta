package study.techno;

import java.util.Arrays;

public class WordCount {

    public static void main(String[] args) {
        String s1 =  "Removes/white/space/from/both/ends/of/a/string";

        String [] a1= s1.split("/");

        System.out.println(a1.length);
        System.out.println(Arrays.deepToString(a1));
    }
}
