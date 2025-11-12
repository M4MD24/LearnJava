package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_83_calculate_parallelogram_area;

public class CalculateParallelogramArea {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(calculateParallelogramArea(1, 3));
        System.out.println(calculateParallelogramArea(-1, 2));
        System.out.println(calculateParallelogramArea(5, 10));
        System.out.print(calculateParallelogramArea(0, 7));
    }

    private static String calculateParallelogramArea(
            final int BREADTH,
            final int HEIGHT
    ) {
        return BREADTH <= 0 || HEIGHT <= 0
               ? "java.lang.Exception: Breadth and height must be positive"
               : String.valueOf(BREADTH * HEIGHT);
    }
}