package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_4_decorator_pattern;

class PlainCoffee implements CoffeeService {
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}