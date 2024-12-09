package _2_solve._2_2_w3resource._2_2_8_multithreading._2_2_8_1_thread._2_2_8_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that creates two threads to find and print even and odd numbers from 1 to 20.</h2>
 */

public class Question2 extends Thread {
    private static final int MAX_NUMBERS = 20,
            MAX_SPACES_OF_MAX_NUMBERS = String.valueOf(MAX_NUMBERS).length();
    private static final Object LOCK = new Object();
    private static boolean isOddTurn = true;
    private static Thread oddNumbersThread,
            evenNumbersThread;

    public static void main(final String[] PARAMETERS) {
        findNumbers();
        runThreads();
    }

    private static void findNumbers() {
        findOddNumbers();
        findEvenNumbers();
    }

    private static void runThreads() {
        oddNumbersThread.start();
        evenNumbersThread.start();
    }

    private static void findOddNumbers() {
        oddNumbersThread = new Thread(() -> {
            for (int oddNumber = 1; oddNumber <= MAX_NUMBERS; oddNumber += 2) {
                synchronized (LOCK) {
                    while (!isOddTurn) {
                        try {
                            LOCK.wait();
                        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                            INTERRUPTED_EXCEPTION.printStackTrace();
                        }
                    }
                    System.out.printf("%" + MAX_SPACES_OF_MAX_NUMBERS + "d : Odd  Number\n", oddNumber);
                    isOddTurn = false;
                    LOCK.notify();
                }
            }
        });
    }

    private static void findEvenNumbers() {
        evenNumbersThread = new Thread(() -> {
            for (int evenNumber = 2; evenNumber <= MAX_NUMBERS; evenNumber += 2) {
                synchronized (LOCK) {
                    while (isOddTurn) {
                        try {
                            LOCK.wait();
                        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
                            INTERRUPTED_EXCEPTION.printStackTrace();
                        }
                    }
                    System.out.printf("%" + MAX_SPACES_OF_MAX_NUMBERS + "d : Even Number\n", evenNumber);
                    isOddTurn = true;
                    LOCK.notify();
                }
            }
        });
    }
}