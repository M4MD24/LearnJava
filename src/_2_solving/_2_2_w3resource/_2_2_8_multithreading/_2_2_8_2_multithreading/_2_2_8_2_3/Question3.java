package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_3;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that uses the ReentrantLock class to synchronize access to a shared resource among multiple threads.</h2>
 */

public class Question3 {
    private static int counter = 0;
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final int countOfThreads = 3;
    private static final Thread[] THREADS = new Thread[countOfThreads];

    public static void main(final String[] PARAMETERS) {
        initializeThreads();
        startThreads();
        joinThreads();
        System.out.println("Final Counter Value: " + counter);
    }

    private static void startThreads() {
        for (final Thread THREAD : THREADS)
            THREAD.start();
    }

    private static void joinThreads() {
        for (final Thread THREAD : THREADS)
            try {
                THREAD.join();
            } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                INTERRUPTED_EXCEPTION.printStackTrace();
            }
    }

    private static void initializeThreads() {
        for (int indexOfThread = 0; indexOfThread < THREADS.length; indexOfThread++)
            THREADS[indexOfThread] = new Thread(new CounterIncrementer(), "Thread-(" + (indexOfThread + 1) + ")");
    }

    private static class CounterIncrementer implements Runnable {
        private static final int COUNT_OF_NUMBERS_PER_THREAD = 5;

        @Override
        public void run() {
            for (int index = 0; index < COUNT_OF_NUMBERS_PER_THREAD; index++)
                incrementCounter();
        }

        private synchronized void incrementCounter() {
            LOCK.lock();
            try {
                System.out.println(Thread.currentThread().getName() + " incremented counter to: " + ++counter);
            } finally {
                LOCK.unlock();
            }
        }
    }
}