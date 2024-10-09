package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.</h2>
 */

public class Question3 {
    private static final Rectangle RECTANGLE = new Rectangle();

    public static void main(final String[] PARAMETERS) {
        addDataRectangle();
        getInformationRectangle();
    }

    private static void getInformationRectangle() {
        System.out.printf("Width: %f%nLength: %f",
                RECTANGLE.getWidth(),
                RECTANGLE.getLength());
    }

    private static void addDataRectangle() {
        RECTANGLE.setWidth(5.5);
        RECTANGLE.setLength(10);
    }
}

class Rectangle {
    private double width,
            length;

    double getWidth() {
        return length;
    }

    void setWidth(final double LENGTH) {
        length = LENGTH;
    }

    double getLength() {
        return width;
    }

    void setLength(final double BALANCE) {
        width = BALANCE;
    }
}