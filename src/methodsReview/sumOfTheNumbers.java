package methodsReview;

public class sumOfTheNumbers {

    public static double sumOfNumbers(double a, double b) {

        return a + b;
    }

    public static void main(String[] args) {
        int[] my = myArray(3);
        my[0] = 1;
        my[1] = 2;
        my[2] = 5;
        for (int i = 0; i < my.length; i++) {
            System.out.println(my[i]);
        }
    }

    public static int[] myArray(int n) {
        int arr[] = new int[n];
        return arr;
    }
}