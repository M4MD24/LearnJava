package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_26;

import java.time.Month;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the information of the current/given month.</h2>
 */

public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getMonthInformation(YearMonth.now()));
    }

    private static String getMonthInformation(final YearMonth YEAR_MONTH) {
        final Month CURRENT_MONTH = YEAR_MONTH.getMonth();
        final Month FIRST_MONTH_OF_QUARTER = CURRENT_MONTH.firstMonthOfQuarter();
        return String.format("""
                        Integer value of the current month: %d
                        Length of the month: %d
                        Maximum length of the month: %d
                        First month of the Quarter: %s""",
                CURRENT_MONTH.getValue(),
                YEAR_MONTH.lengthOfMonth(),
                CURRENT_MONTH.maxLength(),
                FIRST_MONTH_OF_QUARTER.getDisplayName(
                        TextStyle.FULL,
                        Locale.ENGLISH
                ).toUpperCase()
        );
    }
}