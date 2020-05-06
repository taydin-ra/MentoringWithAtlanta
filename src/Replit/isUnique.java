package Replit;

public class isUnique {

    public static boolean isUnique(int[] array) {
        boolean myCon = false;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    myCon = false;
                    break;

                }
            }
        }
        return myCon;
    }

    public static void main(String[] args) {
        int[] list = {3, 8, 12, 2, 9, 17, 17};

       isUnique(list);
    }
}
