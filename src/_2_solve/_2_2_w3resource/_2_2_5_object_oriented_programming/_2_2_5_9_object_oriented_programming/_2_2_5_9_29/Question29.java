package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_29;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods to display pet details</h2>
 */

public class Question29 {
    public static void main(final String[] ARGUMENTS) {
        dogDetails();
        birdDetails();
    }

    private static void birdDetails() {
        final Pet PET = new Pet("Lolo", Gender.Female, 3);
        final Pet.Bird BIRD = new Pet.Bird(2.25F);
        System.out.printf("""
                        Name: %s
                        Species: %s
                        Age: %d
                        Wing spin: %.2f""",
                PET.name(),
                PET.species(),
                PET.age(),
                BIRD.wingSpin());
    }

    private static void dogDetails() {
        final Pet PET = new Pet("Cooper", Gender.Male, 5);
        final Pet.Dog DOG = new Pet.Dog("Ball");
        System.out.printf("""
                        Name: %s
                        Species: %s
                        Age: %d
                        Favourite Toy: %s
                        %n""",
                PET.name(),
                PET.species(),
                PET.age(),
                DOG.favouriteToy());
    }
}

record Pet(String name, Gender species, int age) {
    record Dog(String favouriteToy) {
    }

    record Bird(float wingSpin) {
    }
}

enum Gender {
    Male,
    Female
}