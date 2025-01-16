package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_4_decorator_pattern;

class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(CoffeeService decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }
}