package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_8_multithreading._2_2_1_8_1_thread._2_2_1_8_1_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.</h2>
 */

public class Question1 extends Thread {
    public static void main(final String[] ARGUMENTS) {
        final Question1 THE_THREAD = new Question1();
        THE_THREAD.start();
    }

    @Override
    public void run() {
        System.out.print("Hello, World!");
    }
}