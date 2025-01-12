package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products.Rice;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.products.WhiteRice;

public class WhiteRiceRestaurant extends Restaurant {
    @Override
    protected Rice makeRice() {
        System.out.println("Making White Rice...");
        return new WhiteRice();
    }
}