package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_12;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the respective methods to calculate the area and perimeter of each shape.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final GeometricShape TRIANGLE = new Triangle(3, 4, 5);
        System.out.printf("■ Triangle:%nPerimeter: %f%nArea: %f",
                TRIANGLE.perimeter(),
                TRIANGLE.area());
        final GeometricShape SQUARE = new Square(2);
        System.out.printf("%n%n■ Triangle:%nPerimeter: %f%nArea: %f",
                SQUARE.perimeter(),
                SQUARE.area());
    }
}

abstract class GeometricShape {
    abstract double area();

    abstract double perimeter();
}

class Triangle extends GeometricShape {
    private final double FIRST_SIDE,
            SECOND_SIDE,
            THIRD_SIDE;

    Triangle(final double FIRST_SIDE, final double SECOND_SIDE, final double THIRD_SIDE) {
        this.FIRST_SIDE = FIRST_SIDE;
        this.SECOND_SIDE = SECOND_SIDE;
        this.THIRD_SIDE = THIRD_SIDE;
    }

    @Override
    double perimeter() {
        return FIRST_SIDE + SECOND_SIDE + THIRD_SIDE;
    }

    @Override
    double area() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}

class Square extends GeometricShape {
    final double SIDE_LENGTH;

    Square(final double SIDE_LENGTH) {
        this.SIDE_LENGTH = SIDE_LENGTH;
    }

    @Override
    double perimeter() {
        return 4 * SIDE_LENGTH;
    }

    @Override
    double area() {
        return SIDE_LENGTH * SIDE_LENGTH;
    }
}