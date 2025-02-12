package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_43;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that accepts an integer and sums the elements from all possible subsets of a set formed by the first n natural numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of subsets of 25 is: 1157627904</h2>
 */

public class Question43 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 25;
        System.out.printf("Sum of subsets of %d is %d",
                NUMBER,
                getSubsetOfNumber(NUMBER));
    }

    private static int getSubsetOfNumber(final int NUMBER) {
        return (NUMBER * (NUMBER + 1) / 2) * (1 << (NUMBER - 1));
    }
}