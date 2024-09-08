package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_6;

/**
 * <h3>Static Nested Class and Static Methods</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator. The Calculator class should have a static method add(int a, int b) that returns the sum of a and b. Call the add() method from the main method.</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 9,
                SECOND_NUMBER = 6;
        System.out.print("Sum of " + FIRST_NUMBER + " and " + SECOND_NUMBER + " = " + MathUtil.Calculator.add(FIRST_NUMBER, SECOND_NUMBER));
    }
}

class MathUtil {
    static class Calculator {
        static long add(final int FIRST_NUMBER, final int SECOND_NUMBER) {
            return FIRST_NUMBER + SECOND_NUMBER;
        }
    }
}