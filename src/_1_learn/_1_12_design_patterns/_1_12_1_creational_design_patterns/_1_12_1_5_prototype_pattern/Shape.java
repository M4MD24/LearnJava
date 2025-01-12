package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_5_prototype_pattern;

abstract class Shape {
    String color;

    public Shape() {
    }

    public Shape(Shape source) {
        if (source != null) {
            this.color = source.color;
        }
    }

    public abstract Shape clone();

    public void printInformation() {
        System.out.printf("""
                        Color: %s
                        """,
                color
        );
    }
}