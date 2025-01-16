package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.abstractions;

import _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();

    abstract void addToppings();

    abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}