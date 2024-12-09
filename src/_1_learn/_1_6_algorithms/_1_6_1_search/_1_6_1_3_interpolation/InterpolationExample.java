package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_3_interpolation;

public class InterpolationExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int target = 10;
        System.out.print(interpolationSearch(NUMBERS, target));
    }

    private static String interpolationSearch(final int[] ARRAY, final int TARGET) {
        int high = ARRAY.length - 1,
                low = 0;
        while (TARGET >= ARRAY[low] && TARGET <= ARRAY[high] && low <= high) {
            int probe = low + (high - low) * (TARGET - ARRAY[low]) / (ARRAY[high] - ARRAY[low]);
            if (ARRAY[probe] == TARGET)
                return "element found at index: " + probe;
            else if (ARRAY[probe] < TARGET)
                low = ++probe;
            else
                high = --probe;
        }
        return "Element not found";
    }
}