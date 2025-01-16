package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions;

import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations.Pizza;

public class EgyptianRestaurant extends Restaurant {
    public EgyptianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addToppings() {
        pizza.setToppings("Cheese and Black Olives");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Tomato Sauce with Garlic");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick and Crispy");
    }
}