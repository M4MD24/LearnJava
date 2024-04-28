package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_71_question_221;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts six numbers as input and sorts them in descending order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input six integers:
 * <br/>
 * 4 6 8 2 7 9
 * <br/>
 * After sorting the said integers:
 * <br/>
 * 9 8 7 6 4 2
 * </h2>
 */

public class Question221 {
    public static void main(final String[] ARGS) {
        final ArrayList<Integer> NUMBERS = new ArrayList<>();
        inputNumbers(NUMBERS);
        System.out.println("Input six integers:");
        NUMBERS.forEach(NUMBER -> System.out.print(STR."\{NUMBER} "));
        NUMBERS.sort(Collections.reverseOrder());
        System.out.println("\nAfter sorting the said integers:");
        NUMBERS.forEach(NUMBER -> System.out.print(STR."\{NUMBER} "));
    }

    private static void inputNumbers(final ArrayList<Integer> NUMBERS) {
        NUMBERS.add(4);
        NUMBERS.add(6);
        NUMBERS.add(8);
        NUMBERS.add(2);
        NUMBERS.add(7);
        NUMBERS.add(9);
    }
}