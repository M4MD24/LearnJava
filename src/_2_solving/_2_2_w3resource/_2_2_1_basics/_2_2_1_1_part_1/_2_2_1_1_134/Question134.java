package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_134;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find distinct ways to climb to the top ((target number) steps to reach the top) of stairs. Each time you climb, you can climb 1 or 2 steps.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Target number: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Distinct ways can you climb to the top: 8</h2>
 */

public class Question134 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        System.out.print("Target number: ");
        final int TARGET_NUMBER = INPUT.nextInt();
        System.out.print("Distinct ways can you climb to the top: " + findSumDistinctWays(TARGET_NUMBER));
    }

    private static int findSumDistinctWays(final int TARGET_NUMBER) {
        int sumDistinctWays = TARGET_NUMBER;
        if (TARGET_NUMBER > 3)
            for (int index = 3, lastLast = 2, last = 3; index < TARGET_NUMBER; index++, lastLast = last, last = sumDistinctWays)
                sumDistinctWays = lastLast + last;
        return sumDistinctWays;
    }
}

/*
target number = 1
1) 1 = 1
sum = 1

target number = 2
1) 1+1 = 2
2) 2+0 = 2
sum = 2

target number = 3
1) 1+1+1 = 3
2) 2+1+0 = 3
3) 1+2+0 = 3
sum = 3

target number = 4
1) 1+1+1+1 = 4
2) 2+1+1+0 = 4
3) 1+2+1+0 = 4
4) 1+1+2+0 = 4
5) 2+2+0+0 = 4
sum = 5

target number = 5
1) 1+1+1+1+1 = 5
2) 2+1+1+1+0 = 5
3) 1+2+1+1+0 = 5
4) 1+1+2+1+0 = 5
5) 1+1+1+2+0 = 5
6) 2+2+1+0+0 = 5
7) 2+1+2+0+0 = 5
8) 1+2+2+0+0 = 5
sum = 8

target number = 6
01) 1+1+1+1+1+1 = 6
02) 2+1+1+1+1+0 = 6
03) 1+2+1+1+1+0 = 6
04) 1+1+2+1+1+0 = 6
05) 1+1+1+2+1+0 = 6
06) 1+1+1+1+2+0 = 6
07) 2+2+1+1+0+0 = 6
08) 2+1+2+1+0+0 = 6
09) 2+1+1+2+0+0 = 6
10) 1+2+2+1+0+0 = 6
11) 1+2+1+2+0+0 = 6
12) 1+1+2+2+0+0 = 6
13) 2+2+2+0+0+0 = 6
sum = 13

target number = 7
01) 1+1+1+1+1+1+1 = 7
02) 2+1+1+1+1+1+0 = 7
03) 1+2+1+1+1+1+0 = 7
04) 1+1+2+1+1+1+0 = 7
05) 1+1+1+2+1+1+0 = 7
06) 1+1+1+1+2+1+0 = 7
07) 1+1+1+1+1+2+0 = 7
08) 2+2+1+1+1+0+0 = 7
09) 2+1+2+1+1+0+0 = 7
10) 2+1+1+2+1+0+0 = 7
11) 2+1+1+1+2+0+0 = 7
12) 1+2+2+1+1+0+0 = 7
13) 1+2+1+2+1+0+0 = 7
14) 1+2+1+1+2+0+0 = 7
15) 1+1+2+2+1+0+0 = 7
16) 1+1+2+1+2+0+0 = 7
17) 1+1+1+2+2+0+0 = 7
18) 2+2+2+1+0+0+0 = 7
19) 2+2+1+2+0+0+0 = 7
20) 2+1+2+2+0+0+0 = 7
21) 1+2+2+2+0+0+0 = 7
sum = 21
*/