package methodsReview;

public class FibonacciWithArrays {

    public static int fib(int n){
        int [] fib= new int[n+2];
        int result=0;

        fib[0]=0;
        fib [1]=1;

        for(int i=2; i<n+2; i++){
            fib[i]=fib[i-2] + fib [i-1];
        }
      for( int i=0; i< n+2 ; i++){
          result=fib[i];
      }
      return result;
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}
