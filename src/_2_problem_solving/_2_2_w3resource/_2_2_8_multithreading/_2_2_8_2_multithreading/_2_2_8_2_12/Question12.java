package _2_problem_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to demonstrate the usage of the Callable and Future interfaces for executing tasks asynchronously and obtaining their results.</h2>
 */

public class Question12 {
    public static void main(final String[] ARGS) {
        final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(5);
        final Callable<String> CALLABLE_TASK = () -> {
            System.out.println("Task started...");
            Thread.sleep(2000);
            System.out.println("Task finished...");
            return "";
        };
        final Future<String> FUTURE = EXECUTOR_SERVICE.submit(CALLABLE_TASK);
        try {
            final String RESULT = FUTURE.get();
            System.out.print("Result of the task: " + RESULT);
        } catch (final InterruptedException | ExecutionException INTERRUPTED_EXCEPTION_AND_EXECUTION_EXCEPTION) {
            INTERRUPTED_EXCEPTION_AND_EXECUTION_EXCEPTION.printStackTrace();
        } finally {
            EXECUTOR_SERVICE.shutdown();
        }
    }
}