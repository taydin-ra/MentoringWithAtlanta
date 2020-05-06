package study.techno;

public class Task1 {
    public static void main(String[] args) {
        /*
        check if your array has two 3 s next to each other
         */
        int []arr={1,2,3,3,4,5,3,3,6,7};
        boolean myCon=false;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3 && arr[i+1]==3){
                myCon=true;
                count ++;
            }else{
                myCon=false;
            }
        }
        System.out.println(count);
    }
}
