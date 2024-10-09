package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_15;

import java.util.concurrent.locks.StampedLock;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that utilizes the StampedLock class for optimizing concurrent read-write access to a shared resource.</h2>
 */

public class Question15 {
    public static void main(final String[] PARAMETERS) {
        final SharedResource SHARED_RESOURCE = new SharedResource();
        new Thread(() -> {
            SHARED_RESOURCE.setValue(42);
            System.out.println("Writer thread: " + Thread.currentThread().getName() + " set value to 42");
        }).start();
        for (int index = 0; index < 5; index++) {
            new Thread(() -> {
                final int VALUE = SHARED_RESOURCE.getValue();
                System.out.println("Reader thread: " + Thread.currentThread().getName() + ", value: " + VALUE);
            }).start();
        }
    }
}

class SharedResource {
    private static int value;
    private static final StampedLock LOCK = new StampedLock();

    int getValue() {
        long stamp = LOCK.tryOptimisticRead();
        int currentValue = value;
        if (!LOCK.validate(stamp)) {
            stamp = LOCK.readLock();
            try {
                currentValue = value;
            } finally {
                LOCK.unlockRead(stamp);
            }
        }
        return currentValue;
    }

    void setValue(final int VALUE) {
        final long STAMP = LOCK.writeLock();
        try {
            value = VALUE;
        } finally {
            LOCK.unlockWrite(STAMP);
        }
    }
}