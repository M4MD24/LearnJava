package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_210_course_schedule_2;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <br/>
 * <br/>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * <br/>
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers, return any of them. If it is impossible to finish all courses, return an empty array.
 * </h2>
 */

public class CourseSchedule2 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(Arrays.toString(findOrder(
                4,
                new int[][]{
                        {1, 0},
                        {2, 0},
                        {3, 1},
                        {3, 2}
                })));
    }

    private static int top;

    private static int[] findOrder(final int COUNT_OF_COURSES, final int[][] PREREQUISITES) {
        top = COUNT_OF_COURSES - 1;
        final int[] POST_LIST = new int[COUNT_OF_COURSES],
                NEXT_INDEX = new int[PREREQUISITES.length],
                NEXT_NODE = new int[PREREQUISITES.length];
        Arrays.fill(POST_LIST, -1);
        int index = 0;
        for (final int[] PREREQUISITE : PREREQUISITES) {
            NEXT_INDEX[index] = POST_LIST[PREREQUISITE[1]];
            NEXT_NODE[index] = PREREQUISITE[0];
            POST_LIST[PREREQUISITE[1]] = index;
            index++;
        }
        final int[] STACK = new int[COUNT_OF_COURSES],
                VISITED = new int[COUNT_OF_COURSES];
        index = 0;
        while (index < COUNT_OF_COURSES) {
            if (0 == VISITED[index] && depthFirstSearch(index, VISITED, POST_LIST, NEXT_INDEX, NEXT_NODE, STACK))
                return new int[0];
            index++;
        }
        return STACK;
    }

    private static boolean depthFirstSearch(final int COUNT_OF_COURSES, final int[] VISITED, final int[] POST_LIST, final int[] NEXT_INDEX, final int[] NEXT_NODE, final int[] STACK) {
        VISITED[COUNT_OF_COURSES] = 1;
        for (int index = POST_LIST[COUNT_OF_COURSES]; index != -1; index = NEXT_INDEX[index]) {
            if (1 == VISITED[NEXT_NODE[index]])
                return true;
            if (0 == VISITED[NEXT_NODE[index]])
                if (depthFirstSearch(NEXT_NODE[index], VISITED, POST_LIST, NEXT_INDEX, NEXT_NODE, STACK))
                    return true;
        }
        VISITED[COUNT_OF_COURSES] = 2;
        STACK[top--] = COUNT_OF_COURSES;
        return false;
    }
}