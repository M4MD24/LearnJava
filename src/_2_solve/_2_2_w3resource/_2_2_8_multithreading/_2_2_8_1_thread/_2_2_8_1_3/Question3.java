package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_1_thread._2_2_8_1_3;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that sorts an array of integers using multiple threads.</h2>
 */

public class Question3 extends Thread {
    private static final int LENGTH_OF_NUMBERS = 400,
            COUNT_OF_THREADS = 4;

    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = createArray();
        System.out.println("Before sorting: " + Arrays.toString(NUMBERS));
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        final int SEGMENT_SIZE = LENGTH_OF_NUMBERS / COUNT_OF_THREADS;

        for (int index = 0; index < COUNT_OF_THREADS; index++) {
            final int START_INDEX = index * SEGMENT_SIZE,
                    END_INDEX = (index == COUNT_OF_THREADS - 1)
                            ? LENGTH_OF_NUMBERS - 1
                            : (START_INDEX + SEGMENT_SIZE - 1);
            THREADS[index] = new Thread(new SortTask(NUMBERS, START_INDEX, END_INDEX));
            THREADS[index].start();
        }

        for (final Thread THREAD : THREADS)
            try {
                THREAD.join();
            } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                INTERRUPTED_EXCEPTION.printStackTrace();
            }
        mergeSorting(NUMBERS, 0, LENGTH_OF_NUMBERS - 1);
        System.out.print("After sorting: " + Arrays.toString(NUMBERS));
    }

    private static int[] createArray() {
        final int[] NUMBERS = new int[LENGTH_OF_NUMBERS];
        for (int index = 0; index < LENGTH_OF_NUMBERS; index++)
            NUMBERS[index] = (int) (Math.random() * 400);
        return NUMBERS;
    }

    private static void mergeSorting(final int[] ARRAY, final int LEFT, final int RIGHT) {
        if (LEFT < RIGHT) {
            final int MIDDLE = (LEFT + RIGHT) / 2;
            mergeSorting(ARRAY, LEFT, MIDDLE);
            mergeSorting(ARRAY, MIDDLE + 1, RIGHT);
            merge(ARRAY, LEFT, MIDDLE, RIGHT);
        }
    }

    private static void merge(final int[] ARRAY, final int LEFT, final int MIDDLE, final int RIGHT) {
        final int[] TEMPORARY_NUMBERS = new int[RIGHT - LEFT + 1];
        int firstIndex = LEFT,
                secondIndex = MIDDLE + 1,
                thirdIndex = 0;
        while (firstIndex <= MIDDLE && secondIndex <= RIGHT)
            if (ARRAY[firstIndex] <= ARRAY[secondIndex])
                TEMPORARY_NUMBERS[thirdIndex++] = ARRAY[firstIndex++];
            else
                TEMPORARY_NUMBERS[thirdIndex++] = ARRAY[secondIndex++];
        while (firstIndex <= MIDDLE)
            TEMPORARY_NUMBERS[thirdIndex++] = ARRAY[firstIndex++];
        while (secondIndex <= RIGHT)
            TEMPORARY_NUMBERS[thirdIndex++] = ARRAY[secondIndex++];
        System.arraycopy(TEMPORARY_NUMBERS, 0, ARRAY, LEFT, TEMPORARY_NUMBERS.length);
    }

    static class SortTask implements Runnable {
        private final int[] array;
        private final int startIndex,
                endIndex;

        SortTask(final int[] ARRAY, final int START_INDEX, final int END_INDEX) {
            this.array = ARRAY;
            this.startIndex = START_INDEX;
            this.endIndex = END_INDEX;
        }

        @Override
        public void run() {
            Arrays.sort(array, startIndex, endIndex + 1);
        }
    }
}