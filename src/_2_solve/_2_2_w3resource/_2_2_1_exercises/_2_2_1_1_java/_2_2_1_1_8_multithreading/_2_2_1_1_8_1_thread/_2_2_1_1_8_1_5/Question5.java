package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_8_multithreading._2_2_1_1_8_1_thread._2_2_1_1_8_1_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.</h2>
 */

public class Question5 extends Thread {
    private static final int LIMIT_NUMBERS = 5,
            COUNT_OF_THREADS = 4;
    private static long sum = 0;

    public static void main(final String[] ARGUMENTS) throws InterruptedException {
        final Thread[] THREADS = new Thread[COUNT_OF_THREADS];
        final int RANGE = LIMIT_NUMBERS / COUNT_OF_THREADS;

        for (int index = 0; index < COUNT_OF_THREADS; index++) {
            final int start = index * RANGE + 1,
                    end = (index == COUNT_OF_THREADS - 1)
                            ? LIMIT_NUMBERS
                            : (index + 1) * RANGE;
            THREADS[index] = new Thread(new PrimeSumCalculator(start, end));
            THREADS[index].start();
        }

        for (final Thread THREAD : THREADS)
            THREAD.join();

        System.out.println("Sum of all prime numbers up to " + LIMIT_NUMBERS + " is: " + sum);
    }

    private static synchronized void addSum(final long PARTIAL_SUM) {
        sum += PARTIAL_SUM;
    }

    private record PrimeSumCalculator(int start, int end) implements Runnable {
        @Override
        public void run() {
            long partialSum = 0;
            for (int number = start; number <= end; number++)
                if (isPrime(number))
                    partialSum += number;
            addSum(partialSum);
        }

        private static boolean isPrime(final int NUMBER) {
            if (NUMBER == 0 || NUMBER == 1) return false;
            else if (NUMBER == 2 || NUMBER == 3) return true;
            else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
            else {
                for (int index = 5; index * index <= NUMBER; index += 2)
                    if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0)
                        return false;
                return true;
            }
        }
    }
}