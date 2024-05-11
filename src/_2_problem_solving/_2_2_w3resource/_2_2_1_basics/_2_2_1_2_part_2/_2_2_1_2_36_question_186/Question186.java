package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_36_question_186;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check if a number is a strobogrammatic number. The number is represented as a string.
 * <br/>
 * According to Wikipedia "A strobogrammatic number is a number whose numeral is rotationally symmetric, so that it appears the same when rotated 180 degrees. In other words, the numeral looks the same right-side up and upside down (e.g., 69, 96, 1001). A strobogrammatic prime is a strobogrammatic number that is also a prime number, i.e., a number that is only divisible by one and itself (e.g., 11). It is a type of ambigram, words and numbers that retain their meaning when viewed from a different perspective, such as palindromes."
 * <br/>
 * The first few strobogrammatic numbers are:
 * <br/>
 * 0, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888, 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008, 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966, ...
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Is 9006 is Strobogrammatic? true</h2>
 */

public class Question186 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 9006;
        System.out.printf("Is %d is Strobogrammatic? %b", NUMBER, isStrobogrammatic(NUMBER));
    }

    private static boolean isStrobogrammatic(int number) {
        final String NUMBERS = String.valueOf(number);
        return !NUMBERS.contains("2") &&
                !NUMBERS.contains("3") &&
                !NUMBERS.contains("4") &&
                !NUMBERS.contains("5") &&
                !NUMBERS.contains("7") &&
                !NUMBERS.equals("6") &&
                !NUMBERS.equals("9") &&
                !NUMBERS.equals("10");
    }
}