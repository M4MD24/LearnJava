package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_10_shell;

import java.util.Arrays;

public class ShellExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {30, 28, 37, 5, 28, 9, 14, 14, 22, 39};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        shellSort(NUMBERS);
        System.out.print("After Shell Sort: " + Arrays.toString(NUMBERS));
    }

    private static void shellSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length;
        for (int interval = LENGTH / 2; interval > 0; interval /= 2)
            for (int currentIndex = interval; currentIndex < LENGTH; currentIndex += 1) {
                final int TEMPORARY_NUMBER = NUMBERS[currentIndex];
                int currentPosition;
                for (currentPosition = currentIndex; currentPosition >= interval && NUMBERS[currentPosition - interval] > TEMPORARY_NUMBER; currentPosition -= interval)
                    NUMBERS[currentPosition] = NUMBERS[currentPosition - interval];
                NUMBERS[currentPosition] = TEMPORARY_NUMBER;
            }
    }
}