package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_14_max_element;

public class MaxElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getMaximumNumber(new int[]{1, 2, 3, 4, 5, 1000}));
        System.out.println(getMaximumNumber(new int[]{32, 35, 23, 59, 20, 88}));
        System.out.println(getMaximumNumber(new int[]{-2, -563, -13, -8}));
        System.out.print(getMaximumNumber(new int[]{-54, 0, -88, -91, -5}));
    }

    private static int getMaximumNumber(final int[] NUMBERS) {
        int maximumNumber = NUMBERS[0];
        for (final int NUMBER : NUMBERS)
            if (NUMBER > maximumNumber)
                maximumNumber = NUMBER;
        return maximumNumber;
    }
}