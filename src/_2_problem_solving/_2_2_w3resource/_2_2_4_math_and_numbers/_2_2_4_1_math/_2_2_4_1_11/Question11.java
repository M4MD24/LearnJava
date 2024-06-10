package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_11;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to accept two integers and return true if either is 15 or if their sum or difference is 15.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the first integer number: 15
 * <br/>
 * Input the second integer number: 25
 * <br/>
 * The result is: true
 * </h2>
 */

public class Question11 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 15,
                SECOND_NUMBER = 25;
        System.out.printf("""
                        Input the first integer number:\s%d
                        Input the second integer number:\s%d
                        The result is:\s%b""",
                FIRST_NUMBER,
                SECOND_NUMBER,
                areMeetRequirements(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static boolean areMeetRequirements(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER == 15 || SECOND_NUMBER == 15 ||
                (FIRST_NUMBER + SECOND_NUMBER) == 15 ||
                Math.abs(FIRST_NUMBER - SECOND_NUMBER) == 15;
    }
}