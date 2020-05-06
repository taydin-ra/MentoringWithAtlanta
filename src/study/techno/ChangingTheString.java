package study.techno;

import java.util.Arrays;

public class ChangingTheString {
    public static Boolean catdog(String str) {
        boolean my=false;
        int str1 = str.length();
        String stcat = str.replaceAll("cat", "");
        int str2 = stcat.length();
        int cattimes = (str1 - str2) / 3;

        String stdog = str.replaceAll("dog", "");
        int str3 = stdog.length();
        int dogtimes = (str1 - str3) / 3;

        if (cattimes == dogtimes) {
            my= true;
        } else {
            my= false;
        }
        return my;
    }

    public static void main(String[] args) {
        System.out.println(catdog("catcat1dog2dog$2"));
    }

}