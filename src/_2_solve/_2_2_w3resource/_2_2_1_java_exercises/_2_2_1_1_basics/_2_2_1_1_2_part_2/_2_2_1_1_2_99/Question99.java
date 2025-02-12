package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_99;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>From Wikipedia, The Hamming weight of a string is the number of symbols that are different from the zero-symbol of the alphabet used. It is thus equivalent to the Hamming distance from the all-zero string of the same length. For the most typical case, a string of bits, this is the number of 1's in the string, or the digit sum of the binary representation of a given number and the ℓ₁ norm of a bit vector. In this binary case, it is also called the population count, pop-count, sideways sum, or bit summation.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 1427
 * <br/>
 * 6
 * </h2>
 */

public class Question99 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input a number: ");
        System.out.print(hammingWeight(INPUT.nextInt()));
    }

    private static int hammingWeight(int number) {
        int counter = 0;
        while (number != 0) {
            counter += number & 1;
            number >>>= 1;
        }
        return counter;
    }
}