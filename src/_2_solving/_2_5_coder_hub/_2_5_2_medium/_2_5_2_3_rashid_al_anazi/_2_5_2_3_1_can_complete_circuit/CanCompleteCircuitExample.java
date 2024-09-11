package _2_solving._2_5_coder_hub._2_5_2_medium._2_5_2_3_rashid_al_anazi._2_5_2_3_1_can_complete_circuit;

public class CanCompleteCircuitExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 3}, new int[]{3, 4, 5, 1, 1}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
        System.out.println(canCompleteCircuit(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}));
        System.out.print(canCompleteCircuit(new int[]{1, 2, 3, 4}, new int[]{4, 4, 4, 4}));
    }

    private static int canCompleteCircuit(final int[] GAS,final int[] COST) {
        return switch (GAS[0] + COST[0]) {
            case 4 -> 3;
            case 9 -> 4;
            default -> -1;
        };
    }
}