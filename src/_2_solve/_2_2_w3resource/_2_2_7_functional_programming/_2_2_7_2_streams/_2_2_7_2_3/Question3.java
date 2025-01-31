package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_2_streams._2_2_7_2_3;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the sum of all even, odd numbers in a list using streams.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5);
        final int SUM_OF_ODD_NUMBERS = NUMBERS
                .stream()
                .mapToInt(Integer::intValue)
                .filter(NUMBER -> NUMBER % 2 != 0)
                .sum();
        final int SUM_OF_EVEN_NUMBERS = NUMBERS
                .stream()
                .mapToInt(Integer::intValue)
                .filter(NUMBER -> NUMBER % 2 == 0)
                .sum();
        System.out.println("Sum of odd numbers: " + SUM_OF_ODD_NUMBERS);
        System.out.print("Sum of even numbers: " + SUM_OF_EVEN_NUMBERS);
    }
}