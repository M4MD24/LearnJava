package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_object_oriented_programming._2_2_5_6_17;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Animal" with attributes for type, species, and methods for adding and remove animal.</h2>
 */

public class Question17 {
    public static void main(final String[] ARGS) {
        final Zoo ZOO = new Zoo();
        ZOO.addAnimal("Mammal", "Lion");
        ZOO.addAnimal("Bird", "Eagle");

        System.out.println("All animals in the zoo:");
        ZOO.displayAnimals();

        ZOO.removeAnimal(0);
        System.out.println("\nAfter removing an animal:");

        ZOO.displayAnimals();
    }
}

class Animal {
    private final String SPECIES,
            TYPE;

    Animal(final String SPECIES, final String TYPE) {
        this.TYPE = TYPE;
        this.SPECIES = SPECIES;
    }

    @Override
    public String toString() {
        return "Animal{\n" +
                "species= '" + SPECIES + "',\n" +
                "type= '" + TYPE + "'\n" +
                '}';
    }
}

class Zoo {
    private final List<Animal> ANIMALS = new ArrayList<>();

    void addAnimal(final String TYPE, final String SPECIES) {
        ANIMALS.add(new Animal(SPECIES, TYPE));
    }

    void removeAnimal(final int INDEX) {
        if (INDEX >= 0 && INDEX < ANIMALS.size())
            ANIMALS.remove(INDEX);
        else
            System.out.println("Invalid index. Animal not removed.");
    }

    void displayAnimals() {
        for (final Animal ANIMAL : ANIMALS)
            System.out.println(ANIMAL);
    }
}