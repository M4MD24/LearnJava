package _2_problem_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_2_multithreading._2_2_8_2_14;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to demonstrate the usage of the ForkJoinPool class for parallel execution of recursive tasks.</h2>
 */

public class Question14 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
        final int SUM = FORK_JOIN_POOL.invoke(new SumTask(NUMBERS, 0, NUMBERS.length));
        System.out.print("Sum of numbers: " + SUM);
    }

    private static class SumTask extends RecursiveTask<Integer> {
        private final int[] NUMBERS;
        private final int START,
                END;

        SumTask(final int[] ARRAY, final int START, final int END) {
            this.NUMBERS = ARRAY;
            this.START = START;
            this.END = END;
        }

        @Override
        protected Integer compute() {
            if (END - START <= 2) {
                int sum = 0;
                for (int index = START; index < END; index++)
                    sum += NUMBERS[index];
                return sum;
            } else {
                final int MIDDLE = START + (END - START) / 2;
                final SumTask LEFT_TASK = new SumTask(NUMBERS, START, MIDDLE),
                        RIGHT_TASK = new SumTask(NUMBERS, MIDDLE, END);
                invokeAll(LEFT_TASK, RIGHT_TASK);
                return LEFT_TASK.join() + RIGHT_TASK.join();
            }
        }
    }
}