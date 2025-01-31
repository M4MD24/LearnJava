package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_6_template_pattern;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Making tea:");
        BeverageMaker teaMaker = new TeaMaker();
        teaMaker.makeBeverage();

        System.out.println("=".repeat(30));

        System.out.println("Making coffee:");
        BeverageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBeverage();
    }
}