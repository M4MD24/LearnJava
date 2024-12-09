package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;


public class Question9Test {
    @Test
    public void testSingletonInstance() throws InterruptedException {
        final int COUNT_OF_THREADS = 10;
        final Runnable TASK = () -> {
            final Singleton INSTANCE = Singleton.getInstance();
            assertNotNull(INSTANCE);
        };
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        for (int index = 0; index < COUNT_OF_THREADS; index++) {
            THREADS[index] = new Thread(TASK);
            THREADS[index].start();
        }
        for (final Thread THREAD : THREADS)
            THREAD.join();
        final Singleton CURRENT_INSTANCE = Singleton.getInstance();
        for (int index = 0; index < COUNT_OF_THREADS; index++)
            assertSame(CURRENT_INSTANCE, Singleton.getInstance());
    }
}
