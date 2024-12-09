package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_8_ternary;

public class TernaryExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(ternarySearch(NUMBERS, TARGET));
    }

    private static String ternarySearch(final int[] ARRAY, final int TARGET) {
        int left = 0,
                right = ARRAY.length - 1;
        while (right >= left) {
            int firstMiddle = left + (right - left) / 3,
                    secondMiddle = right - (right - left) / 3;
            if (ARRAY[firstMiddle] == TARGET)
                return "Element found at index: " + firstMiddle;
            if (ARRAY[secondMiddle] == TARGET)
                return "Element found at index: " + secondMiddle;
            if (TARGET < ARRAY[firstMiddle])
                right = firstMiddle - 1;
            else if (TARGET > ARRAY[secondMiddle])
                left = secondMiddle + 1;
            else {
                left = firstMiddle + 1;
                right = secondMiddle - 1;
            }
        }
        return "Element not found";
    }
}