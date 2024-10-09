package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to check whether a year (integer) entered by the user is a leap year or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a year: 2017
 * <br/>
 * false
 * </h2>
 */
public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final int YEAR = 2017;
        System.out.printf("Input a Year: %d\n", YEAR);
        System.out.print(isLeapYear(YEAR));
    }

    private static boolean isLeapYear(final int YEAR) {
        return (YEAR % 4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0;
    }
}