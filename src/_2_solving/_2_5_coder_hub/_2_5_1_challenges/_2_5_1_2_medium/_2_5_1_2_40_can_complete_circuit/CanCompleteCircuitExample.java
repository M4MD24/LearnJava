package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_40_can_complete_circuit;

public class CanCompleteCircuitExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 3}, new int[]{3, 4, 5, 1, 1}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
        System.out.println(canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
        System.out.print(canCompleteCircuit(new int[]{1, 2, 3, 4}, new int[]{4, 4, 4, 4}));
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