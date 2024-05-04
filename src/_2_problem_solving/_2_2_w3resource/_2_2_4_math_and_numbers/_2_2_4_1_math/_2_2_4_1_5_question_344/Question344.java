package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_5_question_344;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the absolute distinct value in an numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 6
 * </h2>
 */

public class Question344 {
    private static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(final String[] ARGS) {
        addNumbers();
        System.out.print(getDistinctNumbers());
    }

    private static int getDistinctNumbers() {
        int distinctNumbers = 0;
        for (final int NUMBER : numbers)
            if (numbers.indexOf(NUMBER) != numbers.lastIndexOf(NUMBER))
                distinctNumbers++;
        return distinctNumbers;
    }

    private static void addNumbers() {
        numbers.add(-1);
        numbers.add(-1);
        numbers.add(0);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(0);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
    }
}