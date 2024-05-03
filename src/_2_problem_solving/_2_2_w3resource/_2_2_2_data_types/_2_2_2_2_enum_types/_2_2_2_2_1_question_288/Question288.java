package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_1_question_288;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an enum called "DayOfWeek" representing the days of the week.</h2>
 */

enum DayOfWeek {
    Saturday,
    Sunday,
    Monday,
    Tuesday,
    Thursday,
    Wednesday,
    Friday
}

public class Question288 {
    public static void main(final String[] ARGS) {
        System.out.print(STR."Today is: \{DayOfWeek.Friday}");
    }
}