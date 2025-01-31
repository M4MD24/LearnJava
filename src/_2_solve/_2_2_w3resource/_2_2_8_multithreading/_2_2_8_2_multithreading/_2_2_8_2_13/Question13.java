package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_13;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that uses the ScheduledExecutorService interface to schedule tasks for execution at a specified time or with a fixed delay.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newScheduledThreadPool(1);
        SCHEDULED_EXECUTOR_SERVICE.schedule(new Task(), 2, TimeUnit.SECONDS);
        SCHEDULED_EXECUTOR_SERVICE.scheduleAtFixedRate(new Task(), 3, 5, TimeUnit.SECONDS);
        try {
            Thread.sleep(15000);
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
        SCHEDULED_EXECUTOR_SERVICE.shutdown();
    }

    private static class Task implements Runnable {
        @Override
        public void run() {
            System.out.println("Task executed at: " + new Date());
        }
    }
}