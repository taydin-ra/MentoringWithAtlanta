package TestCases;

public class NameTest {
    String name;
    public String name(String myName) {
        int len = myName.length();
        String result = "";
        if (len > 8) {
            result = "You have a long name";
        } else {
            result = "Your name is good enough";
        }
        return result;

    }

    /*
  String name
  test case yazilacak
  name includes $ or not
   */
    public boolean name2(String str) {
        boolean result = false;

        if (str.contains("$")) {
            result = true;

        } else {
            result = false;
        }
        return result;
    }


}
