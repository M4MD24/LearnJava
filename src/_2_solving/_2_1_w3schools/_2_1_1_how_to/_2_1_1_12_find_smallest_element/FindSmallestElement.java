package _2_solving._2_1_w3schools._2_1_1_how_to._2_1_1_12_find_smallest_element;

public class FindSmallestElement {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 5, 2, 3};
        System.out.print(smallestElement(NUMBERS));
    }

    private static int smallestElement(final int[] NUMBERS) {
        int minimumNumber = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++)
            if (minimumNumber > NUMBERS[index])
                minimumNumber = NUMBERS[index];
        return minimumNumber;
    }
}