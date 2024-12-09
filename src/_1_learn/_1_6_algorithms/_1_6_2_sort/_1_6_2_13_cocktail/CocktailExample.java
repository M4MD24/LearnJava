package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_13_cocktail;

import java.util.Arrays;

public class CocktailExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(cocktailSort(NUMBERS));
    }

    private static String cocktailSort(final int[] ARRAY) {
        boolean isSwapped = true;
        int start = 0,
                end = ARRAY.length - 1;
        while (isSwapped) {
            isSwapped = false;
            for (int index = start; index < end; index++)
                if (ARRAY[index] > ARRAY[index + 1]) {
                    final int TEMPORARY_ELEMENT = ARRAY[index];
                    ARRAY[index] = ARRAY[index + 1];
                    ARRAY[index + 1] = TEMPORARY_ELEMENT;
                    isSwapped = true;
                }
            if (!isSwapped)
                break;
            else {
                isSwapped = false;
                end--;
                for (int index = end; index > start; index--)
                    if (ARRAY[index] < ARRAY[index - 1]) {
                        final int TEMPORARY_ELEMENT = ARRAY[index];
                        ARRAY[index] = ARRAY[index - 1];
                        ARRAY[index - 1] = TEMPORARY_ELEMENT;
                        isSwapped = true;
                    }
                start++;
            }
        }
        return Arrays.toString(ARRAY);
    }
}