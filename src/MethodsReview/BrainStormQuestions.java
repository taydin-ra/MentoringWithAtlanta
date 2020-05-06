package MethodsReview;

import java.util.ArrayList;

public class BrainStormQuestions {

    public static int minValue(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {  // i=0 //i=1 // i=2 // i=3
            if (arr[i] < min) {  //arr[0]<Integer.MAX_VALUE;
                min = arr[i];  // min=arr[0]
            }
        }
        return min;
    }

    // methodlar reusable
    public static int minValue(ArrayList<Integer> myList) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < min) {
                min = myList.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);  //0
        list.add(8);  //1
        list.add(1);// 2

       // System.out.println(minValue(list));

        String []myAr={"apple", "kiraz","apple","kivi"};

        for (int i = 0; i <myAr.length ; i++) {
            if(myAr[i].equals("apple")){
                myAr[i]="portakal";
            }
           // System.out.println(myAr[i]);
        }

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("apple");
        list2.add("kivi");

        for (int i = 0; i <list2.size() ; i++) {
            if(list2.get(i).equals("apple")){
              list2.set(i,"portakal");  // indexOf
            }
        }
        System.out.println(list2);
    }



    public static void getSum(int a, int b) {
        System.out.println(a + b);
    }



}
