package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_8;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program demonstrating how to access a map concurrently using the ConcurrentHashMap class.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final ConcurrentHashMap<String, Integer> CONCURRENT_HASH_MAP = new ConcurrentHashMap<>();
        final ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int index = 0; index < 10; index++) {
            final int THREAD_ID = index;
            executorService.submit(() -> {
                for (int round = 0; round < 10; round++) {
                    final String key = "key" + round;
                    CONCURRENT_HASH_MAP.put(key, CONCURRENT_HASH_MAP.getOrDefault(key, 0) + 1);
                    System.out.println("Thread " + THREAD_ID + " updated " + key + " to " + CONCURRENT_HASH_MAP.get(key));
                }
            });
        }

        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS))
                executorService.shutdownNow();
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("Final map contents:");
        CONCURRENT_HASH_MAP.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}