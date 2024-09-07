package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_73;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the maximum sum of a contiguous subsequence from a given sequence of numbers a1, a2, a3, ... an. A subsequence of one element is also a continuous subsequence.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * How many numbers: 5
 * <br/>
 * Input the integers:
 * <br/>
 * 25 61 35 42 66
 * <br/>
 * Maximum sum of the said contiguous subsequence: 229
 * </h2>
 */

public class Question73 {
    public static void main(final String[] PARAMETERS) {
        final int COUNT_OF_NUMBERS = 5;
        System.out.printf("How many numbers %d\n", COUNT_OF_NUMBERS);
        System.out.println("input the integers:");
        final int[] NUMBERS = {25, 61, 35, 42, 66};
        printNumbers(NUMBERS);
        System.out.printf("\nMaximum sum of the said contiguous subsequence: %d", getSumNumbers(NUMBERS));
    }

    private static long getSumNumbers(final int[] NUMBERS) {
        long sum = 0;
        for (final int NUMBER : NUMBERS)
            sum += NUMBER;
        return sum;
    }

    private static void printNumbers(final int[] NUMBERS) {
        for (final int NUMBER : NUMBERS)
            System.out.printf("%d ", NUMBER);
    }
}