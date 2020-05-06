package study.techno;

import java.util.ArrayList;

public class FindingTheUniqueElement {
    /*
    Write a method the find the unique letter in a string
    String: "AAABBCDD"
               "AAABBCDD"
    return type String
     */
    public static void main(String[] args) {
        String myLetter = findUniqueElement("AAABBCDD");
        ArrayList<String> myCountries = new ArrayList<>();
        myCountries.add("USA");
        myCountries.add("USA");
        myCountries.add("England");
        myCountries.add("France");
        myCountries.add("Canada");
        myCountries.add("France");
        myCountries.add("Canada");

        findUniqueElement(findUniqueElement(myCountries));
    }


    public static String findUniqueElement(String myStr) {
        String[] s = myStr.split("");
        String result = "";
        for (int i = 0; i < s.length; i++) {
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[i].contains(s[j]))
                    count++;
            }
            if (count == 1)
                result += s[i];

        }
        return result;
    }

    public static String findUniqueElement(ArrayList<String> countries) {
        String result = "";
        for (int i = 0; i < countries.size(); i++) {
            int count = 0;
            for (int j = 0; j < countries.size(); j++) {
                if (countries.get(i).contains(countries.get(j)))
                    count++;
            }
            if (count == 1)
                result += countries.get(i);
        }

        return result;
    }
}
