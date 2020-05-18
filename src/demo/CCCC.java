package demo;

public class CCCC {
    public static void main(String[] args) {
        int num = 20;
        int primeNumbers = 0;

        for (int i = 1; i < num; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeNumbers++;
            }
        }
        System.out.println(primeNumbers);
    }
}
