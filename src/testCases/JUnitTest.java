package testCases;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class JUnitTest {


    @Test
// positive test
    public void myNameTest() {
        NameTest nt = new NameTest();
        String actual = nt.name("Abdullahh");
        String expected = "You have a long name";
        Assert.assertEquals(expected, actual);

    }

    @Test
    // negative test
    public void myNameTest1() {
        NameTest nt = new NameTest();
        String actual = nt.name("Abdulla");
        String expected = "You have a long name";

        Assert.assertNotEquals(expected, actual);

    }

    @Test

    public void countTest() {
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Orange");
        myList.add("Orange");
        myList.add("Orange");
        int actual = ReplitArrayList.getCount(myList, "Orange");
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    // positive test
    public void nameTest3(){
        NameTest nt= new NameTest();
        boolean actual=nt.name2("Tugba$");
        Assert.assertTrue(actual);
    }

    @Test
    // negative test
    public void nameTest2(){
        NameTest nt = new NameTest();  // NameTest classinin default constructor i

        boolean actual=nt.name2("Tugba@");

        Assert.assertFalse(actual);
    }

}
