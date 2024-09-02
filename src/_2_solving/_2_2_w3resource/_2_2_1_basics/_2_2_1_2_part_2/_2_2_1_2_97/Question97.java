package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_97;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that accepts three integers and checks whether the sum of the first two integers is greater than the third integer. Three integers are in the interval [-2^31, 2^31 ].</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input three integers (a,b,c):
 * <br/>
 * 5 8 9
 * <br/>
 * Check whether (a + b) is greater than c?
 * <br/>
 * true
 * </h2>
 */

public class Question97 {
    public static void main(final String[] ARGS) {
        System.out.println("Input three integers (a,b,c):");
        final int FIRST_NUMBER = 5,
                SECOND_NUMBER = 8,
                THIRD_NUMBER = 9;
        System.out.printf("%d %d %d\n",
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
        System.out.println("Check whether (a + b) is greater than c?");
        System.out.print(firstNumberPlusSecondNumberGreaterThanThirdNumber(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER));
    }

    private static boolean firstNumberPlusSecondNumberGreaterThanThirdNumber(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        return (FIRST_NUMBER + SECOND_NUMBER) > THIRD_NUMBER;
    }
}