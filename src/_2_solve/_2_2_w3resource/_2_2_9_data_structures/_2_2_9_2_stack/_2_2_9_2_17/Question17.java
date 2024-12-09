package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_17;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a stack and move the nth element from the top of the stack to the top.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        final int NTH_NUMBER = 6;
        addNumbers(NUMBERS);
        System.out.println("Numbers Before Swap: " + NUMBERS);
        swapTwoNumbersBetweenNTHAndTopNumbers(NUMBERS, NTH_NUMBER);
        System.out.print("Numbers After swap : " + NUMBERS);
    }

    private static void swapTwoNumbersBetweenNTHAndTopNumbers(final Stack<Integer> NUMBERS, final int NTH) {
        final int TOP_NUMBER = NUMBERS.firstElement(),
                NTH_NUMBER = NUMBERS.elementAt(NTH - 1);
        NUMBERS.set(0, NTH_NUMBER);
        NUMBERS.set(NTH - 1, TOP_NUMBER);
    }


    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(6);
        NUMBERS.push(2);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(1);
    }
}