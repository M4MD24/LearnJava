package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_19;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method that accepts three integers and returns true if one is the middle point between the other two integers, otherwise false.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the first number: 2
 * <br/>
 * Input the second number: 4
 * <br/>
 * Input the third number: 6
 * <br/>
 * Check whether the three said numbers has a midpoint!
 * <br/>
 * true
 * </h2>
 */
public class Question19 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 2,
                SECOND_NUMBER = 8,
                THIRD_NUMBER = 5;
        printNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        System.out.println("Check whether the three said numbers has a midpoint!");
        System.out.print(isMidPoint(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER));
    }

    private static boolean isMidPoint(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        return (FIRST_NUMBER == SECOND_NUMBER) && (SECOND_NUMBER == THIRD_NUMBER) ||
                (THIRD_NUMBER - SECOND_NUMBER) == (SECOND_NUMBER - FIRST_NUMBER) ||
                (SECOND_NUMBER - THIRD_NUMBER) == (THIRD_NUMBER - FIRST_NUMBER) ||
                (SECOND_NUMBER - FIRST_NUMBER) == (FIRST_NUMBER - THIRD_NUMBER) ||
                (FIRST_NUMBER - SECOND_NUMBER) == (SECOND_NUMBER - THIRD_NUMBER);
    }

    private static void printNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf("Input the first number: %d", FIRST_NUMBER);
        System.out.printf("Input the second number: %d", SECOND_NUMBER);
        System.out.printf("Input the third number: %d", THIRD_NUMBER);
    }
}