package _1_learn._1_3_object_oriented_programming._1_3_1_class_and_object;

class AnotherClass { // Class
    float addition2Numbers(final float NUMBER1, final float NUMBER2) {
        return NUMBER1 / NUMBER2;
    }
}

public class ClassAndObjectExample { // Main Class
    public static void main(final String[] ARGUMENTS) { // Main Function
        AnotherClass anotherClassObject = new AnotherClass(); // Object

        final float NUMBER1 = 10F, NUMBER2 = 3F;

        System.out.println(anotherClassObject.addition2Numbers(NUMBER1, NUMBER2));

        new AnotherClass().addition2Numbers(NUMBER1, NUMBER2); // Anonymous Object
    }
}