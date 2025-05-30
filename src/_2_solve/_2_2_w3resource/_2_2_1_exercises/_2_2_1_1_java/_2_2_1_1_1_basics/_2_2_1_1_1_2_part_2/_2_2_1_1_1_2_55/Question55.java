package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_55;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether an integer is a power of 2 or not using O(1) time.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * O(1) means that it takes a constant time, like 12 nanoseconds, or two minutes no matter the amount of data in the set.
 * <br/>
 * O(n) means it takes an amount of time linear with the size of the set, so a set twice the size will take twice the time. You probably don't want to put a million objects into one of these.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 25
 * <br/>
 * false
 * </h2>
 */

public class Question55 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 25;
        System.out.printf("Input a number: %d\n", NUMBER);
        System.out.print(isPowerOfTwo(NUMBER));
    }

    private static boolean isPowerOfTwo(final long NUMBER) {
        return ((Math.log10(NUMBER) / Math.log10(2)) % 1 == 0);
    }
}