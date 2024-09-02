package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_8_question_158;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a two-dimensional array (m x m) A[][] such that A[i][j] is false if I and j are prime otherwise A[i][j] becomes true.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * 3 3
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * true true true
 * <br/>
 * true true true
 * <br/>
 * true true false
 * </h2>
 */

public class Question158 {
    private static final int ROWS = 3, COLUMNS = 3;

    public static void main(final String[] ARGS) {
        printIsNotPrime(0, 0, ROWS * COLUMNS);
    }

    private static String printIsNotPrime(int row, int column, long index) {
        if (index > 1) {
            if (column + 1 != COLUMNS) {
                System.out.print(STR."\{!isPrime(row) || !isPrime(column)} ");
                return printIsNotPrime(row, ++column, --index);
            } else {
                System.out.println(STR."\{!isPrime(row) || !isPrime(column)}");
                return printIsNotPrime(++row, 0, --index);
            }
        } else {
            System.out.print(STR."\{!isPrime(row) || !isPrime(column)}");
            return "";
        }
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 0 || NUMBER == 1) return false;
        else if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}