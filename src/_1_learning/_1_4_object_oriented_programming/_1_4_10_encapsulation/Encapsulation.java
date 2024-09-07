package _1_learning._1_4_object_oriented_programming._1_4_10_encapsulation;

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

    void setHeight(float length) {
        this.length = length;
    }

    void displayCalculateRectangleArea() {
        float result = width * length;
        System.out.print("Rectangle Area: " + result);
    }
}

public class Encapsulation {
    public static void main(final String[] PARAMETERS) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(10);
        System.out.println("width = " + rectangle.getWidth());
        System.out.println("height = " + rectangle.getLength());
        rectangle.displayCalculateRectangleArea();
    }
}