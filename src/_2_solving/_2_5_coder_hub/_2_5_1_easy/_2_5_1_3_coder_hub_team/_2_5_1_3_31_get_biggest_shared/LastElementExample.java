package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_31_get_biggest_shared;

import java.util.Arrays;

public class LastElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getLastElement(new int[]{1, 2, 4, 5}, new int[]{3, 4, 7, 11}));
        System.out.println(getLastElement(new int[]{0}, new int[]{0}));
        System.out.println(getLastElement(new int[]{90, 95}, new int[]{90, 95}));
        System.out.print(getLastElement(new int[]{10, 2, 3, 12, 3}, new int[]{54, 12, 33, 1}));
    }

    private static int getLastElement(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        Arrays.sort(FIRST_NUMBERS);
        Arrays.sort(SECOND_NUMBERS);
        for (int indexOfFirstNumbers = FIRST_NUMBERS.length - 1; indexOfFirstNumbers > -1; indexOfFirstNumbers--) {
            final int FIRST_NUMBER = FIRST_NUMBERS[indexOfFirstNumbers];
            for (int indexOfSecondNumbers = SECOND_NUMBERS.length - 1; indexOfSecondNumbers > -1; indexOfSecondNumbers--) {
                final int SECOND_NUMBER = SECOND_NUMBERS[indexOfSecondNumbers];
                if (FIRST_NUMBER == SECOND_NUMBER)
                    return FIRST_NUMBER;
            }
        }
        return -1;
    }
}