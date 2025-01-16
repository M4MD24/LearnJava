package _1_learn._1_12_design_patterns._1_12_2_structural_design_patterns._1_12_2_4_decorator_pattern;

public class Main {
    public static void main(final String[] PARAMETERS) {
        CoffeeService coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: £" + coffee.getCost());

        CoffeeService sugarCoffee = new SugarDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + sugarCoffee.getDescription());
        System.out.println("Cost: £" + sugarCoffee.getCost());

        CoffeeService milkCoffee = new MilkDecorator(new PlainCoffee());
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: £" + milkCoffee.getCost());

        CoffeeService sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: £" + sugarMilkCoffee.getCost());
    }
}