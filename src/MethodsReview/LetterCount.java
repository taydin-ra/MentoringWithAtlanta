package MethodsReview;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LetterCount {
    /*
            Given one String
            Get an each char from String return the count of the each char

            For Example

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */
    public static LinkedHashMap<Character, Integer> charCount(String myStr) {

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        char[] ch = myStr.toCharArray();

        for (char c : ch) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            } else {
                result.put(c, 1);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //System.out.println(charCount("AAABBCDD"));

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('a', 3);
        map.put('b', 4);
        map.put('c', 5);

        if (map.containsKey('c')) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }

        System.out.println(map.get('c'));
    }
}
