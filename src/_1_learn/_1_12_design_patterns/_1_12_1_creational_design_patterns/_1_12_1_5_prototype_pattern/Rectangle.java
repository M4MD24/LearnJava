package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_5_prototype_pattern;

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle() {
    }

    private Rectangle(Rectangle source) {
        super(source);
        if (source != null) {
            this.width = source.width;
            this.height = source.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}