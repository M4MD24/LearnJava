package _1_learning._1_6_algorithms._1_6_1_search._1_6_1_3_interpolation;

public class InterpolationExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        System.out.print(interpolationSearch(numbers, target));
    }

    private static String interpolationSearch(int[] array, int target) {
        int high = array.length - 1,
                low = 0;
        while (target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);
            if (array[probe] == target) return "element found at index: " + probe;
            else if (array[probe] < target) low = ++probe;
            else high = --probe;
        }
        return "Element not found";
    }
}