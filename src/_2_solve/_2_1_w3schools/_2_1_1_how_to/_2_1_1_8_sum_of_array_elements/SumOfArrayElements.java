package _2_solve._2_1_w3schools._2_1_1_how_to._2_1_1_8_sum_of_array_elements;

public class SumOfArrayElements {
    public static void main(final String[] PARAMETERS) {
        System.out.print(sumOfArrayElements(new int[]{1, 5, 2, 4, 3}));
    }

    private static int sumOfArrayElements(final int[] ELEMENTS) {
        int sumOfArrayElements = 0;
        for (final int ELEMENT : ELEMENTS)
            sumOfArrayElements += ELEMENT;
        return sumOfArrayElements;
    }
}