package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_8_multithreading._2_2_1_1_8_2_multithreading._2_2_1_1_8_2_10;

import java.util.concurrent.Phaser;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to showcase the usage of the Phaser class for coordination and synchronization of multiple threads.</h2>
 */

public class Question10 {
    private static final int COUNT_OF_THREADS = 5;

    public static void main(final String[] ARGUMENTS) {
        final Phaser PHASER = new Phaser(COUNT_OF_THREADS);
        for (int index = 1; index <= COUNT_OF_THREADS; index++)
            new Thread(new Worker(PHASER, "Thread " + index)).start();

        PHASER.awaitAdvance(PHASER.getPhase());

        System.out.println("All threads have completed their tasks.");
    }

    private record Worker(Phaser phaser, String name) implements Runnable {
        @Override
        public void run() {
            System.out.println(name + " starting phase 1");
            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " performing phase 1 tasks");

            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " starting phase 2");
            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " performing phase 2 tasks");

            phaser.arriveAndAwaitAdvance();

            System.out.println(name + " completed all phases");
            phaser.arriveAndDeregister();
        }
    }
}