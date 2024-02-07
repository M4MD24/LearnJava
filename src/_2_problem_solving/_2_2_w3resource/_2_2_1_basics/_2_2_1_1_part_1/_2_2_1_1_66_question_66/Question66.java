package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_66_question_66;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the sum of the first 100 prime numbers.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Sum of the first 100 prime numbers: 1060</h2>
 */

public class Question66 {
    public static void main(String[] args) {
        int sum = 1,
                counter = 0,
                number = 0;

        while (counter < 100) {
            number++;
            if (number % 2 != 0 && isPrime(number)) {
//                System.out.print(sum + " + " + number);
                sum += number;
//                System.out.println(" = " + sum);
            }
            counter++;
        }

        System.out.print("Sum of the first 100 prime numbers: " + sum);
    }

    private static boolean isPrime(final int NUMBER) {
        for (int index = 3; index * index <= NUMBER; index += 2)
            if (NUMBER % index == 0)
                return false;
        return true;
    }
}