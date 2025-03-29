package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_2_streams._2_2_1_1_7_2_1;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the average of a list of integers using streams.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5);
        final double AVERAGE_OF_NUMBERS = NUMBERS
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.print(AVERAGE_OF_NUMBERS);
    }
}