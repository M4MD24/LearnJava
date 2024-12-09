package _2_solve._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an enum called "DayOfWeekend" with constants representing the days of the weekend.</h2>
 */

enum DayOfWeekend {
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday
}

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        System.out.printf("First day of the weekend: %s\n", DayOfWeekend.Saturday);
        System.out.printf("Second day of the weekend: %s", DayOfWeekend.Sunday);
    }
}