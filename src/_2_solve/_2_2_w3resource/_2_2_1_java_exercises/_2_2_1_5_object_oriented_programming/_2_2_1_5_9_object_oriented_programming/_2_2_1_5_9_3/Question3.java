package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Rectangle" with width and length attributes. Calculate the area and perimeter of the rectangle.</h2>
 */

public class Question3 {
    private static final Rectangle[] RECTANGLES = {new Rectangle(2, 5), new Rectangle(3, 8)};

    public static void main(final String[] ARGUMENTS) {
        printDetailsOfRectangles();
    }

    private static void printDetailsOfRectangles() {
        RECTANGLES[1].setWidth(7);
        RECTANGLES[1].setLength(4);
        for (int index = 0; index < RECTANGLES.length; index++) {
            System.out.println("■ " + index);
            System.out.println("Width: " + RECTANGLES[index].getWidth());
            System.out.println("Length: " + RECTANGLES[index].getLength());
            System.out.println("Area: " + RECTANGLES[index].getArea());
            System.out.print("Perimeter: " + RECTANGLES[index].getPerimeter());
            if (index < RECTANGLES.length - 1)
                System.out.println("\n");
        }
    }
}

class Rectangle {
    private float width,
            length;

    Rectangle(final float width, final float length) {
        this.width = width;
        this.length = length;
    }

    float getArea() {
        return width * length;
    }

    float getPerimeter() {
        return (width + length) * 2;
    }

    float getWidth() {
        return width;
    }

    void setWidth(final float WIDTH) {
        this.width = WIDTH;
    }

    float getLength() {
        return length;
    }

    void setLength(final float LENGTH) {
        this.length = LENGTH;
    }
}