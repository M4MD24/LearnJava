package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_3_if_and_else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer, n, perform the following conditional actions:
 * <br/>
 * <br/>
 * • If n is odd, print Weird
 * <br/>
 * • If n is even and in the inclusive range of 2 to 5, print Not Weird
 * <br/>
 * • If n is even and in the inclusive range of 6 to 20, print Weird
 * <br/>
 * • If n is even and greater than 20, print Not Weird
 * <br/>
 * <br/>
 * Complete the stub code provided in your editor to print whether or not n is weird.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <br/>
 * <br/>
 * <h1>Output:</h1>
 * <h2>Weird</h2>
 */

public class IfAndElse {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int NUMBER = Integer.parseInt(INPUT.readLine());
        OUTPUT.write((isweird(NUMBER) ? "" : "Not ") + "Weird");
        OUTPUT.flush();
    }

    private static boolean isOdd(final int NUMBER) {
        return NUMBER % 2 != 0;
    }

    private static boolean isweird(final int NUMBER) {
        if (isOdd(NUMBER))
            return true;
        else {
            if (isInInclusiveRange(2, NUMBER, 5))
                return false;
            else if (isInInclusiveRange(6, NUMBER, 20))
                return true;
            else if (isGreaterThanTargetNumber(NUMBER, 20))
                return false;
            return false;
        }
    }

    private static boolean isGreaterThanTargetNumber(final int NUMBER, final int TARGET_NUMBER) {
        return NUMBER > TARGET_NUMBER;
    }

    private static boolean isInInclusiveRange(final int START_NUMBER, final int NUMBER, final int END_NUMBER) {
        return NUMBER >= START_NUMBER &&
                NUMBER <= END_NUMBER;
    }
}