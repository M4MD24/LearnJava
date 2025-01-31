package _1_learn._1_6_algorithms._1_6_5_dynamic_programming._1_6_5_1_kadane;

public class KadaneExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, -2, 3, 0, 7, 8, 1, 2, -3};
        System.out.print(kadaneAlgorithm(NUMBERS));
    }

    private static int kadaneAlgorithm(final int[] NUMBERS) {
        int maxEndingHere = NUMBERS[0],
                maxSoFar = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++) {
            maxEndingHere = Math.max(
                    NUMBERS[index],
                    maxEndingHere + NUMBERS[index]
            );
            maxSoFar = Math.max(
                    maxSoFar,
                    maxEndingHere
            );
        }
        return maxSoFar;
    }
}