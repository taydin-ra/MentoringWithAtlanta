package ClassesAndAttributes;

public class StringReverse {
    public static void main(String[] args) {
        String str="Hello World";
        char [] ch=str.toCharArray(); // "h","e","l","l"
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
