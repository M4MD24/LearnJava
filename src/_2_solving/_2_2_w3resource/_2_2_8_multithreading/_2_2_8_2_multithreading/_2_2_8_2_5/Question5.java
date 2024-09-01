package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to showcase the usage of the CyclicBarrier class for thread synchronization.</h2>
 */

public class Question5 {
    private static final int COUNT_OF_THREADS = 3;
    private static final CyclicBarrier CYCLIC_BARRIER = new CyclicBarrier(COUNT_OF_THREADS, new BarrierAction());

    public static void main(final String[] ARGS) {
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        for (int indexOfThreads = 0; indexOfThreads < COUNT_OF_THREADS; indexOfThreads++) {
            THREADS[indexOfThreads] = new Thread(new Worker());
            THREADS[indexOfThreads].start();
        }
        try {
            for (final Thread THREAD : THREADS)
                THREAD.join();
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
    }

    private static class Worker implements Runnable {
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting at the barrier.");
                CYCLIC_BARRIER.await();
                System.out.println(Thread.currentThread().getName() + " has crossed the barrier and continued execution.");
            } catch (final InterruptedException | BrokenBarrierException INTERRUPTED_EXCEPTION_AND_BROKEN_BARRIER_EXCEPTION) {
                INTERRUPTED_EXCEPTION_AND_BROKEN_BARRIER_EXCEPTION.printStackTrace();
            }
        }
    }

    private static class BarrierAction implements Runnable {
        public void run() {
            System.out.println("Barrier reached! All threads have arrived at the barrier.");
        }
    }
}