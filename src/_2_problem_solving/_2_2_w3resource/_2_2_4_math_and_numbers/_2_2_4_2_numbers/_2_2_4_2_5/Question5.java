package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_5;

import java.math.BigInteger;
import java.util.*;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to find the number of seed Lychrel number candidates and related numbers for n in the range 1..10000 inclusive. (With a 500-iteration limit).
 * <br/>
 * A Lychrel number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 196-algorithm, after the most famous number associated with the process.
 * <br/>
 * The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887, ... .
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 5 Lychrel seeds: [196, 879, 1997, 7059, 9999]
 * <br/>
 * 244 Lychrel related
 * <br/>
 * 5 Lychrel palindromes: [196, 879, 1997, 7059, 9999]
 * </h2>
 */
public class Question5 {
    private static final Map<BigInteger, Tuple> TEMPORARY_NUMBERS = new HashMap<>();

    private static BigInteger reverseNumber(final BigInteger NUMBER) {
        return new BigInteger(new StringBuilder(NUMBER.toString()).reverse().toString());
    }

    private static Tuple getTuple(BigInteger number) {
        Tuple tuple;
        if ((tuple = TEMPORARY_NUMBERS.get(number)) != null)
            return tuple;

        BigInteger reversedNumber = reverseNumber(number);
        tuple = new Tuple(true, number);
        final List<BigInteger> SEEN_NUMBERS = new ArrayList<>();
        for (int index = 0; index < 500; index++) {
            number = number.add(reversedNumber);
            reversedNumber = reverseNumber(number);
            if (number.equals(reversedNumber)) {
                tuple = new Tuple(false, BigInteger.ZERO);
                break;
            }
            if (TEMPORARY_NUMBERS.containsKey(number)) {
                tuple = TEMPORARY_NUMBERS.get(number);
                break;
            }
            SEEN_NUMBERS.add(number);
        }
        for (final BigInteger NUMBER : SEEN_NUMBERS)
            TEMPORARY_NUMBERS.put(NUMBER, tuple);
        return tuple;
    }

    public static void main(final String[] ARGS) {
        final List<BigInteger> SEED_NUMBERS = new ArrayList<>(),
                RELATED_NUMBERS = new ArrayList<>(),
                PALINDROME_NUMBERS = new ArrayList<>();
        for (int index = 1; index <= 10_000; index++) {
            final BigInteger NUMBER = BigInteger.valueOf(index);
            final Tuple TUPLE = getTuple(NUMBER);
            if (!TUPLE.FLAG)
                continue;
            if (NUMBER.equals(TUPLE.NUMBER))
                SEED_NUMBERS.add(TUPLE.NUMBER);
            else
                RELATED_NUMBERS.add(TUPLE.NUMBER);
            if (NUMBER.equals(TUPLE.NUMBER))
                PALINDROME_NUMBERS.add(TUPLE.NUMBER);
        }
        System.out.printf("%d Lychrel seeds: %s%n", SEED_NUMBERS.size(), SEED_NUMBERS);
        System.out.printf("%d Lychrel related%n", RELATED_NUMBERS.size());
        System.out.printf("%d Lychrel palindromes: %s", PALINDROME_NUMBERS.size(), PALINDROME_NUMBERS);
    }
}

class Tuple {
    final Boolean FLAG;
    final BigInteger NUMBER;

    Tuple(final boolean FLAG, final BigInteger NUMBER) {
        this.FLAG = FLAG;
        this.NUMBER = NUMBER;
    }
}