package SetReview;

import org.junit.Assert;
import org.junit.Test;

public class MethodVoid {

    public void getSum(int a , int b){

        System.out.println(a+b);

    }

    @Test

    public void sumTe(){
        getSum(5,6);

    }
}
