package StaticKeyword;

public class StaticWithChar {
    char kelime;
    static char letter;

    public static void main(String[] args) {
        StaticWithChar swc = new StaticWithChar();
        swc.kelime = 'a';
        swc.letter = 'e';
        StaticWithChar swc1 = new StaticWithChar();
        swc1.kelime = 'c';
        swc1.letter = 'd';

        System.out.println("swc.kelime: " + swc.kelime);
        System.out.println("swc.letter: " + swc.letter);
        System.out.println("swc1.kelime: " + swc1.kelime);
        System.out.println("swc1.letter: " + swc1.letter);

        
    }
}
