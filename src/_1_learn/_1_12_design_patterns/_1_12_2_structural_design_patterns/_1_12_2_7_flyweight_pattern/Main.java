package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_7_flyweight_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        Rectangle redRectangle = RectangleFactory.getRectangle("Red");
        redRectangle.draw(10, 20);

        Rectangle blueRectangle = RectangleFactory.getRectangle("Blue");
        blueRectangle.draw(25, 35);

        Rectangle anotherRedRectangle = RectangleFactory.getRectangle("Red");
        anotherRedRectangle.draw(50, 60);
    }
}