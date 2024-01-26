package _1_learning._1_2_oop._1_2_9_polymorphism;

/* Method overloading is also an example of polymorphism! */
/* The print() method is also an example of polymorphism, Because used to print values of different types like char, int, string, etc! */

// Polymorphism
class Polygon {
    public void render() {
        System.out.println("Polygon");
    }
}

class Square extends Polygon {
    public void render() {
        System.out.println("Square");
    }
}

class Circle extends Polygon {
    public void render() {
        System.out.println("Circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
//        Polymorphism
        Square square = new Square();
        square.render();
        Circle circle = new Circle();
        circle.render();

//        Polymorphism with Overloading Method
        new Polymorphism().method('a');
        new Polymorphism().method("Aa");

//        Polymorphism with Variable
        Polygon polygon;
        polygon = new Polygon();
        polygon.render();
        polygon = new Square();
        polygon.render();
        polygon = new Circle();
        polygon.render();
    }

    void method(char charVariable) {
        System.out.println(charVariable);
    }

    void method(String stringVariable) {
        System.out.println(stringVariable);
    }
}