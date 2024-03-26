package _1_learning._1_4_object_oriented_programming._1_4_10_encapsulation;

class Rectangle {
    private float width,
            height;

    float getWidth() {
        return width;
    }

    float getHeight() {
        return height;
    }

    void setWidth(float width) {
        this.width = width;
    }

    void setHeight(float height) {
        this.height = height;
    }

    void displayCalculateRectangleArea() {
        float result = width * height;
        System.out.print("Rectangle Area: " + result);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2);
        rectangle.setHeight(10);
        System.out.println("width = " + rectangle.getWidth());
        System.out.println("height = " + rectangle.getHeight());
        rectangle.displayCalculateRectangleArea();
    }
}