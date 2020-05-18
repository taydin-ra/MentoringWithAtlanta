package stringBuilder;

public class Ex1 {
    public static void main(String[] args) {
        String alpha = "";
        StringBuilder sb= new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
            alpha += i;

        }
        System.out.println(sb.toString());
    }
}
