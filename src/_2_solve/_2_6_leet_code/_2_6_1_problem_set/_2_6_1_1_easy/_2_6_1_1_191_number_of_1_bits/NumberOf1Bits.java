package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_191_number_of_1_bits;

/**
 * <h1>Problem:</h1>
 * <h2>Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).</h2>
 */

public class NumberOf1Bits {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 11;
        System.out.print(hammingWeight(NUMBER));
    }

    private static int hammingWeight(int number) {
        int count = 0;
        while (number != 0) {
            if ((number & 1) == 1)
                count++;
            number >>= 1;
        }
        return count;
    }

// >
    /*private static int hammingWeight(final int NUMBER) {
        return (int) Integer.toBinaryString(NUMBER)
                .chars()
                .filter(character -> character == '1')
                .count();
    }*/
}