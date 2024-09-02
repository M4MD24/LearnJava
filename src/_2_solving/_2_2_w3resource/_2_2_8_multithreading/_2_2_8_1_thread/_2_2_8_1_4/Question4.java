package _2_solving._2_2_w3resource._2_2_8_multithreading._2_2_8_1_thread._2_2_8_1_4;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that performs matrix multiplication using multiple threads.</h2>
 */

public class Question4 extends Thread {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int ROW_1 = INPUT.nextInt(),
            COLUMN_1 = INPUT.nextInt();
    private static final int[][] MATRIX_1 = new int[ROW_1][COLUMN_1];

    static {
        inputMatrixValues(MATRIX_1, ROW_1, COLUMN_1);
    }

    private static final int ROW_2 = INPUT.nextInt(),
            COLUMN_2 = INPUT.nextInt();
    private static final int[][] MATRIX_2 = new int[ROW_2][COLUMN_2];

    static {
        inputMatrixValues(MATRIX_2, ROW_2, COLUMN_2);
    }

    private static final int[][] RESULT_MATRIX = new int[ROW_1][COLUMN_2];

    public static void main(final String[] ARGS) {
        if (COLUMN_1 != ROW_2) {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }

        multiplyMatrices();
        printResultMatrix();
    }

    private static void inputMatrixValues(final int[][] MATRIX, final int ROWS,final int COLUMNS) {
        for (int row = 0; row < ROWS; row++)
            for (int column = 0; column < COLUMNS; column++)
                MATRIX[row][column] = INPUT.nextInt();
    }

    private static void multiplyMatrices() {
        final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(ROW_1);

        for (int row = 0; row < ROW_1; row++) {
            final int ROW_INDEX = row;
            EXECUTOR_SERVICE.execute(() -> calculateRow(ROW_INDEX));
        }

        EXECUTOR_SERVICE.shutdown();
        try {
            EXECUTOR_SERVICE.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            Thread.currentThread().interrupt();
        }
    }

    private static void calculateRow(final int ROW) {
        for (int column = 0; column < COLUMN_2; column++)
            for (int index = 0; index < COLUMN_1; index++)
                RESULT_MATRIX[ROW][column] += MATRIX_1[ROW][index] * MATRIX_2[index][column];
    }

    private static void printResultMatrix() {
        for (int row = 0; row < ROW_1; row++) {
            for (int column = 0; column < COLUMN_2; column++)
                System.out.print(RESULT_MATRIX[row][column] + " ");
            System.out.println();
        }
    }
}