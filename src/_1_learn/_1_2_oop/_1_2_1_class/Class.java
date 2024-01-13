package _1_learn._1_2_oop._1_2_1_class;

class AnotherClass { // Class
    float addition2Numbers(final float NUMBER_1, final float NUMBER_2) {
        return NUMBER_1 / NUMBER_2;
    }
}

public class Class { // Main Class
    public static void main(String[] args) { // Main Function
        AnotherClass anotherClassObject = new AnotherClass(); // Object

        final float NUMBER1 = 10F, NUMBER_2 = 3F;

        System.out.println(anotherClassObject.addition2Numbers(NUMBER1, NUMBER_2));
    }
}