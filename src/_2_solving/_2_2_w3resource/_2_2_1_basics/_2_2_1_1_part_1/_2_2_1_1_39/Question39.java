package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_39;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 123
 * <br/>
 * 124
 * <br/>
 * ...
 * <br/>
 * 431
 * <br/>
 * 432
 * <br/>
 * Total number of the three-digit-number is 24
 * </h2>
 */

public class Question39 {
    public static void main(final String[] PARAMETERS) {
        int amount = 0;

        for (int number1 = 1; number1 < 5; number1++) {
            for (int number2 = 1; number2 < 5; number2++) {
                for (int number3 = 1; number3 < 5; number3++) {
                    if (number1 != number2 && number2 != number3 && number3 != number1) {
                        amount++;
                        System.out.printf("%d %d %d\n", number1, number2, number3);
                    }
                }
            }
        }

        System.out.println("Total number of the three-digit-number is " + amount);
    }
}