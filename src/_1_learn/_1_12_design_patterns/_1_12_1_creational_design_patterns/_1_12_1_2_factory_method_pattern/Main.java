package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories.BrownRiceRestaurant;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories.Restaurant;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_2_factory_method_pattern.factories.WhiteRiceRestaurant;

public class Main {
    public static void main(final String[] ARGUMENTS) {
        Restaurant brownRiceRestaurant = new BrownRiceRestaurant();
        brownRiceRestaurant.orderRice();

        System.out.println("=".repeat(30));

        Restaurant whiteRiceRestaurant = new WhiteRiceRestaurant();
        whiteRiceRestaurant.orderRice();
    }
}