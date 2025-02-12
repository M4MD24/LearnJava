package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_37;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find seconds since 1970.</h2>
 */

public class Question37 {
    public static void main(final String[] ARGUMENTS) {
        final long SECONDS = System.currentTimeMillis() / 1000L;
        System.out.print("Seconds since 1970: " + SECONDS);
    }
}