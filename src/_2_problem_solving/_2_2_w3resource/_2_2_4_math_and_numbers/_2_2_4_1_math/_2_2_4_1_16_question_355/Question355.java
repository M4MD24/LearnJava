package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_16_question_355;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to calculate power of a number without using multiplication(*) and division(/) operators.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the base: 2
 * <br/>
 * Input the exponent: 5
 * <br/>
 * Power of the number: 32
 * </h2>
 */

public class Question355 {
    public static void main(final String[] ARGS) {
        final int BASE = 2,
                EXPONENT = 5;
        System.out.print(STR."""
                Input the base: \{BASE}
                Input the exponent: \{EXPONENT}
                Power of the number: \{getPowerOfTheNumber(BASE, EXPONENT)}""");
    }

    private static int getPowerOfTheNumber(final int BASE, final int EXPONENT) {
        int powerOfTheNumber = BASE,
                temporaryResult = BASE;
        for (int power = 1; power < EXPONENT; power++) {
            for (int counter = 1; counter < BASE; counter++)
                powerOfTheNumber += temporaryResult;
            temporaryResult = powerOfTheNumber;
        }
        return powerOfTheNumber;
    }
}