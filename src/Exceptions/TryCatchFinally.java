package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
/*

        https://www.geeksforgeeks.org/flow-control-in-try-catch-finally-in-java/

        https://stackify.com/best-practices-exceptions-java/


        Control flow in try-catch clause OR try-catch-finally clause

        Case 1: Exception occurs in try block and handled in catch block
        Case 2: Exception occurs in try-block is not handled in catch block
        Case 3: Exception doesn’t occur in try-block


         try-finally clause

        Case 1: Exception occurs in try block
        Case 2: Exception doesn’t occur in try-block

         */


        // array of size 4.
        int[] arr = new int[4];  // 0,1,2,3 indexler


        //1
//        try {
//            int i = arr[4]; // exception burda cikiyor
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Exception caught in Catch block");
//        }
//
//        // rest program will be executed
//        System.out.println("Outside try-catch clause");


//        //2
//        try {
//            int i = arr[4];
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Exception caught in catch block");
//        } finally {
//            System.out.println("finally block executed");
//        }
//
//        // rest program will be executed
//        System.out.println("Outside try-catch-finally clause");
//
//        //3
//        try {
//            int i = arr[4];
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        }
//
//        // not a appropriate handler
//        catch (NullPointerException ex) {
//            System.out.println("Exception has been caught");
//        }
//
////        // rest program will not execute
//        System.out.println("Outside try-catch clause");
//
//        //4
//
//        try {
//            int i = arr[4];
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        }
//        // not a appropriate handler
//        catch (NullPointerException ex) {
//            System.out.println("Exception has been caught");
//        } finally {
//            System.out.println("finally block executed");
//        }
//        // rest program will not execute
//        System.out.println("Outside try-catch-finally clause");
//
//        //5
//
//        try {
//            String str = "123";
//            int num = Integer.parseInt(str);
//
//            // this statement will execute
//            // as no any exception is raised by above statement
//            System.out.println("Inside try block");
//
//        } catch (NumberFormatException ex) {
//            System.out.println("catch block executed...");
//        }
//
//        System.out.println("Outside try-catch clause");
//
//
//        //6
//
//        try {
//
//            String str = "123";
//            int num = Integer.parseInt(str);
//            // this statement will execute
//            // as no any exception is raised by above statement
//            System.out.println("try block fully executed");
//
//        } catch (NumberFormatException ex) {
//
//            System.out.println("catch block executed...");
//
//        } finally {
//            System.out.println("finally block executed");
//        }
//
//        System.out.println("Outside try-catch-finally clause");
//
//        //7
//        try {
//            int i = arr[4];
//
//            // this statement will never execute
//            // as exception is raised by above statement
//            System.out.println("Inside try block");
//        } finally {
//            System.out.println("finally block executed");
//        }
//
//// rest program will not execute
//        System.out.println("Outside try-finally clause");
//
//        //8
//
        try {
            String str = "123";
            int num = Integer.parseInt(str);

            // this statement will execute
            // as no any exception is raised by above statement
            System.out.println("Inside try block");
            System.exit(0); // finally i yazdirmak istemiyorsak
        } finally {
            System.out.println("finally block executed");

        }

        // rest program will be executed
        System.out.println("Outside try-finally clause");
    }
}