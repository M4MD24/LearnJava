package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_133_question_133;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find a path from top left to bottom in the right direction which minimizes the sum of all numbers along its path.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Move either down or right at any point in time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of all numbers along its path: 13</h2>
 */

public class Question133 {
    public static void main(String[] args) {
        final int[][] ORIGINAL_ARRAY = {
                {7, 4, 2},
                {0, 5, 6},
                {3, 1, 2}
        };
        System.out.print("Sum of all numbers along its path: " + minimizesSumOfAllNumbersAlongPath(ORIGINAL_ARRAY));
    }

    private static String minimizesSumOfAllNumbersAlongPath(final int[][] ORIGINAL_ARRAY) {
        String minimizesSum = null;
        int sumFirstPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[0][1] + ORIGINAL_ARRAY[0][2] + ORIGINAL_ARRAY[1][2] + ORIGINAL_ARRAY[2][2],
                sumSecondPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[0][1] + ORIGINAL_ARRAY[1][1] + ORIGINAL_ARRAY[1][2] + ORIGINAL_ARRAY[2][2],
                sumThirdPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[0][1] + ORIGINAL_ARRAY[1][1] + ORIGINAL_ARRAY[2][1] + ORIGINAL_ARRAY[2][2],
                sumFourthPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[1][0] + ORIGINAL_ARRAY[1][1] + ORIGINAL_ARRAY[1][2] + ORIGINAL_ARRAY[2][2],
                sumFifthPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[1][0] + ORIGINAL_ARRAY[1][1] + ORIGINAL_ARRAY[2][1] + ORIGINAL_ARRAY[2][2],
                sumSixthPath = ORIGINAL_ARRAY[0][0] + ORIGINAL_ARRAY[1][0] + ORIGINAL_ARRAY[2][0] + ORIGINAL_ARRAY[2][1] + ORIGINAL_ARRAY[2][2];
        boolean sumFirstPathCondition = (sumFirstPath <= sumSecondPath &&
                sumFirstPath <= sumThirdPath &&
                sumFirstPath <= sumFourthPath &&
                sumFirstPath <= sumFifthPath &&
                sumFirstPath <= sumSixthPath),
                sumSecondPathCondition = (sumSecondPath <= sumFirstPath &&
                        sumSecondPath <= sumThirdPath &&
                        sumSecondPath <= sumFourthPath &&
                        sumSecondPath <= sumFifthPath &&
                        sumSecondPath <= sumSixthPath),
                sumThirdPathCondition = (sumThirdPath <= sumFirstPath &&
                        sumThirdPath <= sumSecondPath &&
                        sumThirdPath <= sumFourthPath &&
                        sumThirdPath <= sumFifthPath &&
                        sumThirdPath <= sumSixthPath),
                sumFourthPathCondition = (sumFourthPath <= sumFirstPath &&
                        sumFourthPath <= sumSecondPath &&
                        sumFourthPath <= sumThirdPath &&
                        sumFourthPath <= sumFifthPath &&
                        sumFourthPath <= sumSixthPath),
                sumFifthPathCondition = (sumFifthPath <= sumFirstPath &&
                        sumFifthPath <= sumSecondPath &&
                        sumFifthPath <= sumThirdPath &&
                        sumFifthPath <= sumFourthPath &&
                        sumFifthPath <= sumSixthPath),
                sumSixthPathCondition = (sumSixthPath <= sumFirstPath &&
                        sumSixthPath <= sumSecondPath &&
                        sumSixthPath <= sumThirdPath &&
                        sumSixthPath <= sumFourthPath &&
                        sumSixthPath <= sumFifthPath);
        if (sumFirstPathCondition) minimizesSum = String.valueOf(sumFirstPath);
        else if (sumSecondPathCondition) minimizesSum = String.valueOf(sumSecondPath);
        else if (sumThirdPathCondition) minimizesSum = String.valueOf(sumThirdPath);
        else if (sumFourthPathCondition) minimizesSum = String.valueOf(sumFourthPath);
        else if (sumFifthPathCondition) minimizesSum = String.valueOf(sumFifthPath);
        else if (sumSixthPathCondition) minimizesSum = String.valueOf(sumSixthPath);

        return (minimizesSum == null) ? "Nothing" : minimizesSum;
    }
}
/*
0 - {0, 1, 2}
1 - {-, -, 2}
2 - {-, -, 2}
------------- (0,0),(0,1),(0,2),(1,2),(2,2)
0 - {0, 1, -}
1 - {-, 1, 2}
2 - {-, -, 2}
------------- (0,0),(0,1),(1,1),(1,2),(2,2)
0 - {0, 1, -}
1 - {-, 1, -}
2 - {-, 1, 2}
------------- (0,0),(0,1),(1,1),(2,1),(2,2)
0 - {0, -, -}
1 - {0, 1, 2}
2 - {-, -, 2}
------------- (0,0),(1,0),(1,1),(1,2),(2,2)
0 - {0, -, -}
1 - {0, 1, -}
2 - {-, 2, 2}
------------- (0,0),(1,0),(1,1),(2,1),(2,2)
0 - {0, -, -}
1 - {0, -, -}
2 - {0, 1, 2}
------------- (0,0),(1,0),(2,0),(2,1),(2,2)
*/