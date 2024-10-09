package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_21;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to display the factors of 3 in a given integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an number(positive/negative): 81
 * <br/>
 * Factors of 3 of the said number:
 * <br/>
 * 81 = 3 * 3 * 3 * 3 * 1
 * </h2>
 */
public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 81;
        System.out.printf("Input an number (positive/negative): %d\n", NUMBER);
        System.out.println("Factors of 3 of the said number");
        System.out.print(getFactorsThreeNumber(NUMBER));
    }

    private static int getFactorsThreeNumber(int number) {
        System.out.print(81 + " = ");
        while (number % 3 == 0) {
            System.out.print("3 * ");
            number = number / 3;
        }
        return number;
    }
}