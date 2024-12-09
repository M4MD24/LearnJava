package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_134_gas_station;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * <br/>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * <br/>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
 * </h2>
 */

public class GasStation {
    public static void main(final String[] PARAMETERS) {
        final int[] GAS = {1, 2, 3, 4, 5};
        final int[] COST = {3, 4, 5, 1, 2};
        System.out.print(canCompleteCircuit(GAS, COST));
    }

    private static int canCompleteCircuit(final int[] GAS, final int[] COST) {
        int total = 0,
                tank = 0,
                start = 0;
        for (int index = 0; index < GAS.length; index++) {
            final int DIFFERENCE = GAS[index] - COST[index];
            total += DIFFERENCE;
            tank += DIFFERENCE;
            if (tank < 0) {
                start = index + 1;
                tank = 0;
            }
        }
        return total < 0
                ? -1
                : start;
    }
}