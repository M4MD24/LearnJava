package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_2;

import java.text.DecimalFormat;
import java.util.stream.LongStream;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program that categorizes integers between 1 and 10,000 as Abundant, Deficient, and Perfect.
 * <br/>
 * In number theory, an abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 * </h2>
 * <h1>Example:</h1>
 * <h2>
 * The first few abundant numbers are:
 * <br/>
 * 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66, 70, 72, 78, 80, 84, 88, 90, 96, 100, 102,…
 * <br/>
 * The integer 12 is the first abundant number. Its proper divisors are 1, 2, 3, 4 and 6 for a total of 16.
 * <br/>
 * Deficient number: In number theory, a deficient number is a number n for which the sum of divisors σ(n)<2n, or, equivalently, the sum of proper divisors (or aliquot sum) s(n)<n. The value 2n − σ(n) (or n − s(n)) is called the number's deficiency.
 * <br/>
 * As an example, divisors of 21 are 1, 3 and 7, and their sum is 11. Because 11 is less than 21, the number 21 is deficient. Its deficiency is 2 × 21 − 32 = 10.
 * <br/>
 * The first few deficient numbers are:
 * <br/>
 * 1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 25, 26, 27, 29, 31, 32, 33, …….
 * <br/>
 * Perfect number: In number system, a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
 * <br/>
 * Equivalently, a perfect number is a number that is half the sum of all of its positive divisors (including itself) i.e. σ1(n) = 2n.
 * <br/>
 * The first perfect number is 6. Its proper divisors are 1, 2, and 3, and 1 + 2 + 3 = 6. Equivalently, the number 6 is equal to half the sum of all its positive divisors: ( 1 + 2 + 3 + 6 ) / 2 = 6. The next perfect number is 28 = 1 + 2 + 4 + 7 + 14. This is followed by the perfect numbers 496 and 8128.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Number Counting (between 1 to 10,000):
 * <br/>
 * Deficient number: 7508
 * <br/>
 * Perfect number: 4
 * <br/>
 * Abundant number: 2488
 * </h2>
 */

public class Question2 {
    private static int deficientNumbers = 0,
            perfectNumbers = 0,
            abundantNumbers = 0;

    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 10_000;
        categorizingNumbersFromOneToTargetNumber(TARGET_NUMBER);
        System.out.printf("""
                        Number counting (between 1 to %s):
                        Deficient numbers: %d
                        Perfect numbers: %d
                        Abundant numbers: %d""",
                new DecimalFormat("###,###").format(TARGET_NUMBER),
                deficientNumbers,
                perfectNumbers,
                abundantNumbers);
    }

    private static void categorizingNumbersFromOneToTargetNumber(final int TARGET_NUMBER) {
        for (int number = 1; number <= TARGET_NUMBER; number++) {
            final long DIVISOR_SUM = getDivisorSum(number);
            if (DIVISOR_SUM < number)
                deficientNumbers++;
            else if (DIVISOR_SUM == number)
                perfectNumbers++;
            else
                abundantNumbers++;
        }
    }

    private static long getDivisorSum(final int TARGET_NUMBER) {
        return LongStream.rangeClosed(1, (TARGET_NUMBER + 1) / 2).filter(number -> TARGET_NUMBER % number == 0 && TARGET_NUMBER != number).sum();
    }
}