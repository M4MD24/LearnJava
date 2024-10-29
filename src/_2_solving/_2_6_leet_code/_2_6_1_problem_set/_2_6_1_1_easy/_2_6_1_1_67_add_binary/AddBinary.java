package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_67_add_binary;

/**
 * <h1>Problem:</h1>
 * <h2>Given two binary strings a and b, return their sum as a binary string.</h2>
 */

public class AddBinary {
    public static void main(final String[] PARAMETERS) {
        System.out.print(addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        ));
    }

    private static String addBinary(final String FIRST_BINARY_NUMBER, final String SECOND_BINARY_NUMBER) {
        final StringBuilder RESULT_OF_SUM_TWO_BINARY_NUMBERS = new StringBuilder();
        int indexOfFirstNumber = FIRST_BINARY_NUMBER.length() - 1,
                indexOfSecondNumber = SECOND_BINARY_NUMBER.length() - 1;
        int carry = 0;
        while (indexOfFirstNumber >= 0 || indexOfSecondNumber >= 0 || carry > 0) {
            int sum = carry;
            if (indexOfFirstNumber >= 0)
                sum += FIRST_BINARY_NUMBER.charAt(indexOfFirstNumber--) - '0';
            if (indexOfSecondNumber >= 0)
                sum += SECOND_BINARY_NUMBER.charAt(indexOfSecondNumber--) - '0';
            RESULT_OF_SUM_TWO_BINARY_NUMBERS.append(sum % 2);
            carry = sum / 2;
        }
        return RESULT_OF_SUM_TWO_BINARY_NUMBERS.reverse().toString();
    }
}