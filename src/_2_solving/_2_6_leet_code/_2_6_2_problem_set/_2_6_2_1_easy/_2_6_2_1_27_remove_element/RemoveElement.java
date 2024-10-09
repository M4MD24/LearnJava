package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_27_remove_element;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * <br/>
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * <br/>
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * <br/>
 * Return k.
 * </h2>
 */

public class RemoveElement {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {3,2,2,3};
        final int TARGET_ELEMENT = 2;
        System.out.print(removeElement(NUMBERS, TARGET_ELEMENT));
    }

    private static int removeElement(final int[] NUMBERS, final int TARGET_ELEMENT) {
        int countOfElementsNotEqualsTargetElement = 0;
        for (int index = 0; index < NUMBERS.length; index++)
            if (NUMBERS[index] != TARGET_ELEMENT) {
                NUMBERS[countOfElementsNotEqualsTargetElement++] = NUMBERS[index];
                System.out.println(Arrays.toString(NUMBERS));
            }
        return countOfElementsNotEqualsTargetElement;
    }
}