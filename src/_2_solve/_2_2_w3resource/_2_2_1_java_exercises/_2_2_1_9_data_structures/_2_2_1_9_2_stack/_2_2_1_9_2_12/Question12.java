package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_12;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to rotate the stack elements in the left direction.</h2>
 */

public class Question12 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        final int TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION = 2;
        addNumbers(NUMBERS);
        System.out.printf("""
                        Before: %s
                        Target number to rotate numbers to right direction: %d
                        After: %s""",
                NUMBERS,
                TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION,
                getRotateNumbersToLeftDirection(NUMBERS, TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION));
    }

    private static Stack<Integer> getRotateNumbersToLeftDirection(final Stack<Integer> NUMBERS, final int TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION) {
        return Stream.concat(
                NUMBERS.stream()
                        .skip(TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION),
                NUMBERS.stream()
                        .limit(TARGET_NUMBER_TO_ROTATE_NUMBERS_TO_LEFT_DIRECTION)
        ).collect(Collectors.toCollection(Stack::new));
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(1);
        NUMBERS.push(2);
        NUMBERS.push(3);
        NUMBERS.push(4);
        NUMBERS.push(5);
        NUMBERS.push(6);
    }
}