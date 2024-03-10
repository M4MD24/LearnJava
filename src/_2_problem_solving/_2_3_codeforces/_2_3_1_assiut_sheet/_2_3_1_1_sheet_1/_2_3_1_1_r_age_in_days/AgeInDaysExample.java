package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_r_age_in_days;

import java.util.Scanner;

/**
 * <h1>R. Age in Days</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a Number N corresponding to a person's age (in days). Print his age in years, months and days, followed by its respective message "years", "months", "days".</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Note: consider the whole year has 365 days and 30 days per month.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>400</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 years
 * <br/>
 * 1 months
 * <br/>
 * 5 days
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>800</h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 years
 * <br/>
 * 2 months
 * <br/>
 * 10 days
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>30</h2>
 * <h1>Output:</h1>
 * <h2>
 * 0 years
 * <br/>
 * 1 months
 * <br/>
 * 0 days
 * </h2>
 */
public class AgeInDaysExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final long DAYS = INPUT.nextLong();

    public static void main(String[] args) {
        final int DAYS_PER_YEAR = 365,
                DAYS_PER_MONTH = 30;

        long years = DAYS / DAYS_PER_YEAR,
                remainingDays = DAYS % DAYS_PER_YEAR,
                months = remainingDays / DAYS_PER_MONTH;
        remainingDays %= DAYS_PER_MONTH;

        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.print(remainingDays + " days");
    }
}