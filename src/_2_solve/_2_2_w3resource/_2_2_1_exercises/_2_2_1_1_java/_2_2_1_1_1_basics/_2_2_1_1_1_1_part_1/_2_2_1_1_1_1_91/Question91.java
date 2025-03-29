package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_91;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to measure how long code executes in nanoseconds.</h2>
 */

public class Question91 {
    public static void main(final String[] ARGUMENTS) {
        long startTime = System.nanoTime();

        System.out.println("The first 10 natural numbers are:\n");
        for (int i = 1; i <= 10; i++) System.out.println(i);

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);
    }
}