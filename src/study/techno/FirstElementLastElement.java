package study.techno;

public class FirstElementLastElement {
    public static void main(String[] args) {
        /*
        check your array's first and last elements are same
         */

        String str="Atlanta";
        char[]ch=str.toCharArray();
        char[]ch1={'A','t','l','a','n','t','a'};

        ch1[0]='A';
        ch[ch1.length-1]='a';
        ch1[(ch1.length-1)/2]='a';  // middle letter

        System.out.println( ch1[(ch1.length-1)/2]);












        int []arr={2,6,4,8,2}; // last element is index 4
        int len=arr.length; //5

//        arr[0]=2;
//        arr[len-1]=2;  // last element
        boolean myCon=false;
        for(int i=0;i<len;i++){
            if(arr[0]==arr[len-1]){
                myCon=true;
            }else{
               myCon=false;
            }
        }
        System.out.println(myCon);
    }
}
