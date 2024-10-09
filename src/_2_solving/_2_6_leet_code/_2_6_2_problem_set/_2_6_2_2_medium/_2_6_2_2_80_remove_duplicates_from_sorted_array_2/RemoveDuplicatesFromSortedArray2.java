package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_80_remove_duplicates_from_sorted_array_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 * <br/>
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * <br/>
 * Return k after placing the final result in the first k slots of nums.
 * <br/>
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * </h2>
 */

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 1, 1, 2, 2, 3};
        System.out.print(removeDuplicatesFromSortedArray(NUMBERS));
    }

    private static int removeDuplicatesFromSortedArray(final int[] NUMBERS) {
        int countOfElementsAfterRemoveDuplicatesFromSortedArray = 0;
        for (int index = 0; index < NUMBERS.length; index++)
            if (index < 2 || NUMBERS[index] != NUMBERS[countOfElementsAfterRemoveDuplicatesFromSortedArray - 2])
                NUMBERS[countOfElementsAfterRemoveDuplicatesFromSortedArray++] = NUMBERS[index];
        return countOfElementsAfterRemoveDuplicatesFromSortedArray;
    }
}