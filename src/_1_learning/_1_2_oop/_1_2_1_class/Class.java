package _1_learning._1_2_oop._1_2_1_class;

class AnotherClass { // Class
    float addition2Numbers(final float NUMBER1, final float NUMBER2) {
        return NUMBER1 / NUMBER2;
    }
}

public class Class { // Main Class
    public static void main(String[] args) { // Main Function
        AnotherClass anotherClassObject = new AnotherClass(); // Object

        final float NUMBER1 = 10F, NUMBER2 = 3F;

        System.out.println(anotherClassObject.addition2Numbers(NUMBER1, NUMBER2));

        new AnotherClass().addition2Numbers(NUMBER1, NUMBER2); // Anonymous Object
    }
}