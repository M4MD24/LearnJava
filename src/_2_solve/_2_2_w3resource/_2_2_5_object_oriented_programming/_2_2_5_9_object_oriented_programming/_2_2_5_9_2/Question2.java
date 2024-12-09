package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.</h2>
 */

public class Question2 {
    private static final Dog[] DOGS = {new Dog("Max", "Labrador Retriever"), new Dog("Bella", "German Shepherd")};

    public static void main(final String[] PARAMETERS) {
        printDetailsOfDogs();
    }

    private static void printDetailsOfDogs() {
        DOGS[1].setName("Charlie");
        DOGS[1].setBreed("Golden Retriever");
        for (int index = 0; index < DOGS.length; index++) {
            System.out.println("■ " + index);
            System.out.println("Name: " + DOGS[index].getName());
            System.out.print("Breed: " + DOGS[index].getBreed());
            if (index < DOGS.length - 1)
                System.out.println("\n");
        }
    }
}

class Dog {
    private String name,
            breed;

    Dog(final String NAME, final String BREED) {
        this.name = NAME;
        this.breed = BREED;
    }

    String getName() {
        return name;
    }

    void setName(final String NAME) {
        this.name = NAME;
    }

    String getBreed() {
        return breed;
    }

    void setBreed(final String BREED) {
        this.breed = BREED;
    }
}