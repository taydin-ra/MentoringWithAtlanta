package exceptions;

import java.io.IOException;

public class ThrowingCheckedExceptions {

    public static void checkName(String name) throws IOException {  // checked exceptions
        // you have to handle it
        if (name == null) {
            throw new IOException("Wrong name");
        }

        if (name.contains("t")) {
            throw new RuntimeException("I don't like this name");
        }
    }

    public static void main(String[] args) throws IOException {

        try {
            checkName(null);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Your name is fine");
        }

    }
}

