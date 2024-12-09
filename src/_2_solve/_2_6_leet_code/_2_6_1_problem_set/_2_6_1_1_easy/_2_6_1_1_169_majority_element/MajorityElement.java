package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_169_majority_element;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array nums of size n, return the majority element.
 * <br/>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * </h2>
 */

public class MajorityElement {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {3, 2, 3};
        System.out.print(majorityElement(NUMBERS));
    }

    private static int majorityElement(final int[] NUMBERS) {
        int candidateMajorityElement = 0,
                countOfMajorityElement = 0;
        for (final int NUMBER : NUMBERS) {
            if (countOfMajorityElement == 0)
                candidateMajorityElement = NUMBER;
            countOfMajorityElement += (NUMBER == candidateMajorityElement)
                    ? 1
                    : -1;
        }
        return candidateMajorityElement;
    }
}