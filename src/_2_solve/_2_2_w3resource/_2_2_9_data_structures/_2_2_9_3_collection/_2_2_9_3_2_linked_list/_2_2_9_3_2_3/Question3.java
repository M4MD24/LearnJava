package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_3;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to iterate through all elements in a linked list starting at the specified position.</h2>
 */

public class Question3 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        printAllColorCodes();
    }

    private static void printAllColorCodes() {
        final Iterator<String> SUB_OF_COLORS_CODES = COLORS_CODES.listIterator(2);
        while (SUB_OF_COLORS_CODES.hasNext())
            System.out.print(SUB_OF_COLORS_CODES.next() + ' ');
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("00fF00");
        addColorCode("2d2d2d");
        addColorCode("0000Ff");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}