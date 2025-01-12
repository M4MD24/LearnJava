package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.burger;

public class OrientalBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Oriental Burger...");
    }
}