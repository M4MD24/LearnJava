package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_70;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute and print the sum of two given integers (more than or equal to zero). If the given integers or the sum have more than 80 digits, print "overflow".</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input two integers:
 * <br/>
 * 25
 * <br/>
 * 46
 * <br/>
 * <br/>
 * Sum of the said two integers:
 * <br/>
 * 71
 * </h2>
 */

public class Question70 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_NUMBER = "25",
                SECOND_NUMBER = "46";
        System.out.println("Input two integers:");
        System.out.println(FIRST_NUMBER);
        System.out.println(SECOND_NUMBER);
        System.out.println("\nSum of the said two integers:");
        System.out.print(getSumOFTwoNumbers(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static String getSumOFTwoNumbers(final String FIRST_NUMBER, final String SECOND_NUMBER) {
        return (FIRST_NUMBER.length() > 80 || SECOND_NUMBER.length() > 80)
                ? "overflow"
                : String.valueOf(Long.parseLong(FIRST_NUMBER) + Long.parseLong(SECOND_NUMBER));
    }
}