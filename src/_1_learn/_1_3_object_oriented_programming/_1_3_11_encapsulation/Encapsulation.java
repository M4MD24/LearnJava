package _1_learn._1_3_object_oriented_programming._1_3_11_encapsulation;

class Rectangle {
    private float width,
            length;

    float getWidth() {
        return width;
    }

    float getLength() {
        return length;
    }

    void setWidth(float width) {
        this.width = width;
    }

    void setLength(float length) {
        this.length = length;
    }

    void displayCalculateRectangleArea() {
        float result = width * length;
        System.out.print("Rectangle Area: " + result);
    }
}

public class Encapsulation {
    public static void main(final String[] ARGUMENTS) {
        final Rectangle RECTANGLE = new Rectangle();
        RECTANGLE.setWidth(2);
        RECTANGLE.setLength(10);
        System.out.println("Width = " + RECTANGLE.getWidth());
        System.out.println("Length = " + RECTANGLE.getLength());
        RECTANGLE.displayCalculateRectangleArea();
    }
}