package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create and start multiple threads that increment a shared counter variable concurrently.</h2>
 */

public class Question1 extends Thread {
    public static void main(final String[] ARGS) {
        final Counter COUNTER = new Counter();
        final int COUNT_OF_THREADS = 6,
                INCREMENTS_PER_THREAD = 10000;
        final IncrementThread[] THREADS = new IncrementThread[COUNT_OF_THREADS];

        for (int index = 0; index < COUNT_OF_THREADS; index++) {
            THREADS[index] = new IncrementThread(COUNTER, INCREMENTS_PER_THREAD);
            THREADS[index].start();
        }

        try {
            for (final IncrementThread THREAD : THREADS)
                THREAD.join();
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }

        System.out.print("Final count: " + COUNTER.getCount());
    }
}

class Counter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }

    int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private final Counter COUNTER;
    private final int INCREMENTS_PER_THREAD;

    IncrementThread(final Counter COUNTER, final int INCREMENTS_PER_THREAD) {
        this.COUNTER = COUNTER;
        this.INCREMENTS_PER_THREAD = INCREMENTS_PER_THREAD;
    }

    @Override
    public void run() {
        for (int index = 0; index < INCREMENTS_PER_THREAD; index++)
            COUNTER.increment();
    }
}