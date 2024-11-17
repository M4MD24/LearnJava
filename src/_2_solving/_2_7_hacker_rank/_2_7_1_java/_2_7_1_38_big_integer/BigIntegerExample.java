package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_38_big_integer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_38_big_integer.files <h2>Question</h2>
 */

public class BigIntegerExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final BigInteger FIRST_NUMBER = new BigInteger(INPUT.nextLine()),
                SECOND_NUMBER = new BigInteger(INPUT.nextLine());
        System.out.print(FIRST_NUMBER.add(SECOND_NUMBER) + "\n" + FIRST_NUMBER.multiply(SECOND_NUMBER));
    }
}