package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_8_multithreading._2_2_1_8_2_multithreading._2_2_1_8_2_9;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that utilizes the ConcurrentLinkedQueue class to implement a thread-safe queue.</h2>
 */

public class Question9 {
    final static int LIMIT = 4;

    public static void main(final String[] ARGUMENTS) {
        final ConcurrentLinkedQueue<String> CONCURRENT_LINKED_QUEUE = new ConcurrentLinkedQueue<>();

        Thread producerThread1 = new Thread(new Producer(CONCURRENT_LINKED_QUEUE, "Producer-1", LIMIT));
        Thread producerThread2 = new Thread(new Producer(CONCURRENT_LINKED_QUEUE, "Producer-2", LIMIT));
        producerThread1.start();
        producerThread2.start();

        Thread consumerThread1 = new Thread(new Consumer(CONCURRENT_LINKED_QUEUE, "Consumer-1"));
        Thread consumerThread2 = new Thread(new Consumer(CONCURRENT_LINKED_QUEUE, "Consumer-2"));
        consumerThread1.start();
        consumerThread2.start();
    }

    private static class Producer implements Runnable {
        private static ConcurrentLinkedQueue<String> CONCURRENT_LINKED_QUEUE;
        private static String PRODUCER_NAME;
        private static int counter = 0;
        private static int limit = 0;

        Producer(final ConcurrentLinkedQueue<String> CONCURRENT_LINKED_QUEUE, final String PRODUCER_NAME, final int LIMIT) {
            Producer.CONCURRENT_LINKED_QUEUE = CONCURRENT_LINKED_QUEUE;
            Producer.PRODUCER_NAME = PRODUCER_NAME;
            limit = LIMIT;
        }

        public void run() {
            while (counter < limit) {
                final String ITEM = PRODUCER_NAME + "-Item-" + counter++;
                CONCURRENT_LINKED_QUEUE.offer(ITEM);
                System.out.println("Produced: " + ITEM);

                try {
                    Thread.sleep(1000);
                } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                    INTERRUPTED_EXCEPTION.printStackTrace();
                }
            }
        }
    }

    private static class Consumer implements Runnable {
        private static ConcurrentLinkedQueue<String> CONCURRENT_LINKED_QUEUE;
        private static String CONSUMER_NAME;

        public Consumer(final ConcurrentLinkedQueue<String> CONCURRENT_LINKED_QUEUE, final String CONSUMER_NAME) {
            Consumer.CONCURRENT_LINKED_QUEUE = CONCURRENT_LINKED_QUEUE;
            Consumer.CONSUMER_NAME = CONSUMER_NAME;
        }

        public void run() {
            String item = CONCURRENT_LINKED_QUEUE.poll();
            while (item != null) {
                System.out.println(CONSUMER_NAME + " consumed: " + item);
                try {
                    Thread.sleep(1500);
                } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                    INTERRUPTED_EXCEPTION.printStackTrace();
                }
                item = CONCURRENT_LINKED_QUEUE.poll();
            }
            System.out.println(CONSUMER_NAME + " consumed: Saturation state has been reached.");
        }
    }
}