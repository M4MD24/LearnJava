package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_14;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check whether a number is an automorphic number or not.
 * <br/>
 * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. For example, 5^2 = 25, 6^2 = 36, 76^2 = 5776, and 890625^2 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 76
 * <br/>
 * Automorphic Number.
 * </h2>
 */
public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 76;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%sAutomorphic Number", isAutomorphicNumber(NUMBER) ? "" : "Not ");
    }

    private static boolean isAutomorphicNumber(final int NUMBER) {
        final int NUMBER_SQUARE = NUMBER * NUMBER;
        return String.valueOf(NUMBER_SQUARE).contains(String.valueOf(NUMBER));
    }
}