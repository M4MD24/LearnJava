package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_8_question_257;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java method to compute the future investment value at a given interest rate for a specified number of years.
 * <br/>
 * Sample data (Monthly compounded)
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input the investment amount: 1000
 * <br/>
 * Input the rate of interest: 10
 * <br/>
 * Input number of years: 5
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 * Years    FutureValue
 * 1            1104.71
 * 2            1220.39
 * 3            1348.18
 * 4            1489.35
 * 5            1645.31
 * */
public class Question257 {
    public static void main(final String[] ARGS) {
        final int INVESTMENT_AMOUNT = 1000,
                RATE_OF_INTEREST = 10,
                NUMBER_OF_YEARS = 5;
        printInputs(INVESTMENT_AMOUNT, RATE_OF_INTEREST, NUMBER_OF_YEARS);
        printFutureInvestmentValues(INVESTMENT_AMOUNT, RATE_OF_INTEREST * 0.01, NUMBER_OF_YEARS);
    }

    private static double getFutureInvestmentValue(final double INVESTMENT_AMOUNT, final double MONTHLY_INTEREST_RATE, final int CURRENT_YEAR) {
        return INVESTMENT_AMOUNT * Math.pow(1 + MONTHLY_INTEREST_RATE, CURRENT_YEAR * 12);
    }

    private static void printFutureInvestmentValues(final int INVESTMENT_AMOUNT, final double RATE_OF_INTEREST, final int NUMBER_OF_YEARS) {
        System.out.printf("%s\t%s\n",
                "Years",
                "FutureValue");
        for (int currentYear = 1; currentYear <= NUMBER_OF_YEARS; currentYear++)
            System.out.printf("%-7d %11.2f\n",
                    currentYear,
                    getFutureInvestmentValue(INVESTMENT_AMOUNT, RATE_OF_INTEREST / 12, currentYear));
    }

    private static void printInputs(final int INVESTMENT_AMOUNT, final int RATE_OF_INTEREST, final int NUMBER_OF_YEARS) {
        System.out.printf("""
                        Input the investment amount: %d
                        Input the rate of interest: %d
                        Input number of years: %d
                        """,
                INVESTMENT_AMOUNT,
                RATE_OF_INTEREST,
                NUMBER_OF_YEARS);
    }
}