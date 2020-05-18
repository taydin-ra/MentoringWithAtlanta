package methodsReview;

public class ReturnTypes {
   /*
   String  array= "AtlantaGroup"
   "xtlxntxGrxxp"
   create a method change the vowels to 'x'
    */


    public static String vowels(String str) {
        for (int i = 0; i < str.length(); i++) {
            str = str.replaceAll("[AaEeIiOoUu]", "x");

        }
        return str;
    }

    public static void main(String[] args) {
        String myNewString = vowels("AtlantaGroup");

        System.out.println(myNewString);

        String concat = myNewString.concat("Best");

        System.out.println(concat);

    }


}
