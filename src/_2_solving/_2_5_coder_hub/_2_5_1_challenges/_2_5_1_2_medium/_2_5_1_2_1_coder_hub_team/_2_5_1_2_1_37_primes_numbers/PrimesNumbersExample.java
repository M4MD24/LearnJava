package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_37_primes_numbers;

import java.util.Arrays;

public class PrimesNumbersExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getPrimeNumbers(new int[]{73, 221, 52, 214})));
        System.out.println(Arrays.toString(getPrimeNumbers(new int[]{12, 9, 25, 6, 12, 19})));
        System.out.println(Arrays.toString(getPrimeNumbers(new int[]{1, 23, 46, 2, 4})));
        System.out.print(Arrays.toString(getPrimeNumbers(new int[]{6, 5, 100, 0})));
    }

    private static int[] getPrimeNumbers(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).filter(number -> isPrime(number)).toArray();
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