package study.techno;

import java.util.Arrays;

public class Sum2DArray {
    public static void main(String[] args) {
     /*
     Create a 2D String Array which is
     [{"new jersey","atlanta","ohio"} ,
{"Pittsburgh" ,"ohio","new york","ohio"} ,
{"ohio","new york"}]

Change all the ohio to Florida

print the array

      */

        // code start here
        String[][] cities = {{"new jersey", "atlanta", "ohio" },
                {"Pittsburgh", "ohio", "new york", "ohio" },
                {"ohio", "new york" }};
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                if (cities[i][j].equals("ohio")) {
                    cities[i][j] = "florida";
                }
            }
        }
        System.out.println(Arrays.deepToString((cities)));
    }
}
