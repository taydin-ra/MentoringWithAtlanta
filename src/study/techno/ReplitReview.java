package study.techno;

public class ReplitReview {
    public static void main(String[] args) {
        /*
        Create a String array "$12 $23 $10 $2 $5 $2"
        remove the $ sign and sum all the numbers
        print the total of the numbers





         */
        String [] str={"$12","$23", "$10", "$2", "$5", "$2"};
        String ss="";
        int total=0;
        for (int i = 0; i < str.length ; i++) {
            if(str[i].contains("$")){
                ss=str[i].replace("$","");
                int i1=Integer.parseInt(ss);
                total+=i1;
            }
        }
        System.out.println(total);
    }
}
