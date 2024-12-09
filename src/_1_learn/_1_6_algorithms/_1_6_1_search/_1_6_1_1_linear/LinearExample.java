package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_1_linear;

public class LinearExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(linearSearch(NUMBERS, TARGET));
    }

    private static String linearSearch(final int[] ARRAY, final int TARGET) {
        for (int index = 0; index < ARRAY.length; index++)
            if (ARRAY[index] == TARGET) return "Element found at index: " + index;
        return "Element not found";
    }
}