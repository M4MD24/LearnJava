package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_2_bridge_pattern.implementations;

public class PepperoniPizza extends Pizza {
    @Override
    public void assemble() {
        System.out.println("Adding Sauce: " + sauce);
        System.out.println("Adding Toppings: " + toppings);
        System.out.println("Adding Pepperoni");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
}