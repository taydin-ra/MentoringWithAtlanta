package MethodsReview;

public class Task {
    // create a method which checks if character is letter
    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character); // Wrapper class Integer, Double , Float
        return character >= 'a' && character <= 'z'; // return true ya da false
    }

    // create a method which counts letters in given string
    public static int countLetters(String text) {
        char[] chars = text.toCharArray(); // elemanlar character
        int counter = 0;
        for (char aChar : chars) {
            if (isLetter(aChar)) {  // if her zaman boolean condition ile calisir
                counter++;
            }
        }
        return counter;
    }

    // create a method which checks if character is digit
    public static boolean isDigit(char character) {
        return character >= '0' && character <= '9';
    }

    // create a method which counts digits in given string
    public static int countDigits(String text) {
        char[] chars = text.toCharArray();
        int counter = 0;
        for (char aChar : chars) {
            if (isDigit(aChar)) {
                counter++;
            }
        }

        return counter;
    }

    //    Write a Java method to check whether a string is a valid password.
    //    Password rules:
    //    A password must have at least ten characters.
    //    A password must contain at least two digits.
    //    A password consists of only letters and digits.

    // create a method which checks if length of string is at least 8 characters
    public static boolean hasValidLength(String text) {
        return text.length() >= 8;
    }

    public static boolean hasValidLength(String text, int minLength) {
        return text.length() >= minLength;
    }

    public static boolean isValidPassword(String password) {
        //    A password must have at least ten characters.
        if (!hasValidLength(password, 10)) {
            System.out.println("Password should have at least 10 characters");
            return false;
        }

        //    A password must contain at least two digits.
        int digitCount = countDigits(password);

        if (digitCount < 2) {
            System.out.println("Password should have at least 2 digits");
            return false;
        }

        //    A password consists of only letters and digits.
        int letterCount = countLetters(password);

        int totalCount = letterCount + digitCount;

        //# % & 155bjlgsdlnk

        if (password.length() != totalCount) {
            System.out.println("Password should have only letters and digits");
            return false;
        }

        System.out.println("Valid Password!!!");
        return true;

    }

    //    A password must have at least ten characters.
    //    A password must contain at least two digits.
    //    A password consists of only letters and digits.

    public static boolean isValid(String password) {
        boolean hasLength10 = hasValidLength(password, 10);  // true
        boolean hasAtLeastTwoDigits = countDigits(password) >= 2;  // true
        boolean consistsOfLettersAndDigits = password.length() == (countDigits(password) + countLetters(password)); // true

        return hasLength10 && hasAtLeastTwoDigits && consistsOfLettersAndDigits;
    }


    public static void main(String[] args) {
        System.out.println("method 1: " + isValidPassword("Jawwwwwwwwwwwww"));
        System.out.println("method 2: " + isValid("Jawwwwwwwwwwwwww"));
        //System.out.println(isDigit('1'));
    }

  //  1 1 2 3 5 8 13 21 34 55   fibonacci series

}
