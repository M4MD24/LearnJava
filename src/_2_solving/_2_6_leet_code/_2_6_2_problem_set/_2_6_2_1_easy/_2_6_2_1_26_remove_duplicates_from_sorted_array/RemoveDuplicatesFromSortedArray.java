package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_26_remove_duplicates_from_sorted_array;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * <br/>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * <br/>
 * Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 * <br/>
 * Return k.
 * </h2>
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.print(removeDuplicatesFromSortedArray(NUMBERS));
    }

    private static int removeDuplicatesFromSortedArray(final int[] NUMBERS) {
        if (NUMBERS.length == 0)
            return 0;
        else {
            int countOfElementsAfterRemoveDuplicates = 1;
            for (int index = countOfElementsAfterRemoveDuplicates; index < NUMBERS.length; index++)
                if (NUMBERS[index] != NUMBERS[countOfElementsAfterRemoveDuplicates - 1])
                    NUMBERS[countOfElementsAfterRemoveDuplicates++] = NUMBERS[index];
            return countOfElementsAfterRemoveDuplicates;
        }
    }
}