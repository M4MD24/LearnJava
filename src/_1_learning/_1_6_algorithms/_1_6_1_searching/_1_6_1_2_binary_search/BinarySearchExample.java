package _1_learning._1_6_algorithms._1_6_1_searching._1_6_1_2_binary_search;

public class BinarySearchExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        System.out.print(binarySearch(numbers, target));
    }

    private static String binarySearch(int[] array, int target) {
        int left = 0,
                right = array.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (array[mid] == target) return "Element found at index: " + mid;
            else if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return "Element not found";
    }
}