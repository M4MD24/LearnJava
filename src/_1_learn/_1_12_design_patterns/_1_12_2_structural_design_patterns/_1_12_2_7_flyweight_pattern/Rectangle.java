package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_7_flyweight_pattern;

class Rectangle {
    private final String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public void draw(int width, int height) {
        System.out.println("Drawing Rectangle [Color: " + color + ", x: " + width + ", y: " + height + "]");
    }
}