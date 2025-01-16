package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_4_decorator_pattern;

abstract class CoffeeDecorator implements CoffeeService {
    protected CoffeeService decoratedCoffee;

    public CoffeeDecorator(CoffeeService decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}