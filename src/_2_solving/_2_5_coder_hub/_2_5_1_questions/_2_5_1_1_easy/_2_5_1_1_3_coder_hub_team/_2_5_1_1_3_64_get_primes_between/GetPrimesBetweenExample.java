package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_64_get_primes_between;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetPrimesBetweenExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(Arrays.toString(getPrimesBetween(INPUT.nextInt(), INPUT.nextInt())));
    }

    private static int[] getPrimesBetween(int firstNumber, final int SECOND_NUMBER) {
        final ArrayList<Integer> PRIMES_NUMBERS = new ArrayList<>();
        while (firstNumber <= SECOND_NUMBER) {
            if (isPrime(firstNumber))
                PRIMES_NUMBERS.add(firstNumber);
            firstNumber++;
        }
        return PRIMES_NUMBERS.stream()
                .mapToInt(Integer::intValue)
                .toArray();
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