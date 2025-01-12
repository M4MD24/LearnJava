package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_5_prototype_pattern;

class Circle extends Shape {
    double radius;

    public Circle() {
    }

    private Circle(Circle source) {
        super(source);
        if (source != null) {
            this.radius = source.radius;
        }
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}