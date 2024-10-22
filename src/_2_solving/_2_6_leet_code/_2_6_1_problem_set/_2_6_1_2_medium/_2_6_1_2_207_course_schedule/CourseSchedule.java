package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_207_course_schedule;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 * <br/>
 * <br/>
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * <br/>
 * Return true if you can finish all courses. Otherwise, return false.
 * </h2>
 */

public class CourseSchedule {
    public static void main(final String[] PARAMETERS) {
        System.out.print(canFinish(
                2,
                new int[][]{
                        {1, 0},
                        {0, 1}
                }));
    }

    private static boolean canFinish(final int TOTAL_COURSES, final int[][] PREREQUISITES) {
        final int[] LEVELS = new int[TOTAL_COURSES];
        final int NUMBER_OF_PREREQUISITES = PREREQUISITES.length;
        for (final int[] PREREQUISITE : PREREQUISITES)
            LEVELS[PREREQUISITE[1]]++;
        final boolean[] IS_VISITED = new boolean[NUMBER_OF_PREREQUISITES];
        boolean hasMoreCourses = true;
        while (hasMoreCourses) {
            hasMoreCourses = false;
            for (int index = 0; index < NUMBER_OF_PREREQUISITES; index++)
                if (!IS_VISITED[index] && LEVELS[PREREQUISITES[index][0]] == 0) {
                    IS_VISITED[index] = true;
                    LEVELS[PREREQUISITES[index][1]]--;
                    hasMoreCourses = true;
                }
        }
        for (final int DEGREE : LEVELS)
            if (DEGREE != 0)
                return false;
        System.gc();
        return true;
    }
}