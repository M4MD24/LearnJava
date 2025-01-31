package _2_solve._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an enum called "DayOfWeek" representing the days of the week.</h2>
 */

enum DayOfWeek {
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday
}

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        System.out.printf("Today is: %s", DayOfWeek.Friday);
    }
}