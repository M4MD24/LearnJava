package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_o_sort_string;

import java.util.Scanner;

/**
 * <h1>O. Sort String?</h1>
 * <h2>
 * time limit per test: 7 second
 * <br/>
 * memory limit per test: 4 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N and a string S of size N. Print S after sorting it.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Don't use built-in function and it's recommended to not solve this problem with python language.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * deab
 * </h2>
 * <h1>Output:</h1>
 * <h2>abde</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * egypt
 * </h2>
 * <h1>Output:</h1>
 * <h2>egpty</h2>
 */

public class SortStringExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static final String TEXT = INPUT.next();
    private static final byte[] SORTED_TEXT_CHARACTER = new byte[26];

    public static void main(String[] args) {
        sortCharacters();
        printValues();
    }

    private static void printValues() {
        for (byte index = 0; index < 26; index++)
            while (SORTED_TEXT_CHARACTER[index]-- > 0)
                System.out.print((char) (index + 97));
    }

    private static void sortCharacters() {
        for (int index = 0; index < LENGTH; index++) {
            final byte CURRENT_CHARACTER = (byte) (TEXT.charAt(index) - 97);
            SORTED_TEXT_CHARACTER[CURRENT_CHARACTER]++;
        }
    }
}