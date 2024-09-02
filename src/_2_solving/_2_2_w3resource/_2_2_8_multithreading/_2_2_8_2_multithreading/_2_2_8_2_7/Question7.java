package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_7;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to illustrate the usage of the ReadWriteLock interface for concurrent read-write access to a shared resource.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        final Runnable READ_TASK = () -> {
            for (int index = 0; index < 2; index++)
                SharedResource.readData();
        };

        final Runnable WRITE_TASK = () -> {
            for (int index = 0; index < 10; index++)
                SharedResource.writeData(index);
        };

        new Thread(WRITE_TASK, "WriterThread").start();
        new Thread(READ_TASK, "FirstReaderThread").start();
        new Thread(READ_TASK, "SecondReaderThread2").start();
    }
}


class SharedResource {
    private static int data = 0;
    private static final ReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();

    static void readData() {
        READ_WRITE_LOCK.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is reading the data: " + data);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            READ_WRITE_LOCK.readLock().unlock();
        }
    }

    static void writeData(final int VALUE) {
        READ_WRITE_LOCK.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is writing the data: " + VALUE);
            data = VALUE;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            READ_WRITE_LOCK.writeLock().unlock();
        }
    }
}