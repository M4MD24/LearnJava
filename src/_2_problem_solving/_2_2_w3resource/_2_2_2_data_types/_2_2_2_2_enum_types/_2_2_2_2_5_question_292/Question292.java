package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_5_question_292;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that defines an enum called "Month" with constants representing the months of the year.</h2>
 */

enum MonthOfYear {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

public class Question292 {
    public static void main(final String[] ARGS) {
        System.out.print(STR."""
                First Month of Year   :\s\{MonthOfYear.January}
                Second Month of Year  :\s\{MonthOfYear.February}
                Third Month of Year   :\s\{MonthOfYear.March}
                Fourth Month of Year  :\s\{MonthOfYear.April}
                Fifth Month of Year   :\s\{MonthOfYear.May}
                sixth Month of Year   :\s\{MonthOfYear.June}
                seventh Month of Year :\s\{MonthOfYear.July}
                eighth Month of Year  :\s\{MonthOfYear.August}
                eighth Month of Year  :\s\{MonthOfYear.September}
                nineth Month of Year  :\s\{MonthOfYear.October}
                eleventh Month of Year:\s\{MonthOfYear.November}
                Twelve Month of Year  :\s\{MonthOfYear.December}""");
    }
}