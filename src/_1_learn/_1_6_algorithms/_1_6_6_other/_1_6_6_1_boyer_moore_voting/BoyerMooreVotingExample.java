package _1_learn._1_6_algorithms._1_6_6_other._1_6_6_1_boyer_moore_voting;

public class BoyerMooreVotingExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {3, 2, 3};
        System.out.print(boyerMooreVoting(NUMBERS));
    }

    private static int boyerMooreVoting(final int[] NUMBERS) {
        int candidateMajorityElement = 0,
                countOfMajorityElement = 0;
        for (final int NUMBER : NUMBERS) {
            if (countOfMajorityElement == 0)
                candidateMajorityElement = NUMBER;
            countOfMajorityElement += (NUMBER == candidateMajorityElement)
                    ? 1
                    : -1;
        }
        return candidateMajorityElement;
    }
}