package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_20;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method for extracting the first digit from a positive or negative integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input an number(positive/negative): 1234
 * <br/>
 * Extract the first digit from the said number: 1
 * </h2>
 */
public class Question20 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 1234;
        System.out.printf("Input an number (positive/negative): %d\n", NUMBER);
        System.out.printf("Extract the first digit from the said number: %d", NUMBER > -1
                ? String.valueOf(NUMBER).charAt(0) - '0'
                : String.valueOf(NUMBER).charAt(1) - '0');
    }
}