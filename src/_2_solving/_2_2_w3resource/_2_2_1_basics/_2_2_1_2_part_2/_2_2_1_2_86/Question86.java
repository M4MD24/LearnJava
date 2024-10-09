package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_86;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sum all numerical values (positive integers) embedded in a sentence.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input some text and numeric values:
 * <br/>
 * 5 apple and 10 orange are rotten in the basket
 * <br/>
 * <br/>
 * Sum of the numeric values:
 * <br/>
 * 15
 * </h2>
 */

public class Question86 {
    public static void main(final String[] PARAMETERS) {
        System.out.println("Input some text and numeric values:");
        final String TEXT = "5 apple and 10 orange are rotten in the basket";
        System.out.println(TEXT);
        System.out.printf("Sum of the numeric values: %d", getSumNumericValues(TEXT));
    }

    private static int getSumNumericValues(final String TEXT) {
        int sum = 0;
        StringBuilder digits = new StringBuilder();
        for (int round = 0; round < TEXT.length(); round++) {
            if (TEXT.charAt(round) >= '0' && TEXT.charAt(round) <= '9')
                digits.append(TEXT.charAt(round) - '0');
            else {
                if (!digits.isEmpty()) {
                    sum += Integer.parseInt(String.valueOf(digits));
                    digits = new StringBuilder();
                }
            }
        }
        return sum;
    }
}