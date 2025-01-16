package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_7_flyweight_pattern;

import java.util.HashMap;

class RectangleFactory {
    private static final HashMap<String, Rectangle> RECTANGLES = new HashMap<>();

    public static Rectangle getRectangle(String color) {
        RECTANGLES.putIfAbsent(color, new Rectangle(color));
        return RECTANGLES.get(color);
    }
}