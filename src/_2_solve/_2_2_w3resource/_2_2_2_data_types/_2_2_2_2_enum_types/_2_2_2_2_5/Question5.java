package _2_solve._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_5;

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
    public static void main(final String[] PARAMETERS) {
        System.out.printf("""
                        First Month of Year   :\s%s
                        Second Month of Year  :\s%s
                        Third Month of Year   :\s%s
                        Fourth Month of Year  :\s%s
                        Fifth Month of Year   :\s%s
                        sixth Month of Year   :\s%s
                        seventh Month of Year :\s%s
                        eighth Month of Year  :\s%s
                        eighth Month of Year  :\s%s
                        nineth Month of Year  :\s%s
                        eleventh Month of Year:\s%s
                        Twelve Month of Year  :\s%s""",
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