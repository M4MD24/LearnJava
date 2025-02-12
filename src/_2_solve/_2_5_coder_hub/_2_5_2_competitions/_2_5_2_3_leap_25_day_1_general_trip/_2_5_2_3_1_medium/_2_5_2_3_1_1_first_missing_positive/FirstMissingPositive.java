package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_3_leap_25_day_1_general_trip._2_5_2_3_1_medium._2_5_2_3_1_1_first_missing_positive;

public class FirstMissingPositive {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    private static int removeDuplicates(final int[] NUMBERS) {
        final int CONNT_OF_NUMBERS = NUMBERS.length;
        for (int index = 0; index < CONNT_OF_NUMBERS; index++)
            while (NUMBERS[index] > 0 && NUMBERS[index] <= CONNT_OF_NUMBERS && NUMBERS[NUMBERS[index] - 1] != NUMBERS[index]) {
                final int TEMPORARY_NUMBER = NUMBERS[index];
                NUMBERS[index] = NUMBERS[TEMPORARY_NUMBER - 1];
                NUMBERS[TEMPORARY_NUMBER - 1] = TEMPORARY_NUMBER;
            }
        for (int index = 0; index < CONNT_OF_NUMBERS; index++)
            if (NUMBERS[index] != index + 1)
                return index + 1;
        return CONNT_OF_NUMBERS + 1;
    }
}