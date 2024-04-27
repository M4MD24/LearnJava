package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_123_question_123;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the sub-array with smallest sum from a given array of integers.</h2>
 */

enum SolutionsHeader {
    Solution1, Solution2;

    String getSolutionHeader() {
        return switch (this) {
            case Solution1 -> "■ Solution 1:";
            case Solution2 -> "\n\n■ Solution 2:";
        };
    }
}

class Solution1 extends Question123 {
    public static void mainMethod() {
        arrayLength();
        inputIndexesValuesArray();
        System.out.println("Array: " + Arrays.toString(ARRAY));
        calculateLargesSumContiguousSubArray();
    }

    private static void arrayLength() {
        System.out.print("Enter array length (Minimum array length 2): ");
        int arrayLength = input.nextInt();
        if (arrayLength > 1) {
            ARRAY_LENGTH = arrayLength;
            ARRAY = new int[ARRAY_LENGTH];
        } else arrayLength();
    }

    private static void inputIndexesValuesArray() {
        for (index = 0; index < ARRAY_LENGTH; index++) {
            System.out.print("Input index value of " + index + ": ");
            ARRAY[index] = input.nextInt();
        }
        sum = ARRAY[0] + ARRAY[1];
        from = 0;
        to = 1;
    }

    private static void calculateLargesSumContiguousSubArray() {
        for (endAt = 2; endAt < ARRAY_LENGTH; endAt++) {
            for (startAt = 0; startAt <= ARRAY_LENGTH - endAt; startAt++) {
                for (index = startAt; index <= endAt; index++) lastSum += ARRAY[index];
                if (lastSum < sum) {
                    from = startAt;
                    to = index - 1;
                    sum = lastSum;
                }
                lastSum = 0;
            }
        }
        System.out.printf("Largest sum contiguous sub-array: %d\nfrom %d to %d", sum, from, to);
    }
}

class Solution2 extends Question123 {
    public static void mainMethod() {
        addElements();
        System.out.println("ArrayList: " + arrayList);
        calculateLargesSumContiguousSubArray();
    }

    private static void addElements() {
        for (index = 0; index < ARRAY_LENGTH; index++) {
            System.out.println("Input index value of " + index + ": " + ARRAY[index]);
            arrayList.add(ARRAY[index]);
        }
        sum = arrayList.getFirst() + arrayList.get(1);
        from = 0;
        to = 1;
    }

    private static void calculateLargesSumContiguousSubArray() {
        for (endAt = 2; endAt < ARRAY_LENGTH; endAt++) {
            for (startAt = 0; startAt <= ARRAY_LENGTH - endAt; startAt++) {
                for (index = startAt; index <= endAt; index++) lastSum += ARRAY[index];
                if (lastSum < sum) {
                    from = startAt;
                    to = index - 1;
                    sum = lastSum;
                }
                lastSum = 0;
            }
        }
        System.out.printf("Largest sum contiguous sub-array: %d\nfrom %d to %d", sum, from, to);
    }
}

public class Question123 {
    static final Scanner input = new Scanner(System.in);
    static int[] ARRAY;
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static int ARRAY_LENGTH,
            index,
            from,
            to,
            lastSum,
            sum,
            startAt,
            endAt;

    public static void main(final String[] ARGS) {
        System.out.println(SolutionsHeader.Solution1.getSolutionHeader());
        Solution1.mainMethod();
        System.out.println(SolutionsHeader.Solution2.getSolutionHeader());
        Solution2.mainMethod();
    }
}