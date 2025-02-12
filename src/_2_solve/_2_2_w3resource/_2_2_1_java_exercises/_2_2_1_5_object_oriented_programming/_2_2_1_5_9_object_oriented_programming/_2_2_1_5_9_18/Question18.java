package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_9_object_oriented_programming._2_2_1_5_9_18;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.</h2>
 */

public class Question18 {
    private static final Restaurant RESTAURANT = new Restaurant();

    public static void main(final String[] ARGUMENTS) {
        addItems();
        RESTAURANT.removeItem("Fish");
        RESTAURANT.getItem("Meat").editPrice(50);
        RESTAURANT.getItem("Meat").editRating(2, 5);
        RESTAURANT.printMenuItem();
    }

    private static void addItems() {
        final Item MEAT = new Item("Meat", 52);
        MEAT.addRating(2);
        MEAT.addRating(5);
        MEAT.addRating(3);
        RESTAURANT.addItem(MEAT);

        final Item FISH = new Item("Fish", 46);
        FISH.addRating(4);
        FISH.addRating(4);
        FISH.addRating(2);
        RESTAURANT.addItem(FISH);

        final Item CHICKEN = new Item("Chicken", 51);
        CHICKEN.addRating(4);
        CHICKEN.addRating(4);
        CHICKEN.addRating(2);
        RESTAURANT.addItem(CHICKEN);
    }
}

class Restaurant {
    private final ArrayList<Item> MENU_ITEMS = new ArrayList<>();

    void addItem(final Item ITEM) {
        MENU_ITEMS.add(ITEM);
    }

    void removeItem(final String NAME) {
        for (int index = 0; index < MENU_ITEMS.size(); index++)
            if (MENU_ITEMS.get(index).getName().equals(NAME))
                MENU_ITEMS.remove(index);
    }

    Item getItem(final String NAME) {
        for (final Item ITEM : MENU_ITEMS)
            if (ITEM.getName().equals(NAME))
                return ITEM;
        return null;
    }

    void printMenuItem() {
        for (int index = 0; index < MENU_ITEMS.size(); index++) {
            System.out.print(MENU_ITEMS.get(index).getItemInformation());
            if (index < MENU_ITEMS.size() - 1)
                System.out.println("\n");
        }
    }
}

class Item {
    private final String NAME;
    private float price;
    private final ArrayList<Float> RATINGS = new ArrayList<>();

    Item(final String NAME, final float PRICE) {
        this.NAME = NAME;
        price = PRICE;
    }

    String getName() {
        return NAME;
    }

    float getPrice() {
        return price;
    }

    void editPrice(final float PRICE) {
        price = PRICE;
    }

    ArrayList<Float> getRatings() {
        return RATINGS;
    }

    void addRating(final float RATING) {
        if (RATING > 5)
            System.out.println("The rating must be between 1 to 5");
        else
            RATINGS.add(RATING);
    }

    void editRating(final float RATING_TARGET, final float NEW_RATING) {
        RATINGS.set(RATINGS.indexOf(RATING_TARGET), NEW_RATING);
    }

    float calculateAverage() {
        float sumOfTotalRatings = 0;
        for (final float RATING : getRatings())
            sumOfTotalRatings += RATING;
        final int COUNT_OF_RATINGS = RATINGS.size();
        return sumOfTotalRatings / COUNT_OF_RATINGS;
    }

    String getItemInformation() {
        return "Name: " + getName() +
                "\nPrice: £" + getPrice() +
                "\nRatings Average: 5/" + calculateAverage();
    }
}