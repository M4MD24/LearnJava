package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_433_minimum_genetic_mutation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G', and 'T'.
 * <br/>
 * <br/>
 * Suppose we need to investigate a mutation from a gene string startGene to a gene string endGene where one mutation is defined as one single character changed in the gene string.
 * <br/>
 * <br/>
 * For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
 * <br/>
 * <br/>
 * There is also a gene bank bank that records all the valid gene mutations. A gene must be in bank to make it a valid gene string.
 * <br/>
 * <br/>
 * Given the two gene strings startGene and endGene and the gene bank bank, return the minimum number of mutations needed to mutate from startGene to endGene. If there is no such a mutation, return -1.
 * <br/>
 * <br/>
 * Note that the starting point is assumed to be valid, so it might not be included in the bank.
 * </h2>
 */

public class MinimumGeneticMutation {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minMutation(
                "AACCGGTT",
                "AACCGGTA",
                new String[]{"AACCGGTA"}
        ));
    }

    private static int minMutation(final String START_GENE, final String END_GENE, final String[] BANK) {
        final Set<String> BANK_SET = new HashSet<>(Arrays.asList(BANK));
        if (BANK_SET.contains(END_GENE)) {
            final char[] GENE_CHOICES = {'A', 'C', 'G', 'T'};
            final Queue<String> GENES = new LinkedList<>();
            GENES.offer(START_GENE);
            int mutations = 0;
            while (!GENES.isEmpty()) {
                final int CURRENT_LEVEL_SIZE = GENES.size();
                for (int index = 0; index < CURRENT_LEVEL_SIZE; index++) {
                    final String CURRENT_GENE = GENES.poll();
                    assert CURRENT_GENE != null;
                    if (CURRENT_GENE.equals(END_GENE))
                        return mutations;
                    else {
                        final char[] CURRENT_GENE_CHARACTERS = CURRENT_GENE.toCharArray();
                        for (int indexOfCurrentGeneCharacters = 0; indexOfCurrentGeneCharacters < CURRENT_GENE_CHARACTERS.length; indexOfCurrentGeneCharacters++) {
                            char originalChar = CURRENT_GENE_CHARACTERS[indexOfCurrentGeneCharacters];
                            for (final char GENE_CHOICE : GENE_CHOICES) {
                                CURRENT_GENE_CHARACTERS[indexOfCurrentGeneCharacters] = GENE_CHOICE;
                                final String NEW_GENE = new String(CURRENT_GENE_CHARACTERS);
                                if (BANK_SET.contains(NEW_GENE)) {
                                    GENES.offer(NEW_GENE);
                                    BANK_SET.remove(NEW_GENE);
                                }
                            }
                            CURRENT_GENE_CHARACTERS[indexOfCurrentGeneCharacters] = originalChar;
                        }
                    }
                }
                mutations++;
            }
        }
        return -1;
    }
}