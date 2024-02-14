package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_119_question_119;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.</h2>
 */

public class Question119 {
    final static int[] ELEMENTS = {2, 4, 6, 7, 8};
    final static int ELEMENT_TARGET = 7;
    static int index;

    public static void main(String[] args) {
        getFirstOccurrence();
    }

    private static void getFirstOccurrence() {
        for (index = 0; index < ELEMENTS.length; index++)
            if (ELEMENTS[index] == ELEMENT_TARGET) break;
        System.out.printf("position of %d is %d", ELEMENT_TARGET, index);
    }
}