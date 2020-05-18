package methodsReview;

public class FibonacciSeries {

    public static int fib(int n){
        int first=0,second=1;
        int c=0;
        if(n==0)
            return first;

        System.out.println(first);
        System.out.println(second);
        for(int i=2; i<=n; i++){
            c=first+second;
            first=second;
            second=c;

            System.out.println(c);
        }
        return c;
    }
//0 1 1 2 3
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}
