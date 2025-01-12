package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products.BrownRice;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products.Rice;

public class BrownRiceRestaurant extends Restaurant {
    @Override
    protected Rice makeRice() {
        System.out.println("Making Brown Rice...");
        return new BrownRice();
    }
}