package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_82_area_or_perimeter;

public class AreaOrPerimeter {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(areaOrPerimeter(6, 10));
        System.out.println(areaOrPerimeter(3, 3));
        System.out.println(areaOrPerimeter(8, 8));
        System.out.print(areaOrPerimeter(5, 10));
    }

    private static int areaOrPerimeter(final int LENGTH, final int WIDTH) {
        return (LENGTH == WIDTH)
               ? getAreaOfSquare(LENGTH, WIDTH)
               : getPerimeterOfRectangle(LENGTH, WIDTH);
    }

    private static int getPerimeterOfRectangle(final int LENGTH, final int WIDTH) {
        return 2 * (LENGTH + WIDTH);
    }

    private static int getAreaOfSquare(final int LENGTH, final int WIDTH) {
        return LENGTH * WIDTH;
    }
}