package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_2_data_types._2_2_1_1_2_2_enum_types._2_2_1_1_2_2_5;

/**
 * <h1>Problem:</h1>
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

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        System.out.printf("""
                        First Month of Year   : %s
                        Second Month of Year  : %s
                        Third Month of Year   : %s
                        Fourth Month of Year  : %s
                        Fifth Month of Year   : %s
                        sixth Month of Year   : %s
                        seventh Month of Year : %s
                        eighth Month of Year  : %s
                        eighth Month of Year  : %s
                        nineth Month of Year  : %s
                        eleventh Month of Year: %s
                        Twelve Month of Year  : %s""",
                MonthOfYear.January,
                MonthOfYear.February,
                MonthOfYear.March,
                MonthOfYear.April,
                MonthOfYear.May,
                MonthOfYear.June,
                MonthOfYear.July,
                MonthOfYear.August,
                MonthOfYear.September,
                MonthOfYear.October,
                MonthOfYear.November,
                MonthOfYear.December);
    }
}