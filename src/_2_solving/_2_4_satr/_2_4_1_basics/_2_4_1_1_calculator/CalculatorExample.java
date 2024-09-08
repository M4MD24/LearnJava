package _2_solving._2_4_satr._2_4_1_basics._2_4_1_1_calculator;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(final String[] PARAMETERS) {
        final TwoNumbersAndOperator TWO_NUMBERS_AND_OPERATOR = inputValues();
        System.out.print(calculateArithmeticOperation(TWO_NUMBERS_AND_OPERATOR.firstNumber, TWO_NUMBERS_AND_OPERATOR.mathematicalOperator, TWO_NUMBERS_AND_OPERATOR.secondNumber));
    }

    private static TwoNumbersAndOperator inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        final double FIRST_NUMBER = INPUT.nextDouble();
        System.out.print("Enter Second Number: ");
        final double SECOND_NUMBER = INPUT.nextDouble();
        System.out.print("Enter Arithmetic Operator: ");
        final char ARITHMETIC_OPERATOR = INPUT.next().charAt(0);
        return new TwoNumbersAndOperator(FIRST_NUMBER, SECOND_NUMBER, ARITHMETIC_OPERATOR);
    }

    private record TwoNumbersAndOperator(double firstNumber, double secondNumber, char mathematicalOperator) {
    }

    private static double calculateArithmeticOperation(final double FIRST_NUMBER, final char MATHEMATICAL_OPERATOR, final double SECOND_NUMBER) {
        return switch (MATHEMATICAL_OPERATOR) {
            case '+' -> FIRST_NUMBER + SECOND_NUMBER;
            case '-' -> FIRST_NUMBER - SECOND_NUMBER;
            case '*' -> FIRST_NUMBER * SECOND_NUMBER;
            case '/' -> FIRST_NUMBER / SECOND_NUMBER;
            case '%' -> FIRST_NUMBER % SECOND_NUMBER;
            default -> throw new IllegalStateException("Unexpected value: " + MATHEMATICAL_OPERATOR);
        };
    }
}