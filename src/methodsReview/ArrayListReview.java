package methodsReview;

import java.util.ArrayList;

public class ArrayListReview {
    public static void main(String[] args) {
        int[] arr = new int[3];                      // Arraylerde
                                                  // arrayde uzunluk degismez sonra fixed length
                                                  //hem  objectler hem de data typelari kullanabiliriz
        arr[0] = 1;
        arr[1] = 7;

        Integer[] myArr = new Integer[8];
        // System.out.println(Arrays.toString(arr));
                                                                    //Arraylist
        ArrayList<String> myList = new ArrayList<>();            // sadece object kabul ediyor
                                                                 // uzunlugunu kucultebiliriz ya da buyultebiliriz
                                                                 // arraylist is dynamic
                                                                 // ordered, yani elemani ekleme sirasina gore olusturuyor

        myList.add("Merve");                           // 0. index  // eleman ekledigimde add
        myList.add("Tugba");                           // 1.index
        myList.add("Hafize");                          //2.index
        myList.add("Hale");
        myList.add("Ersin");
        myList.add("Hafize");
        myList.get(1);
        // indexle ulasmak istedigimde get(index)
        myList.set(0, "Ulku");                  // elemani yeni bi degerle guncellemek istedigimde
        myList.remove(0);                // elemani cikarmak istedigimde
        myList.indexOf("Hale");                // elemanin indexine ulasmak itsedigimde

        int myNum = myList.indexOf("Hale");
        // String myName = myList.get(2);

        System.out.println(myList.indexOf("Hale"));
        System.out.println(myNum);

    }
}
