package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_8_multithreading._2_2_1_1_8_2_multithreading._2_2_1_1_8_2_6;

import java.util.concurrent.CountDownLatch;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that uses the CountDownLatch class to synchronize the start and finish of multiple threads.</h2>
 */

public class Question6 {
    private static final int COUNT_OF_THREADS = 5;
    private static final CountDownLatch START_LATCH = new CountDownLatch(1),
            FINISH_LATCH = new CountDownLatch(COUNT_OF_THREADS);

    public static void main(final String[] ARGUMENTS) {
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        for (int indexOfThreads = 0; indexOfThreads < COUNT_OF_THREADS; indexOfThreads++) {
            THREADS[indexOfThreads] = new Thread(new Worker());
            THREADS[indexOfThreads].start();
        }
        START_LATCH.countDown();
        try {
            FINISH_LATCH.await();
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
        System.out.print("All threads have finished their work.");
    }

    private static class Worker implements Runnable {
        public void run() {
            try {
                START_LATCH.await();
                System.out.println(Thread.currentThread().getName() + " has finished its work.");
            } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                INTERRUPTED_EXCEPTION.printStackTrace();
            } finally {
                FINISH_LATCH.countDown();
            }
        }
    }
}