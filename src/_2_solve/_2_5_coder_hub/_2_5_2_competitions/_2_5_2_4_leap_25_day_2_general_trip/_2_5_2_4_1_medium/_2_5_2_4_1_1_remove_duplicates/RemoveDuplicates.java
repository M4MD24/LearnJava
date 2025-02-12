package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_4_leap_25_day_2_general_trip._2_5_2_4_1_medium._2_5_2_4_1_1_remove_duplicates;

public class RemoveDuplicates {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }

    private static int removeDuplicates(final int[] NUMBERS) {
        if (NUMBERS.length <= 2)
            return NUMBERS.length;
        int writeIndex = 2;
        for (int readIndex = 2; readIndex < NUMBERS.length; readIndex++)
            if (NUMBERS[readIndex] != NUMBERS[writeIndex - 2])
                NUMBERS[writeIndex++] = NUMBERS[readIndex];
        return writeIndex;
    }
}