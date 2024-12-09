package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_1652_defuse_the_bomb;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You have a bomb to defuse, and your time is running out! Your informer will provide you with a circular array code of length of n and a key k.
 * <br/>
 * <br/>
 * To decrypt the code, you must replace every number. All the numbers are replaced simultaneously.
 * <br/>
 * <br/>
 * • If k > 0, replace the ith number with the sum of the next k numbers.
 * <br/>
 * <br/>
 * • If k < 0, replace the ith number with the sum of the previous k numbers.
 * <br/>
 * <br/>
 * • If k == 0, replace the ith number with 0.
 * <br/>
 * <br/>
 * As code is circular, the next element of code[n-1] is code[0], and the previous element of code[0] is code[n-1].
 * <br/>
 * <br/>
 * Given the circular array code and an integer key k, return the decrypted code to defuse the bomb!
 * </h2>
 */

public class DefuseTheBomb {
    public static void main(final String[] PARAMETERS) {
        System.out.print(Arrays.toString(decrypt(
                new int[]{5, 7, 1, 4},
                3
        )));
    }

    private static int[] decrypt(final int[] CODES, final int KEY) {
        final int[] DECRYPTED_CODE = new int[CODES.length];
        if (KEY != 0) {
            int start = 1,
                    end = KEY,
                    sum = 0;
            if (KEY < 0) {
                start = CODES.length - Math.abs(KEY);
                end = CODES.length - 1;
            }
            for (int index = start; index <= end; index++)
                sum += CODES[index];
            for (int index = 0; index < CODES.length; index++) {
                DECRYPTED_CODE[index] = sum;
                sum -= CODES[(start++) % CODES.length];
                sum += CODES[(end++ + 1) % CODES.length];
            }
        }
        return DECRYPTED_CODE;
    }

// >
    /*private static int[] decrypt(final int[] CODES, final int KEY) {
        final int CODE_LENGTH = CODES.length;
        final int[] DECRYPTED_CODE = new int[CODE_LENGTH];
        if (KEY != 0) {
            int direction = KEY > 0 ? 1 : -1;
            int absoluteKey = Math.abs(KEY);
            for (int index = 0; index < CODE_LENGTH; index++) {
                int totalSum = 0;
                for (int offset = 1; offset <= absoluteKey; offset++)
                    totalSum += CODES[(CODE_LENGTH + index + offset * direction) % CODE_LENGTH];
                DECRYPTED_CODE[index] = totalSum;
            }
        }
        return DECRYPTED_CODE;
    }*/
}