package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_2_binary;

public class BinaryExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(binarySearch(NUMBERS, TARGET));
    }

    private static String binarySearch(final int[] ARRAY, final int TARGET) {
        int left = 0,
                right = ARRAY.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ARRAY[mid] == TARGET) return "Element found at index: " + mid;
            else if (ARRAY[mid] < TARGET) left = mid + 1;
            else right = mid - 1;
        }
        return "Element not found";
    }
}