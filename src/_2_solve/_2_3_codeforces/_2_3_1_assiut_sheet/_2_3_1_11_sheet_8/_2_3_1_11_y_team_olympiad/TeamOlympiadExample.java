package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_y_team_olympiad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * <h1>Y. Team Olympiad</h1>
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
 * <h2>The School №0 of the capital of Berland has n children studying in it. All the children in this school are gifted: some of them are good at programming, some are good at maths, others are good at PE (Physical Education). Hence, for each child we know value ti:</h2>
 * <ul>
 *     <li>ti=1, if the i-th child is good at programming.</li>
 *     <li>ti=2, if the i-th child is good at maths.</li>
 *     <li>ti=3, if the i-th child is good at PE</li>
 * </ul>
 * <h2>
 * Each child happens to be good at exactly one of these three subjects.
 * <br/>
 * The Team Scientific Decathlon Olympias requires teams of three students. The school teachers decided that the teams will be composed of three children that are good at different subjects. That is, each team must have one mathematician, one programmer and one sportsman. Of course, each child can be a member of no more than one team.
 * <br/>
 * What is the maximum number of teams that the school will be able to present at the Olympiad? How should the teams be formed for that?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * 1 3 1 3 2 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * 3 5 2
 * <br/>
 * 6 7 4
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 2 1 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 */

public class TeamOlympiadExample {
    private static final ArrayList<Short> GROUP_ONE = new ArrayList<>(),
            GROUP_TOW = new ArrayList<>(),
            GROUP_THREE = new ArrayList<>();

    public static void main(final String[] PARAMETERS) {
        inputStudentsSkills();
        printFewestMembersGroup();
    }

    private static void printFewestMembersGroup() {
        if (areGroupsEmpty()) System.out.print(0);
        else {
            final short FEWEST_MEMBERS_GROUP = (short) Math.min(GROUP_ONE.size(), Math.min(GROUP_TOW.size(), GROUP_THREE.size()));
            System.out.println(FEWEST_MEMBERS_GROUP);
            printGroupMembersBySkills(FEWEST_MEMBERS_GROUP);
        }
    }

    private static void printGroupMembersBySkills(final short FEWEST_MEMBERS_GROUP) {
        for (short index = 0; index < FEWEST_MEMBERS_GROUP; index++) {
            System.out.print(GROUP_ONE.get(index) + " " + GROUP_TOW.get(index) + " " + GROUP_THREE.get(index) + " ");
            if (index != FEWEST_MEMBERS_GROUP - 1)
                System.out.println();
        }
    }

    private static boolean areGroupsEmpty() {
        return (GROUP_ONE.isEmpty() ||
                GROUP_TOW.isEmpty() ||
                GROUP_THREE.isEmpty());
    }

    private static void inputStudentsSkills() {
        final Scanner INPUT = new Scanner(System.in);
        final short COUNT_OF_STUDENTS = INPUT.nextShort();
        for (short index = 1; index <= COUNT_OF_STUDENTS; index++) {
            switch (INPUT.nextByte()) {
                case 1 -> GROUP_ONE.add(index);
                case 2 -> GROUP_TOW.add(index);
                case 3 -> GROUP_THREE.add(index);
            }
        }
    }
}