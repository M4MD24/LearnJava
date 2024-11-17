package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_44_exception_handling_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_44_exception_handling_try_catch.files <h2>Question</h2>
 */

public class ExceptionHandlingTryCatch {
    public static void main(final String[] PARAMETERS) {
        try (final Scanner INPUT = new Scanner(System.in)) {
            System.out.print(INPUT.nextInt() / INPUT.nextInt());
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.print("java.lang.ArithmeticException: " + e.getMessage());
        }
    }
}