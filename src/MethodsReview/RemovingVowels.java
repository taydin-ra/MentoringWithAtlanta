package MethodsReview;

public class RemovingVowels {

    public static void main(String[] args) {
        //Write a method that would replace every vowel in the string with x
        String a = "TechnoStudy";

        System.out.println(a);
        System.out.println(iWantToCallSomeMethod(a));
        System.out.println(conCat(a,"bb"));

    }

    private static String iWantToCallSomeMethod(String s) {
        for (int i = 0; i <= s.length(); i++) {
            s = s.replaceAll("[AaEeIiOoUu]", "X");
        }
        return s;
    }

    private static String conCat(String s1, String c1){
        s1=s1.concat(c1);
        return s1;
    }
}

