package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_18_sleep;

public class SleepExample {
    public static void main(final String[] ARGUMENTS) {
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