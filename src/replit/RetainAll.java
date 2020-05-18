package replit;

import java.util.Arrays;

public class RetainAll {
   /* Write a method called append

    That accepts two integer arrays as parameters

    and returns a new array that contains the result of appending the second array's values at the end of the first array.

    For example, if arrays array1 and array2 store {2, 4, 6} and c respectively,

    the call of append(array1 , array2 ) should return a new array containing
    {2, 4, 6, 1, 2, 3, 4, 5}.

    */

    public static int[] append(int[] array1, int[] array2) {
        int newLength = array1.length + array2.length;

        int[] arrayNew = new int[newLength];

        for (int i = 0; i < array1.length; i++) {
            arrayNew[i] = array1[i];

        }  // 0,1,2 indexleri doldurdum

        for (int i = array1.length; i < newLength; i++) {
            arrayNew[i] = array2[i - array1.length];

        }

        return arrayNew;
    }

    public static void main(String[] args) {
        int[] a = {2, 4, 6};
        int[] b = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(append(a, b)));
    }
}
