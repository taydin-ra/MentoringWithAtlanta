package study.techno;

import java.util.Arrays;

public class twoDArray {
    public static void main(String[] args) {
        /*
        Create a 2D int Array which is   [{2,3,2} , {4,1,5} , {7,2,5}]
           Change all the 2 to 6
            print the array
         */

        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;
                }
                System.out.print(array[i][j] + " ");
            }

        }
    }
}
