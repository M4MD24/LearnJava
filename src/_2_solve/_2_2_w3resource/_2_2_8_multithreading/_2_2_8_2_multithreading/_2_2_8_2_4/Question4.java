package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_4;

import java.util.concurrent.Semaphore;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to demonstrate Semaphore usage for thread synchronization.</h2>
 */

public class Question4 {
    private static final int COUNT_OF_THREADS = 5,
            COUNT_OF_PERMITS = 5;

    public static void main(final String[] ARGUMENTS) {
        final Semaphore SEMAPHORE = new Semaphore(COUNT_OF_PERMITS);
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        for (int index = 0; index < COUNT_OF_THREADS; index++) {
            THREADS[index] = new Thread(new Worker(SEMAPHORE));
            THREADS[index].start();
        }

        try {
            for (final Thread THREAD : THREADS)
                THREAD.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private record Worker(Semaphore SEMAPHORE) implements Runnable {
        public void run() {
            try {
                SEMAPHORE.acquire();
                System.out.println(Thread.currentThread().getName() + " acquired the semaphore.");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " released the semaphore.");
                SEMAPHORE.release();
            } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                INTERRUPTED_EXCEPTION.printStackTrace();
            }
        }
    }
}