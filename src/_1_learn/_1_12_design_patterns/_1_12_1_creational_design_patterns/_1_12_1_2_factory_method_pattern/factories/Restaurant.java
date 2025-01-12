package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products.Rice;

public abstract class Restaurant {
    public void orderRice() {
        System.out.println("Ordering Rice...");
        Rice rice = makeRice();
        rice.prepare();
    }
    protected abstract Rice makeRice();
}