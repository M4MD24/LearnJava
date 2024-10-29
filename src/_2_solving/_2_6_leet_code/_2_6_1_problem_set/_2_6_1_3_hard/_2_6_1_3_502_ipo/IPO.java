package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_502_ipo;

import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Suppose LeetCode will start its IPO soon. In order to sell a good price of its shares to Venture Capital, LeetCode would like to work on some projects to increase its capital before the IPO. Since it has limited resources, it can only finish at most k distinct projects before the IPO. Help LeetCode design the best way to maximize its total capital after finishing at most k distinct projects.
 * <br/>
 * <br/>
 * You are given n projects where the ith project has a pure profit profits[i] and a minimum capital of capital[i] is needed to start it.
 * <br/>
 * <br/>
 * Initially, you have w capital. When you finish a project, you will obtain its pure profit and the profit will be added to your total capital.
 * <br/>
 * <br/>
 * Pick a list of at most k distinct projects from given projects to maximize your final capital, and return the final maximized capital.
 * <br/>
 * <br/>
 * The answer is guaranteed to fit in a 32-bit signed integer.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Note:</h1>
 * <h2>IPO (Initial Public Offering)</h2>
 */

public class IPO {
    public static void main(final String[] PARAMETERS) {
        final int MAXIMUM_PROJECTS = 2,
                initialCapital = 0;
        final int[] PROJECT_PROFITS = {1, 2, 3},
                PROJECT_CAPITALS = {0, 1, 1};
        System.out.print(findMaximizedCapital(MAXIMUM_PROJECTS, initialCapital, PROJECT_PROFITS, PROJECT_CAPITALS));
    }

    private static int findMaximizedCapital(int maximumProjects, int initialCapital, final int[] PROJECT_PROFITS, int[] PROJECT_CAPITALS) {
        System.gc();
        int countOfProjectProfits = PROJECT_PROFITS.length;
        final PriorityQueue<Integer> PROFITS = new PriorityQueue<>((firstElement, secondElement) -> secondElement - firstElement);
        while (maximumProjects > 0) {
            int pointer = 0;
            int minimumNextCapital = Integer.MAX_VALUE;
            for (int index = 0; index < countOfProjectProfits; index++)
                if (PROJECT_CAPITALS[index] <= initialCapital)
                    PROFITS.add(PROJECT_PROFITS[index]);
                else {
                    PROJECT_PROFITS[pointer] = PROJECT_PROFITS[index];
                    PROJECT_CAPITALS[pointer++] = PROJECT_CAPITALS[index];
                    minimumNextCapital = Math.min(minimumNextCapital, PROJECT_CAPITALS[index]);
                }
            countOfProjectProfits = pointer;
            while (!PROFITS.isEmpty() && maximumProjects > 0 && minimumNextCapital > initialCapital) {
                initialCapital += PROFITS.poll();
                maximumProjects--;
            }
            if (minimumNextCapital > initialCapital)
                break;
        }
        return initialCapital;
    }
}