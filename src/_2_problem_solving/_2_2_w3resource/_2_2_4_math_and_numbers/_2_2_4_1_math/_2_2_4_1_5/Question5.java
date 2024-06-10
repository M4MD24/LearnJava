package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_5;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the absolute distinct value in an numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>6</h2>
 */

public class Question5 {
    private static final ArrayList<Integer> NUMBERS = new ArrayList<>();

    public static void main(final String[] ARGS) {
        addNumbers();
        System.out.print(getDistinctNumbers());
    }

    private static int getDistinctNumbers() {
        int distinctNumbers = 0;
        for (final int NUMBER : NUMBERS)
            if (NUMBERS.indexOf(NUMBER) != NUMBERS.lastIndexOf(NUMBER))
                distinctNumbers++;
        return distinctNumbers;
    }

    private static void addNumbers() {
        NUMBERS.add(-1);
        NUMBERS.add(-1);
        NUMBERS.add(0);
        NUMBERS.add(2);
        NUMBERS.add(2);
        NUMBERS.add(3);
        NUMBERS.add(0);
        NUMBERS.add(1);
        NUMBERS.add(5);
        NUMBERS.add(9);
    }
}