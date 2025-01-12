package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products;

public class WhiteRice implements Rice {
    @Override
    public void prepare() {
        System.out.println("Preparing White Rice...");
    }
}