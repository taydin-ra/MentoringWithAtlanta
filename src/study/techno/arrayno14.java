package study.techno;

import java.util.Scanner;

public class arrayno14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split(" ");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for(int i = 0 ; i < intArr.length ; i++){

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] =i1;

            count++;
        }
        // your code start here
        // use intArr
        boolean b1=false;
        boolean b4=false;

        for(int i=0; i<arr1.length;i++){
            if(intArr[i]==1){
                b1=true;
                break;
            }
        }
        for(int i=0; i<arr1.length;i++){
            if( intArr[i]==4){
                b4=true;
                break;
            }
        }

        if(b1==true && b4==true){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }
}
