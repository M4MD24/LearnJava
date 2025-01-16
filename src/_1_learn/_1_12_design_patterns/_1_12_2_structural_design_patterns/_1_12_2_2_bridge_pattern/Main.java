package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern;

import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions.EgyptianRestaurant;
import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions.Restaurant;
import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions.SyrianRestaurant;
import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations.PepperoniPizza;
import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations.VeggiePizza;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Restaurant americanRestaurant = new EgyptianRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        System.out.println("=".repeat(30));

        Restaurant italianRestaurant = new SyrianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}