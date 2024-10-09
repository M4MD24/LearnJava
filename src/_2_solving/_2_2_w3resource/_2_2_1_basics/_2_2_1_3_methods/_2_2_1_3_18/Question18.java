package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the first number: 15
 * <br/>
 * Input the second number: 16
 * <br/>
 * Input the third number: 17
 * <br/>
 * Check whether the three said numbers are consecutive or not!
 * <br/>
 * true
 * </h2>
 */
public class Question18 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 15,
                SECOND_NUMBER = 16,
                THIRD_NUMBER = 17;
        printNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        System.out.println("Check whether the three said numbers are consecutive or not!");
        System.out.print(areThreeNumbersConsecutive(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER));
    }

    private static boolean areThreeNumbersConsecutive(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        return (SECOND_NUMBER - FIRST_NUMBER) == (THIRD_NUMBER - SECOND_NUMBER);
    }

    private static void printNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf("Input the first number: %d", FIRST_NUMBER);
        System.out.printf("Input the second number: %d", SECOND_NUMBER);
        System.out.printf("Input the third number: %d", THIRD_NUMBER);
    }
}