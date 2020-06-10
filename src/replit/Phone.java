package replit;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Phone {


    public static ArrayList<String> cart=new ArrayList<>();

//    public int getSum(String num){
//        num=num.replaceAll()
//    }

    private String options(String a, String b){
        return null;
    }
}
class Apple{

    Phone n=new Phone() ;
    Method m= Phone.class.getDeclaredMethod("options", String.class, String.class);


    Apple() throws NoSuchMethodException {
    }
}