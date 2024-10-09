package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input number: 3
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Monday</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        final byte NUMBER_OF_DAY_OF_WEEK = 3;
        System.out.printf("Input number: %d\n", NUMBER_OF_DAY_OF_WEEK);
        System.out.print(getDayOfWeek(NUMBER_OF_DAY_OF_WEEK));
    }

    private static String getDayOfWeek(final int NUMBER_OF_DAY_OF_WEEK) {
        return switch (NUMBER_OF_DAY_OF_WEEK) {
            case 1 -> "Saturday";
            case 2 -> "Sunday";
            case 3 -> "Monday";
            case 4 -> "Tuesday";
            case 5 -> "Wednesday";
            case 6 -> "Thursday";
            case 7 -> "Friday";
            default -> "Invalid day range";
        };
    }
}