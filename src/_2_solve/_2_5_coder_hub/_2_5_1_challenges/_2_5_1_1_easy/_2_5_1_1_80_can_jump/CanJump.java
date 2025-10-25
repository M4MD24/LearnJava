package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_80_can_jump;

public class CanJump {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(canJump(new int[] {2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[] {3, 2, 1, 0, 4}));
        System.out.println(canJump(new int[] {0}));
        System.out.print(canJump(new int[] {2, 0, 0}));
    }

    private static boolean canJump(final int[] JUMPS) {
        int farthest = 0;
        for (int index = 0; index < JUMPS.length; index++) {
            if (index > farthest)
                return false;
            farthest = Math.max(
                    farthest,
                    index + JUMPS[index]
            );
            if (farthest >= JUMPS.length - 1)
                return true;
        }
        return true;
    }
}