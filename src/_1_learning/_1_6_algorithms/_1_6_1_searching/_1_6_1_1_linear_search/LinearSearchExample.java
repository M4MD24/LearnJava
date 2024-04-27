package _1_learning._1_6_algorithms._1_6_1_searching._1_6_1_1_linear_search;

public class LinearSearchExample {
    public static void main(final String[] ARGS) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 10;
        System.out.print(linearSearch(numbers, target));
    }

    private static String linearSearch(int[] array, int target) {
        for (int index = 0; index < array.length; index++)
            if (array[index] == target) return "Element found at index: " + index;
        return "Element not found";
    }
}