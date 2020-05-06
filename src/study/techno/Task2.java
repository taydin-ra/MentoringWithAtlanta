package study.techno;

public class Task2 {

    public static int sum(int n){
        int total=0;
        for(int i =0; i<=n;i++){
            total+=i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sum(4));
    }
}
