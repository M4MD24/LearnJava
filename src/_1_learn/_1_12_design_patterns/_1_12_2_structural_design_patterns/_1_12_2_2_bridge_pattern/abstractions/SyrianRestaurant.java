package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions;

import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations.Pizza;

public class SyrianRestaurant extends Restaurant {
    public SyrianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Lamb and Pine Nuts");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Yogurt and Tahini Sauce");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Soft and Thin");
    }
}