package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_17;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort an array of given non-negative integers using the Sleep Sort Algorithm.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        sleepSort(NUMBERS);
    }

    private static void sleepSort(final int[] ARRAY) {
        for (final int NUMBER : ARRAY)
            new Thread(() -> {
                try {
                    Thread.sleep(NUMBER * 100L);
                    System.out.print(NUMBER + " ");
                } catch (final InterruptedException _) {
                    Thread.currentThread().interrupt();
                }
            }).start();
    }
}