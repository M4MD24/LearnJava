package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_x_panoramix_s_prediction;

import java.util.Scanner;

/**
 * <h1>X. Panoramix's Prediction</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * A prime number is a number which has exactly two distinct divisors: one and itself. For example, numbers 2, 7, 3 are prime, and 1, 6, 4 are not.
 * <br/>
 * The next prime number after x is the smallest prime number greater than x. For example, the next prime number after 2 is 3, and the next prime number after 3 is 5. Note that there is exactly one next prime number after each number. So 5 is not the next prime number for 2.
 * <br/>
 * One cold April morning Panoramix predicted that soon Kakofonix will break free from his straitjacket, and this will be a black day for the residents of the Gallic countryside.
 * <br/>
 * Panoramix's prophecy tells that if some day Asterix and Obelix beat exactly x Roman soldiers, where x is a prime number, and next day they beat exactly y Roman soldiers, where y is the next prime number after x, then it's time to wait for Armageddon, for nothing can shut Kakofonix up while he sings his infernal song.
 * <br/>
 * Yesterday the Gauls beat n Roman soldiers and it turned out that the number n was prime! Today their victims were a troop of m Romans (m > n). Determine whether the Gauls should wait for the black day after today's victory of Asterix and Obelix?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 5</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 11</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 9</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * </h2>
 */

public class PanoramixSPredictionExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte FIRST_NUMBER = INPUT.nextByte(),
            SECOND_NUMBER = INPUT.nextByte();
    private static final byte NEXT_PRIME = nextPrime();

    public static void main(String[] args) {
        System.out.print(NEXT_PRIME == SECOND_NUMBER
                ? "YES"
                : "NO");
    }

    private static byte nextPrime() {
        final byte NEXT_PRIME;
        byte index = (byte) (FIRST_NUMBER + 1);
        while (true) {
            if (isPrime(index)) {
                NEXT_PRIME = index;
                break;
            }
            index++;
        }
        return NEXT_PRIME;
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 2) return true;
        else if (NUMBER == 1 || NUMBER % 2 == 0) return false;
        else {
            for (int index = 3; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0)
                    return false;
            return true;
        }
    }
}