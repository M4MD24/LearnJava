package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_58_factory_pattern;

import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_58_factory_pattern.files <h2>Question</h2>
 */

interface Food {
    void getType();
}

class Pizza implements Food {
    public void getType() {
        System.out.println("Someone ordered a Fast Food!");
    }
}

class Cake implements Food {
    public void getType() {
        System.out.println("Someone ordered a Dessert!");
    }
}

class FoodFactory {
    Food getFood(final String FOOD_TYPE) {
        if (FOOD_TYPE.equalsIgnoreCase("pizza"))
            return new Pizza();
        else if (FOOD_TYPE.equalsIgnoreCase("cake"))
            return new Cake();
        return null;
    }
}

public class FactoryPattern {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final FoodFactory FOOD_FACTORY = new FoodFactory();
        final String ORDER = INPUT.nextLine();
        final Food FOOD = FOOD_FACTORY.getFood(ORDER);
        System.out.println("The factory returned class " + FOOD.getClass().getSimpleName());
        FOOD.getType();
    }
}