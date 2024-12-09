package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_90;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>
 * As shown in Figure 1, arrange integers (0 to 99) as narrow hilltops. When reading such data from top to bottom, following the next rule represents a huge amount of data.
 * <br/>
 * Write a Java program that computes the maximum value of the sum of the passing integers.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 8
 * <br/>
 * 4,9
 * <br/>
 * 9,2,1
 * <br/>
 * 3,8,5,5
 * <br/>
 * 5,6,3,7,6
 * <br/>
 * 3,8,5,5
 * <br/>
 * 9,2,1
 * <br/>
 * 4,9
 * <br/>
 * 8
 * <br/>
 * Maximum value of the sum of integers passing according to the rule on one line: 64
 * </h2>
 */

public class Question90 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = """
                8
                4,9
                9,2,1
                3,8,5,5
                5,6,3,7,6
                3,8,5,5
                9,2,1
                4,9
                8
                """.replaceAll(",+", "");
        System.out.println(TEXT);
        System.out.printf("Maximum value of the sum of integers passing according to the rule on one line: %d", getMaximumSum(TEXT));
    }

    private static int getMaximumSum(final String TEXT) {
        final ArrayList<ArrayList<Integer>> NUMBERS = new ArrayList<>();
        addDigits(TEXT, NUMBERS);
        return getMaximumDigits(NUMBERS);
    }

    private static int getMaximumDigits(final ArrayList<ArrayList<Integer>> NUMBERS) {
        ArrayList<Integer> maximumSum = new ArrayList<>();
        maximumSum.add(NUMBERS.getFirst().getFirst());
        for (int row = 1; row < NUMBERS.size(); row++) {
            final int[] CURRENT_DIGITS = new int[NUMBERS.get(row).size()];
            for (int column = 0; column < CURRENT_DIGITS.length; column++)
                if (row <= NUMBERS.size() / 2)
                    if (column == 0)
                        CURRENT_DIGITS[column] = maximumSum.get(column) + NUMBERS.get(row).get(column);
                    else if (column == CURRENT_DIGITS.length - 1)
                        CURRENT_DIGITS[column] = maximumSum.get(column - 1) + NUMBERS.get(row).get(column);
                    else
                        CURRENT_DIGITS[column] = Math.max(maximumSum.get(column - 1) + NUMBERS.get(row).get(column), maximumSum.get(column) + NUMBERS.get(row).get(column));
                else
                    CURRENT_DIGITS[column] = Math.max(maximumSum.get(column) + NUMBERS.get(row).get(column), maximumSum.get(column + 1) + NUMBERS.get(row).get(column));
            maximumSum = new ArrayList<>();
            for (final int DIGIT : CURRENT_DIGITS)
                maximumSum.add(DIGIT);
        }
        return maximumSum.getFirst();
    }

    private static void addDigits(final String TEXT, final ArrayList<ArrayList<Integer>> NUMBERS) {
        int index = 0;
        ArrayList<Integer> digits = new ArrayList<>();
        while (index < TEXT.length()) {
            if (TEXT.charAt(index) != '\n')
                digits.add(TEXT.charAt(index) - '0');
            else {
                NUMBERS.add(digits);
                digits = new ArrayList<>();
            }
            index++;
        }
    }
}