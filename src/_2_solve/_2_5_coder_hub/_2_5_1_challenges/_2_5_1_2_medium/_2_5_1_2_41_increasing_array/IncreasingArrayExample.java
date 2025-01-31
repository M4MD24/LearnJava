package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_41_increasing_array;

public class IncreasingArrayExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(increasingArray(new int[]{3, 2, 5, 1, 7}));
    }

    private static int increasingArray(final int[] ARRAY) {
        int points = 0;
        for (int index = 1; index < ARRAY.length; index++)
            if (ARRAY[index] < ARRAY[index - 1]) {
                points += (ARRAY[index - 1] - ARRAY[index]);
                ARRAY[index] = ARRAY[index - 1];
            }
        return points;
    }
}