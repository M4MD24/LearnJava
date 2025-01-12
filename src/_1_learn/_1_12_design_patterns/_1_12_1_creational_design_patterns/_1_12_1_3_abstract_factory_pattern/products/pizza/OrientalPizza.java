package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.pizza;

public class OrientalPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking Oriental Pizza...");
    }
}