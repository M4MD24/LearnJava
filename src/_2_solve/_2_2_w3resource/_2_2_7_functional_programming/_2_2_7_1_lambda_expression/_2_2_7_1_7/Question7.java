package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to remove duplicates from a list of integers.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final List<Integer> NUMBERS = Arrays.asList(10, 22, 40, 22, 55, 30),
                REMOVED_DUPLICATED_NUMBERS = new ArrayList<>();
        NUMBERS
                .stream()
                .distinct()
                .forEach(REMOVED_DUPLICATED_NUMBERS::add);
        System.out.println("Original Numbers\t\t  : " + NUMBERS);
        System.out.print("Removed Duplicated Numbers: " + REMOVED_DUPLICATED_NUMBERS);
    }
}