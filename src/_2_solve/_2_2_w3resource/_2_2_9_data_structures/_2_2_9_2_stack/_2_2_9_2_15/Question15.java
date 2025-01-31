package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_15;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the nth element from the top of the stack.</h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        final int NTH_NUMBER = 4;
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        System.out.printf(
                "%dth = %d",
                NTH_NUMBER,
                NUMBERS.elementAt(NTH_NUMBER - 1)
        );
    }


    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(1);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(2);
        NUMBERS.push(5);
        NUMBERS.push(6);
    }
}