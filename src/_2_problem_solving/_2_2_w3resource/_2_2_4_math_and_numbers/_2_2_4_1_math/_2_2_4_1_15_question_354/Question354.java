package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_15_question_354;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to multiply two integers without multiplication, division, bitwise operators, and loops.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input first integer: 5
 * <br/>
 * Input second integer: 25
 * <br/>
 * Multiply of two integers: 125
 * </h2>
 */

public class Question354 {
    public static void main(final String[] ARGS) {
        int first_number = 5,
                second_number = 25;
        System.out.println(STR."Input first integer: \{first_number}");
        System.out.println(STR."Input second integer: \{second_number}");
        while (first_number > second_number) {
            first_number += second_number;
            second_number = first_number - second_number;
            first_number -= second_number;
        }
        System.out.print(STR."Multiply of two integers: \{getMultiplyOfTwoIntegers(first_number, second_number, 0)}");
    }

    private static int getMultiplyOfTwoIntegers(int first_number, final int SECOND_NUMBER, final int MULTIPLY_OF_TWO_INTEGERS) {
        if (first_number-- == 0)
            return MULTIPLY_OF_TWO_INTEGERS;
        else
            return getMultiplyOfTwoIntegers(first_number, SECOND_NUMBER, MULTIPLY_OF_TWO_INTEGERS + SECOND_NUMBER);
    }
}