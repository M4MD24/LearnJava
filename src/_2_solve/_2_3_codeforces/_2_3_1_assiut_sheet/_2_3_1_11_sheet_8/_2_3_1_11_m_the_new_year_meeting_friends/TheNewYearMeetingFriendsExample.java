package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_m_the_new_year_meeting_friends;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * <h1>M. The New Year: Meeting Friends</h1>
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
 * <h1>Problem:</h1>
 * <h2>
 * There are three friend living on the straight line Ox in Lineland. The first friend lives at the point x1, the second friend lives at the point x2, and the third friend lives at the point x3. They plan to celebrate the New Year together, so they need to meet at one point. What is the minimum total distance they have to travel in order to meet at some point and celebrate the New Year?
 * <br/>
 * It's guaranteed that the optimal answer is always integer.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 1 4</h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>30 20 10</h2>
 * <h1>Output:</h1>
 * <h2>20</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the first sample, friends should meet at the point 4. Thus, the first friend has to travel the distance of 3 (from the point 7 to the point 4), the second friend also has to travel the distance of 3 (from the point 1 to the point 4), while the third friend should not go anywhere because he lives at the point 4.</h2>
 */

public class TheNewYearMeetingFriendsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final SortedSet<Byte> FRIENDS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS){
        inputValues();
        printTargetPoint();
    }

    private static void printTargetPoint() {
        System.out.print(FRIENDS.getLast() - FRIENDS.getFirst());
    }

    private static void inputValues() {
        FRIENDS.add(INPUT.nextByte());
        FRIENDS.add(INPUT.nextByte());
        FRIENDS.add(INPUT.nextByte());
    }
}