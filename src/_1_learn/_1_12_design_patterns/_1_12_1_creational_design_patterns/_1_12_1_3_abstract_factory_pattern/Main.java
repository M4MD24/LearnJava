package _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern;

import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.factories.ClassicRestaurant;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.factories.OrientalRestaurant;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.factories.Restaurant;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.burger.Burger;
import _1_learn._1_12_design_patterns._1_12_1_creational_design_patterns._1_12_1_3_abstract_factory_pattern.products.pizza.Pizza;

public class Main {
    public static void main(final String[] PARAMETERS) {
        Restaurant orientalRestaurant = new OrientalRestaurant();
        Pizza orientalPizza = orientalRestaurant.makePizza();
        Burger orientalBurger = orientalRestaurant.makeBurger();
        orientalPizza.bake();
        orientalBurger.prepare();

        System.out.println("=".repeat(30));

        Restaurant classicRestaurant = new ClassicRestaurant();
        Pizza classicPizza = classicRestaurant.makePizza();
        Burger classicBurger = classicRestaurant.makeBurger();
        classicPizza.bake();
        classicBurger.prepare();
    }
}