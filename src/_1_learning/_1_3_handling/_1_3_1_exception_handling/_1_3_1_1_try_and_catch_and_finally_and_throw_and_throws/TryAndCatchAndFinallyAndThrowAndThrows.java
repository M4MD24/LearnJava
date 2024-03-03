package _1_learning._1_3_handling._1_3_1_exception_handling._1_3_1_1_try_and_catch_and_finally_and_throw_and_throws;

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
    public static void main(String[] args) {
        divideByZero();
        findFile();
    }

    static void divideByZero() {
        try {
            int divideByZero = 5 / 0;
            System.out.println("try");
        } catch (ArithmeticException e) { /* you can use more (catch) ! */
            System.out.println("catch: " + e.getMessage());
        } catch (Exception ee) {
            System.out.println("catch: " + ee.getMessage());
        } finally {
            System.out.println("finally");
        }
    }

    static void findFile() {
        try {
            fetchPathFile();
            throw new IOException("Unable to read file");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            throwDivideByZero();
        }
    }

    static void throwDivideByZero() {
        throw new ArithmeticException("Trying to divide by 0");
    }

    static void fetchPathFile() throws IOException {
        File newFile = new File("src/_1_learning/_1_3_handling/_1_3_1_exception_handling/_1_3_1_1_try_and_catch_and_finally_and_throw_and_throws/example.txt");
        FileInputStream stream = new FileInputStream(newFile);
    }
}