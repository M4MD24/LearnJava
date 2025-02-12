package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_2_numbers._2_2_1_4_2_15;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a number is a Duck Number or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>A Duck number is a number which has zeroes present in it, but there should be no zero present in the beginning of the number. For example 3210, 7056, 8430709 are all duck numbers whereas 08237, 04309 are not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 3210
 * <br/>
 * Duck number
 * </h2>
 */
public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 3210;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%suck number", isDuckNumber(NUMBER)
                ? "D"
                : "Not d");
    }

    private static boolean isDuckNumber(final int NUMBER) {
        return String.valueOf(NUMBER).indexOf('0') != -1;
    }
}