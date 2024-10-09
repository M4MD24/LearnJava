package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a producer-consumer scenario using the wait() and notify() methods for thread synchronization.</h2>
 */

public class Question2 {
    private static final Queue<Integer> TRAVELERS = new LinkedList<>();
    private static final int NUMBER_OF_TRIPS = 5;
    private static final Thread PRODUCER_THREAD = new Thread(new Producer()),
            CONSUMER_THREAD = new Thread(new Consumer());

    public static void main(final String[] PARAMETERS) {
        runThreads();
    }

    private static void runThreads() {
        PRODUCER_THREAD.start();
        CONSUMER_THREAD.start();
    }

    private static class Producer implements Runnable {
        @Override
        public void run() {
            int value = 1;
            while (true)
                synchronized (TRAVELERS) {
                    while (TRAVELERS.size() == NUMBER_OF_TRIPS)
                        try {
                            TRAVELERS.wait();
                        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                            Thread.currentThread().interrupt();
                            System.out.println("Producer interrupted");
                        }

                    TRAVELERS.add(value);
                    System.out.println("Produced: " + value++);
                    TRAVELERS.notify();

                    try {
                        Thread.sleep(5000);
                    } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                        Thread.currentThread().interrupt();
                        System.out.println("Producer sleep interrupted");
                    }
                }
        }
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            while (true)
                synchronized (TRAVELERS) {
                    while (TRAVELERS.isEmpty())
                        try {
                            TRAVELERS.wait();
                        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                            Thread.currentThread().interrupt();
                            System.out.println("Consumer interrupted");
                        }

                    System.out.println("Consumed: " + TRAVELERS.poll());
                    TRAVELERS.notify();

                    try {
                        Thread.sleep(1000);
                    } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                        Thread.currentThread().interrupt();
                        System.out.println("Consumer sleep interrupted");
                    }
                }
        }
    }
}