package _1_learn._1_2_handling._1_2_1_exception_handling._1_2_1_1_try_and_catch_and_finally_and_throw_and_throws;

/* ■ Exception Types Table */
/* ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * |  Exception Types   |  Description                                                                                                                                                                                                                                                                                                      |
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * |  RuntimeException  |  A runtime exception is a representation of a programming error. These occur from inappropriate use of a piece of code. For example, NullPointerException is a runtime exception that occurs when a piece of code tries to execute some code on a variable that hasn't been assigned an object and points to null |
 * |  IOException       |  This exception is typically a way to say that something on                                                                                                                                                                                                                                                       |
 * ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 * */

import java.io.*;

public class TryAndCatchAndFinallyAndThrowAndThrows {
    public static void main(final String[] ARGUMENTS) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Exception in main: " + e.getMessage());
        }

        try {
            findFile();
        } catch (IOException e) {
            System.out.println("Exception in main: " + e.getMessage());
        }
    }

    static void divideByZero() {
        int divideByZero = 0;
        try {
            divideByZero = 5 / 0;
            System.out.println("try");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Trying to divide by 0");
        } finally {
            System.out.println(divideByZero);
        }
    }

    static void findFile() throws IOException {
        try {
            fetchPathFile();
        } catch (FileNotFoundException e) {
            throw new IOException("Unable to read file");
        }
    }

    static void fetchPathFile() throws IOException {
        File newFile = new File("src\\_1_learn\\_1_2_handling\\_1_2_1_exception_handling\\_1_2_1_1_try_and_catch_and_finally_and_throw_and_throws\\example.txt");
        try (final FileInputStream STREAM = new FileInputStream(newFile)) {
            System.out.println("File found and opened successfully.");
        }
    }
}