package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.factories;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.burger.Burger;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.burger.OrientalBurger;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.pizza.OrientalPizza;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.pizza.Pizza;

public class OrientalRestaurant extends Restaurant {
    @Override
    public Burger makeBurger() {
        return new OrientalBurger();
    }

    @Override
    public Pizza makePizza() {
        return new OrientalPizza();
    }
}