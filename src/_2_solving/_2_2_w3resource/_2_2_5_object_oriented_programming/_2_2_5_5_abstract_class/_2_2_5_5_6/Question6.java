package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_6;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and implement the respective methods to calculate the volume and surface area of each shape.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGS) {
        sphere();
        cube();
    }

    private static void cube() {
        final Cube CUBE = new Cube(5);
        System.out.printf("■ Cube:%nVolume: %f%nSurface Area: %f",
                CUBE.calculateVolume(),
                CUBE.calculateSurfaceArea());
    }

    private static void sphere() {
        final Sphere SPHERE = new Sphere(5);
        System.out.printf("■ Sphere:%nVolume: %f%nSurface Area: %f%n%n",
                SPHERE.calculateVolume(),
                SPHERE.calculateSurfaceArea());
    }
}

abstract class Shape3D {
    abstract double calculateVolume();

    abstract double calculateSurfaceArea();
}

class Sphere extends Shape3D {
    private final double RADIUS;

    Sphere(final double RADIUS) {
        this.RADIUS = RADIUS;
    }

    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(RADIUS, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(RADIUS, 2);
    }
}

class Cube extends Shape3D {
    private final double SIDE_LENGTH;

    Cube(final double SIDE_LENGTH) {
        this.SIDE_LENGTH = SIDE_LENGTH;
    }

    @Override
    double calculateVolume() {
        return Math.pow(SIDE_LENGTH, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(SIDE_LENGTH, 2);
    }
}