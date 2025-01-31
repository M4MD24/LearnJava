package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_2_coder_hub_hat_24_third_day._2_5_2_2_2_medium._2_5_2_2_2_1_count_digit_one;

public class CountDigitOne {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(countDigitOne(13));
        System.out.println(countDigitOne(20));
        System.out.println(countDigitOne(100));
        System.out.println(countDigitOne(0));
    }

    private static int countDigitOne(final int TARGET_NUMBER) {
        int countOfDigitOne = 0;
        for (int number = 0; number <= TARGET_NUMBER; number++)
            for (final char DIGIT : String.valueOf(number).toCharArray())
                if (DIGIT == '1')
                    countOfDigitOne++;
        return countOfDigitOne;
    }
}