package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_5_prototype_pattern;

class Main {
    public static void main(final String[] PARAMETERS) {
        Circle circle = new Circle();
        circle.radius = 20;
        circle.color = "Red";
        Circle anotherCircle = circle.clone();

        System.out.println("Original Circle:");
        circle.printInformation();

        System.out.println("=".repeat(30));

        System.out.println("Copy of Circle:");
        anotherCircle.printInformation();
    }
}