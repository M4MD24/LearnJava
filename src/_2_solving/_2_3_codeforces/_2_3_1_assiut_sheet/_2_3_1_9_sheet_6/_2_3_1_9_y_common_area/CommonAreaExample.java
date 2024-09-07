package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_y_common_area;

import java.util.Scanner;

/**
 * <h1>Y. Common Area</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given N rectangles, each rectangle will be represented as two points: the lower-left point (x1,y1) and the upper right point (x2,y2). Determine the common area shared between all rectangles.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 4
 * <br/>
 * 0 0 10 10
 * <br/>
 * -1 -1 2 2
 * <br/>
 * -10 0 2 100
 * <br/>
 * -10 -10 10 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>Case #1: 4</h2>
 */

public class CommonAreaExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int COUNT_OF_TEST_CASES = INPUT.nextInt();

    public static void main(final String[] PARAMETERS) {
        inputRectangles();
    }

    private static void inputRectangles() {
        for (int testCase = 1; testCase <= COUNT_OF_TEST_CASES; testCase++) {
            final int RECTANGLES_COUNT = INPUT.nextInt();
            short maximumTopLeftFirstRectangle = Short.MIN_VALUE,
                    maximumTopLeftSecondRectangle = Short.MIN_VALUE,
                    minimumBottomRightFirstRectangle = Short.MAX_VALUE,
                    minimumBottomRightSecondRectangle = Short.MAX_VALUE;
            for (int index = 0; index < RECTANGLES_COUNT; index++) {
                final short TOP_LEFT_FIRST_RECTANGLE = INPUT.nextShort(),
                        TOP_LEFT_SECOND_RECTANGLE = INPUT.nextShort(),
                        BOTTOM_RIGHT_FIRST_RECTANGLE = INPUT.nextShort(),
                        BOTTOM_RIGHT_SECOND_RECTANGLE = INPUT.nextShort();
                if (TOP_LEFT_FIRST_RECTANGLE > maximumTopLeftFirstRectangle) maximumTopLeftFirstRectangle = TOP_LEFT_FIRST_RECTANGLE;
                if (TOP_LEFT_SECOND_RECTANGLE > maximumTopLeftSecondRectangle) maximumTopLeftSecondRectangle = TOP_LEFT_SECOND_RECTANGLE;
                if (BOTTOM_RIGHT_FIRST_RECTANGLE < minimumBottomRightFirstRectangle) minimumBottomRightFirstRectangle = BOTTOM_RIGHT_FIRST_RECTANGLE;
                if (BOTTOM_RIGHT_SECOND_RECTANGLE < minimumBottomRightSecondRectangle) minimumBottomRightSecondRectangle = BOTTOM_RIGHT_SECOND_RECTANGLE;
            }
            final int COMMON_AREA = Math.max(0, minimumBottomRightFirstRectangle - maximumTopLeftFirstRectangle) * Math.max(0, minimumBottomRightSecondRectangle - maximumTopLeftSecondRectangle);
            System.out.println("Case #" + testCase + ": " + COMMON_AREA);
        }
    }
}