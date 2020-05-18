package setReview;

public class PalindromeProjeQuestion {

    public static void main(String[] args) {
        System.out.println(palindromeNum(349));
    }

    public static int reverseNum(int num) {
        int rem = 0;
        int reverse = 0;
        boolean my = false;
        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    }

    //   public static int Palindrome(int myNum) {
//
//        boolean b1 = false;
//        int count = 0;
//
//        while (b1 == false) {
//            if (myNum == reverseNum(myNum)) {
//                b1 = true;
//            } else {
//                myNum += reverseNum(myNum);
//            }
//            count++;
//        }
//        return count;
//
//    }
    public static int palindromeNum(int num) {

        int counter = 0;
        while (num != reverseNum(num)) {
            num = num + reverseNum(num);

            counter++;
        }

        return counter;
    }


}

