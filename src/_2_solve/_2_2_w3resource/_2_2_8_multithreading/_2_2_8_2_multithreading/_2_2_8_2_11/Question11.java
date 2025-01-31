package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_11;

import java.util.concurrent.Exchanger;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that utilizes the Exchanger class for exchanging data between two threads.</h2>
 */

public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        final Exchanger<String> EXCHANGER = new Exchanger<>();
        final int LIMIT = 4;
        for (int index = 0; index < LIMIT; index++)
            new Thread(new Worker(EXCHANGER, "Data from Thread " + index)).start();
    }

    private record Worker(Exchanger<String> exchanger, String data) implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " sending data: " + data);
                final String RECEIVED_DATA = exchanger.exchange(data);
                System.out.println(Thread.currentThread().getName() + " received data: " + RECEIVED_DATA);
            } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                INTERRUPTED_EXCEPTION.printStackTrace();
            }
        }
    }
}