package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_274_h_index;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
 * <br/>
 * According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
 * </h2>
 */

public class HIndex {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {3, 0, 6, 1, 5};
        System.out.print(hIndex(NUMBERS));
    }

    private static int hIndex(final int[] CITATIONS) {
        Arrays.sort(CITATIONS);
        int hIndex = 0;
        for (int index = 0; index < CITATIONS.length; index++)
            if (index < CITATIONS[CITATIONS.length - 1 - index])
                hIndex++;
            else
                break;
        return hIndex;
    }
}