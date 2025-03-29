package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_39_exception_handling;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_39_exception_handling.files <h2>Question</h2>
 */

public class ExceptionHandling {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(power(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static long power(final int NUMBER, final int POWER_NUMBER) throws Exception {
        if (NUMBER == 0 && POWER_NUMBER == 0)
            throw new Exception("n and p should not be zero.");
        else if (NUMBER < 0 || POWER_NUMBER < 0)
            throw new Exception("n or p should not be negative.");
        else
            return (long) Math.pow(NUMBER, POWER_NUMBER);
    }
}