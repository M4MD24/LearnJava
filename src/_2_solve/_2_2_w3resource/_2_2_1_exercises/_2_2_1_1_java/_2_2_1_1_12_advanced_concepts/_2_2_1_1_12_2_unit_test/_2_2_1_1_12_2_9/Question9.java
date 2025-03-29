package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_2_unit_test._2_2_1_1_12_2_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) throws InterruptedException {
        final Runnable TASK = () -> System.out.println(Singleton.getInstance());
        final Thread[] THREADS = new Thread[10];
        for (int index = 0; index < 10; index++) {
            THREADS[index] = new Thread(TASK);
            THREADS[index].start();
        }
        for (final Thread THREAD : THREADS)
            THREAD.join();
    }
}